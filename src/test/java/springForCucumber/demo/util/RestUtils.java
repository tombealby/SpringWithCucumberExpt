package springForCucumber.demo.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class RestUtils {

	private RestTemplate restTemplate = new RestTemplate();

	protected ResponseEntity<String> sendRequest(final String endPointUrl) throws HttpClientErrorException {
		return restTemplate.getForEntity(endPointUrl, String.class);
	}
}
