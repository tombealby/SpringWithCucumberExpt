package springForCucumber.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class RestUtils {

//    @Value("${xrs.host}")
//    private String xrsHost;
//
//    @Value("${xrs.port}")
//    private String xrsPort;
//
//    @Autowired
//    protected ScenarioContext scenarioContext;

	private RestTemplate restTemplate = new RestTemplate();

	protected ResponseEntity<String> sendRequest(final String endPointUrl) throws HttpClientErrorException {
		return restTemplate.getForEntity(endPointUrl, String.class);
	}
}
