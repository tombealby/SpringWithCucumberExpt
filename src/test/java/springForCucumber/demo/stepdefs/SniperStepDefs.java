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
        assertEquals("Received an ok response from my request to join the auction, "
        		+ "so take that to mean that I have joined the auction." , actualResponseBody);
	}

	private ResponseEntity<String> startBidding() throws HttpClientErrorException {
	    final String url = "http://localhost:8092/startBidding";
		return sendRequest(url);
	}

	@Then("the sniper shows that it has lost the auction")
	public void the_sniper_shows_that_it_has_lost_the_auction() {
		ResponseEntity<String> response = getStatus();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		final String actualResponseBody = response.getBody();
        assertEquals("current status:Lost" , actualResponseBody);
	}

	private ResponseEntity<String> getStatus() throws HttpClientErrorException {
	    final String url = "http://localhost:8092/getStatus";
		return sendRequest(url);
	}

	@Then("the sniper has made a bid of {int}")
	public void the_sniper_has_made_a_bid_of(final int expectedLatestBidBySniper) {
		ResponseEntity<String> response = getLatestBidBySniper();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		final String actualResponse = response.getBody();
		final String expectedResponse = "My latest bid:" + expectedLatestBidBySniper;
		assertEquals(expectedResponse, actualResponse);
	}

	private ResponseEntity<String> getLatestBidBySniper() throws HttpClientErrorException {
	    final String url = "http://localhost:8092/getLatestBid";
		return sendRequest(url);
	}
}
