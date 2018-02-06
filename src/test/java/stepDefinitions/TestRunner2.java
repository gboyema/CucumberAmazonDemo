package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = { "Resources/SearchScenario.feature" },
		glue= {"stepDefinitions"},
		plugin = {"pretty","html:output/cucumber-html-report","json:output/cucumber.json"})

public class TestRunner2  {

}
