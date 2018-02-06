package Init;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AmazonDemo.Search.SearchIndexPage;
import com.AmazonDemo.Search.SearchVerification;

public class CucumberInit {

	public WebDriver driver;
	
	public SearchIndexPage searchIndexPage;
	public SearchVerification searchVerification;

	public void setUp(WebDriver driver) {
		// TODO Auto-generated method stub
		File file=new File("Drivers/chromedriver_2_33.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		this.searchIndexPage = new SearchIndexPage(driver);
		this.searchVerification = new SearchVerification(driver);
	} 	
}
