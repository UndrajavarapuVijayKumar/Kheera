package test_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/appfeature"},
		glue = {"stepdefinitions"},
		plugin= {"pretty"}
		)
public class AmazonTest {

}
