package genricLib;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultiplevalue {
	@Test(dataProvider = "data")
	public void login(String un, String pwd) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtlitilyMethods um = new UtlitilyMethods();
		String URL = um.readingTheDataFromPropFile("./testdata/data.properties", "url");
		driver.get(URL);

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}

	@DataProvider(name = "data")
	public String[][] dataSupply() throws EncryptedDocumentException, IOException {
		return UtlitilyMethods.readMultipleData("./testData/testdata.xlsx", "Sheet1");
	}
}
