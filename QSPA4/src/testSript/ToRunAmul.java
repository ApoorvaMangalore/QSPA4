package testSript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunAmul {
	@Test(groups = "food")
	public void amul() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amul.com/products/chocolate.php");
		Thread.sleep(3000);
		driver.quit();
	}

}
