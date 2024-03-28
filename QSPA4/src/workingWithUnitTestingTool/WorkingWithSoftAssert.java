package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {

	@Test
	public void login() throws InterruptedException {
		String expURL = "https://www.BMW.in/en/index.html";
		String ExpmodelsUrl="https://www.bmw.in/en/all-models.html";
		SoftAssert sf=new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("User is able to Open Empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to Open maximize browser", true);
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("User is able to Open BMW ", true);

		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		sf.assertEquals(actualUrl, expURL,"Url is wrong");

		driver.findElement(By.xpath("//span[text()='Models']")).click();
		String actualModelsUrl = driver.getCurrentUrl();
		System.out.println(actualModelsUrl);
		
		sf.assertEquals(actualModelsUrl,  ExpmodelsUrl);
		Thread.sleep(3000);
		
		driver.quit();
		sf.assertAll();

	}
		
}
