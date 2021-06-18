package abcd;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc002 {
	@Test
	public void testtwo()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.quit();
		
	}

}
