package com.AmazonDemo.Search;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Init.AbstractClass;

public class SearchVerification extends AbstractClass{

	public SearchVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (id="productTitle")
	WebElement productTitle;
	public SearchIndexPage getProductText(String arg1) {
		// TODO Auto-generated method stub
		String expectedString=productTitle.getText();
		System.err.println(" Product Title : "+arg1);
		Assert.assertTrue(expectedString.contains(arg1));
		
		return new SearchIndexPage(driver);
	}

	
}
