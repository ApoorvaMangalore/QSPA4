package testSript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunAssus {
	@Test(groups = "laptop")
	public void asus() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asus.com/in");
		Thread.sleep(3000);
		driver.quit();
	}

}
