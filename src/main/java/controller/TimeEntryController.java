package controller;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import harvest.api.time.TimeEntry;
import model.Greeting;

@RestController
public class TimeEntryController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public static final String HARVEST_URL = "https://api.harvestapp.com/api/v2";
	public static final String HARVEST_ACCOUNT_ID = "706371";
	public static final String HARVEST_USER_AGENT = "Harvest API Example";
	public static final String HARVEST_AUTHORISATION = "Bearer 1135070.pt.30-WLK8yelBHjjYKSYR1JvWSx0K5FR1JCzK_CLwt7FHimzkGgPAJ6hXdgwSof16bBGLnh75RJHaMllznuCwVuA";

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/test")
	public String test() {
		HttpResponse<JsonNode> jsonResponse;

		try {
			Unirest.setDefaultHeader("User-Agent", HARVEST_USER_AGENT);
			Unirest.setDefaultHeader("Authorization", HARVEST_AUTHORISATION);
			Unirest.setDefaultHeader("Harvest-Account-ID", HARVEST_ACCOUNT_ID);

			HttpResponse<String> response = Unirest.get(HARVEST_URL + "/time_entries").asString();
			HttpResponse<JsonNode> responseJson = Unirest.get(HARVEST_URL + "/time_entries").asJson();

			JSONObject object = responseJson.getBody().getObject();
//			JSONObject location = object.getJSONObject("time_entries");

			JSONArray timeEntries = object.getJSONArray("time_entries");
			JSONObject firstTimeEntry = timeEntries.getJSONObject(0);
			System.out.println(timeEntries.length());

			try {
				ObjectMapper mapper = new ObjectMapper();
				TimeEntry convertedTimeEntry = mapper.readValue(firstTimeEntry.toString(), TimeEntry.class);
				System.out.println("converted TimeEntry info: " + convertedTimeEntry.toString());
			} catch (JsonParseException e) {
				e.printStackTrace();
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

		return null;

	}

}
