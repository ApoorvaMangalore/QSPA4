package testSript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunMynestle {
	@Test(groups = "food")
	public void mynestle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mynestle.in/mybrands/mymilkybar");
		Thread.sleep(3000);
		driver.quit();
	}
}
