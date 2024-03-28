package workingWithUnitTestingTool;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)
public class DemoWebShop  {
	public static WebDriver driver;
	String eUrl = "https://demowebshop.tricentis.com/";

	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		String url = driver.getCurrentUrl();
		assertEquals(eUrl, url);
		driver.quit();
	}
}
