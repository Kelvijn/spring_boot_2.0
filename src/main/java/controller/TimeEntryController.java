package controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

			jsonResponse = Unirest.get("https://jsonplaceholder.typicode.com/todos/1")
					.header("accept", "application/json").asJson();
			HttpResponse<String> test = Unirest.get("https://jsonplaceholder.typicode.com/todos/1")
					.header("accept", "application/json").asString();

			System.out.println(test.getBody());
			return test.getBody();

//		    assertNotNull(jsonResponse.getBody());
//		    assertEquals(200, jsonResponse.getStatus());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RestTemplate restTemplate = new RestTemplate();
		TimeEntry timeEntry = new TimeEntry();
//	        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//	        log.info(quote.toString());

		return null;

	}

}
