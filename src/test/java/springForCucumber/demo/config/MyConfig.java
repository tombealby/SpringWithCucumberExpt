package springForCucumber.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:application.yml")
public class MyConfig {

	@Value("${targetHost}")
	private String targetHost;

	public String getTargetHost() {
		return targetHost;
	}

}
