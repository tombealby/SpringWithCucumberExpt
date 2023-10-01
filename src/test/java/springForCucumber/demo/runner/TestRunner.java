package springForCucumber.demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberContextConfiguration // add 1245??
@CucumberOptions(
		tags = "@test and not @ignore",
		plugin = {"pretty"},
		features = "src/test/resources/features",
		glue = "springForCucumber/demo/stepdefs",
		publish = false)
public class TestRunner {

}
