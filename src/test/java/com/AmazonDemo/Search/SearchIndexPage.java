package com.AmazonDemo.Search;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Init.AbstractClass;
import Init.Common;
import cucumber.api.Scenario;

public class SearchIndexPage extends AbstractClass{

	public SearchIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public SearchVerification OpenURL(String arg1) {
		// TODO Auto-generated method stub
		System.err.println("==== URL :: "+arg1);
		driver.get(arg1);
		System.err.println(" URL opened..!!");
		return new SearchVerification(driver);
	}

	@FindBy (id="twotabsearchtextbox")
	WebElement searchBox;
	public SearchVerification enterSearchKey(String arg1) {
		// TODO Auto-generated method stub
		Common.type(searchBox, arg1+Keys.ENTER);
		System.err.println(" Search Key : "+searchBox.getAttribute("value"));
		return new SearchVerification(driver);
	}
	
	@FindBy (id="sort")
	WebElement sortDropDown;
	
	@FindBy (xpath="//ul[@id='s-results-list-atf']/li[2]//a/h2")
	WebElement secondItem;

	public SearchVerification sortResult() {
		// TODO Auto-generated method stub
		Common.selectFromComboByVisibleText(sortDropDown,"Price: High to Low");
		System.err.println(" Sort option selected.");
		Common.pause(5);
		Common.waitForElement(driver, secondItem);
		return new SearchVerification(driver);
	}
	
	
	public SearchVerification selectItem() {
		// TODO Auto-generated method stub
		System.err.println(" Item selected : "+secondItem.getText());
		Common.clickOn(driver, secondItem);
		return new SearchVerification(driver);	
	}

	public void takeScreenShot(Scenario scenario) throws IOException {
		// TODO Auto-generated method stub
	
		if(scenario.isFailed())
		{
			Common.makeScreenshot(driver, "AmazonTest");
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png" );
			scenario.write(" Test Failed ");
		}
		else
		{
			scenario.write(" Test Passed ");
		}
	    driver.close();
	}

}
