package springForCucumber.demo.stepdefs;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import springForCucumber.demo.config.MyConfig;

public class SniperStepDefs {
	
	@Autowired
	private MyConfig myConfig;

	private ResponseEntity<String> response;

//	@When("the client requests GET \\/fruits")
//	public void the_client_requests_get_fruits() {
//
//		final String hostName = myConfig.getTargetHost();
//		final RestTemplate restTemplate = new RestTemplate();
//		final String fooResourceUrl = "http://localhost:8091/fruits";
//		response = restTemplate.getForEntity(fooResourceUrl, String.class);
//		assertEquals(response.getStatusCode(), HttpStatus.OK);
//		
//	}

	@When("sniper requests to start bidding in the auction")
	public void sniper_requests_to_start_bidding_in_the_auction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the sniper shows that it has lost the auction")
	public void the_sniper_shows_that_it_has_lost_the_auction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
