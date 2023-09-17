package springForCucumber.demo.stepdefs;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import springForCucumber.demo.config.MyConfig;

public class RestSteps {
	
	@Autowired
	private MyConfig myConfig;

	private ResponseEntity<String> response;

	@When("the client requests GET \\/fruits")
	public void the_client_requests_get_fruits() {

		final String hostName = myConfig.getTargetHost();
		final RestTemplate restTemplate = new RestTemplate();
		final String fooResourceUrl = "http://localhost:8091/fruits";
		response = restTemplate.getForEntity(fooResourceUrl, String.class);
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}

	@Then("the response should be JSON:")
	public void the_response_should_be_json(String expectedJson) {
		final String responseBody = response.getBody();
		assertEquals(expectedJson, responseBody);
	}

}
