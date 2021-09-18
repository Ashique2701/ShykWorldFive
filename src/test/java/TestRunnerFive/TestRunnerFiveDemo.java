package TestRunnerFive;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "StepDefinationFive")

//tags= {""})

public class TestRunnerFiveDemo extends AbstractTestNGCucumberTests {

}
