package testSript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunHp {
	@Test(groups = "laptop")
	public void hp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hp.com/in-en/shop/laptops");
		Thread.sleep(3000);
		driver.quit();
	}
}
