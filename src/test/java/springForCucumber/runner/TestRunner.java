package springForCucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberContextConfiguration // add 1245??
@CucumberOptions(
		plugin = {"pretty"},
		features = "src/test/resources/features",
		glue = "springForCucumber/stepdefs")
public class TestRunner {

}
