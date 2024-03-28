package genricLib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromExceSingleData {

	@Test
	public void toOpenDemoWebshop() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtlitilyMethods um = new UtlitilyMethods();
		String URL = um.readingTheDataFromPropFile("./testData/data.properties", "url");
		driver.get(URL);
		
		
		driver.findElement(By.linkText("Log in")).click();
		String email = um.readingDataFromExcelSingleValue("./testData/testdata.xlsx", "loginData", 0, 1);
		driver.findElement(By.id("Email")).sendKeys(email);
	}
}
