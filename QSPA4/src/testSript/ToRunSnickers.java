package testSript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunSnickers {
	@Test(groups = "food")
	public void snickers() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snickers.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
