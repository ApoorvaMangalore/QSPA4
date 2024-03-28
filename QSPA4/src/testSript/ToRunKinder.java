package testSript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunKinder {
	@Test(groups = "food")
	public void kinder() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kinder.com/in/en/");
		Thread.sleep(3000);
		driver.quit();
	}

}
