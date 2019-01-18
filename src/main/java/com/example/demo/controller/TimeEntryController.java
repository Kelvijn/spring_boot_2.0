package com.example.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.harvest.api.time.TestHasOne;
import com.example.demo.harvest.api.time.TestOther;
import com.example.demo.harvest.api.time.TimeEntry;
import com.example.demo.repository.TestHasOneRepository;
import com.example.demo.repository.TestOtherRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@RestController
public class TimeEntryController {

	@Autowired
	private TestHasOneRepository testRepository;
	@Autowired
	private TestOtherRepository testOtherRepository;
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public static final String HARVEST_URL = "https://api.harvestapp.com/api/v2";
	public static final String HARVEST_ACCOUNT_ID = "706371";
	public static final String HARVEST_USER_AGENT = "Harvest API Example";
	public static final String HARVEST_AUTHORISATION = "Bearer 1135070.pt.30-WLK8yelBHjjYKSYR1JvWSx0K5FR1JCzK_CLwt7FHimzkGgPAJ6hXdgwSof16bBGLnh75RJHaMllznuCwVuA";

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/relation")
	public String relationTest() {
		testOtherRepository.deleteAll();
		testRepository.deleteAll();

		TestOther testOther1 = new TestOther(999, "calvin");

		TestOther result1 = testOtherRepository.save(testOther1);

		TestHasOne test1 = new TestHasOne(1, "swinnen", result1);
		TestHasOne test2 = new TestHasOne(1, "swinnen", result1);
		TestHasOne test3 = new TestHasOne(1, "swinnen", result1);

		TestHasOne restult2 = testRepository.save(test1);
		TestHasOne restult3 = testRepository.save(test2);
		TestHasOne restult4 = testRepository.save(test3);

		List<TestHasOne> list = testRepository.findByTestOther(result1);
		Iterable<TestHasOne> resultFromDb1 = testRepository.findAll();
		return resultFromDb1.toString();
	}

	@RequestMapping("/timeEntry")
	public String test() {
		HttpResponse<JsonNode> jsonResponse;

		try {
			Unirest.setDefaultHeader("User-Agent", HARVEST_USER_AGENT);
			Unirest.setDefaultHeader("Authorization", HARVEST_AUTHORISATION);
			Unirest.setDefaultHeader("Harvest-Account-ID", HARVEST_ACCOUNT_ID);

			HttpResponse<String> response = Unirest.get(HARVEST_URL + "/time_entries").asString();
			HttpResponse<JsonNode> responseJson = Unirest.get(HARVEST_URL + "/time_entries").asJson();

			JSONObject object = responseJson.getBody().getObject();

			JSONArray timeEntries = object.getJSONArray("time_entries");
			JSONObject firstTimeEntry = timeEntries.getJSONObject(0);

			try {
				ObjectMapper mapper = new ObjectMapper();
				TimeEntry convertedTimeEntry = mapper.readValue(firstTimeEntry.toString(), TimeEntry.class);
				System.out.println("converted TimeEntry info: " + convertedTimeEntry.toString());
//				TimeEntry t = timeEntryRepository.save(convertedTimeEntry);
//				for (TimeEntry timeEntry : timeEntryRepository.findAll()) {
//					log.info(timeEntry.toString());
//				}

			} catch (JsonParseException e) {
//				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			responseJson.getBody();
			return response.getBody();

		} catch (UnirestException e) {
			e.printStackTrace();
		}

		return "not found";

	}

}
