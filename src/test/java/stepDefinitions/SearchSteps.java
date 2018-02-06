package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Init.CucumberInit;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchSteps extends CucumberInit{


	WebDriver driver;
	
	@Given("^I nevigate to \"([^\"]*)\"$")
	public void i_nevigate_to(String arg1) throws Throwable {
		super.setUp(driver);
		System.err.println(" Open URL : "+arg1);
		searchVerification=searchIndexPage.OpenURL(arg1);
	}

	@Given("^I enter search key \"([^\"]*)\" and press Enter$")
	public void i_enter_search_key_and_press_Enter(String arg1) throws Throwable {
		System.err.println(" Enter Search Key : "+arg1);
		searchVerification=searchIndexPage.enterSearchKey(arg1);
	}
	
	@Given("^Choose Price: Hight to Low from sort dropdown$")
	public void choose_Price_Hight_to_Low_from_sort_dropdown() throws Throwable {
		System.err.println(" Choose Price: High to Low");
		searchVerification=searchIndexPage.sortResult();
	}

	@When("^I choose second option from sorted result$")
	public void i_choose_second_option_from_sorted_result() throws Throwable {
		System.err.println(" Select second item from sorted result.");
		searchVerification=searchIndexPage.selectItem();
	}

	@Then("^selected product should contains \"([^\"]*)\"$")
	public void selected_product_should_contains(String arg1) throws Throwable {
		searchIndexPage=searchVerification.getProductText(arg1);
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		searchIndexPage.takeScreenShot(scenario);
	}
	

}
