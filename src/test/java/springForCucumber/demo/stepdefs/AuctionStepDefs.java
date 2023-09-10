package springForCucumber.demo.stepdefs;

import static org.junit.Assert.assertEquals;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import springForCucumber.demo.util.RestUtils;

public class AuctionStepDefs extends RestUtils {
	
	@Given("the auction has started selling an item")
	public void the_auction_has_started_selling_an_item() {
		openAuction();
		ResponseEntity<String> response = getAuctionStatus();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		final String actualResponse = response.getBody();
		final String expectedResponse = "current status:Open";
		assertEquals(expectedResponse, actualResponse);
	}
	
	private void openAuction() {
	    final String url = "http://localhost:8093/openAuction";
		sendRequest(url);
	}

	private ResponseEntity<String> getAuctionStatus() throws HttpClientErrorException {
	    final String url = "http://localhost:8093/getStatus";
		return sendRequest(url);
	}

	@Then("the auction has received a join request from sniper")
	public void the_auction_has_received_a_join_request_from_sniper() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the auction announces that it has closed")
	public void the_auction_announces_that_it_has_closed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
