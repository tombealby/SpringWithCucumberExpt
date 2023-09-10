package springForCucumber.demo.stepdefs;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import springForCucumber.demo.config.MyConfig;
import springForCucumber.demo.util.RestUtils;

public class SniperStepDefs extends RestUtils {
	
	@Autowired
	private MyConfig myConfig;

	@When("sniper requests to start bidding in the auction")
	public void sniper_requests_to_start_bidding_in_the_auction() {
        ResponseEntity<String> response = startBidding();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		final String actualResponseBody = response.getBody();
        assertEquals("Received a request to join the auction" , actualResponseBody);
	}

	private ResponseEntity<String> startBidding() throws HttpClientErrorException {
	    final String url = "http://localhost:8093/receiveJoinRequest";
		return sendRequest(url);
	}

	@Then("the sniper shows that it has lost the auction")
	public void the_sniper_shows_that_it_has_lost_the_auction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
