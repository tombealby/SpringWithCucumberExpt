package springForCucumber.demo.stepdefs;

import io.cucumber.java.After;
import springForCucumber.demo.util.RestUtils;

public class ResetSniperStateToInitialStateStepDefs extends RestUtils {

	@After
	public void reset_sniper_state_to_its_initial_state() {
		final String url = "http://localhost:8092/resetState";
		sendRequest(url);
	}

}
