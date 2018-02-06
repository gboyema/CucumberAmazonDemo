package Init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class AbstractClass extends CucumberInit{

	public WebDriver driver;
	public int DRIVER_WAIT = 15;
	
	public AbstractClass(WebDriver driver) {
		this.driver = driver;
		
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
				DRIVER_WAIT);
		
		PageFactory.initElements(finder, this);
		System.out.println("======Abstract Page======");
	}
}
