package wokingWithPom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;

	String actualURL = "https://demowebshop.tricentis.com/";

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite");
		Reporter.log("Data base connection start", true);
	}

	@AfterSuite()
	public void afterSuite() {
		System.out.println("I am after suite");
		Reporter.log("Data base connection stop", true);
	}

//@BeforeTest
	@BeforeClass
	public void browserSetUp() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User is able to open empty browser", true);
		File file = new File("./testData/data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String appURl = prop.getProperty("url");

		driver.get(appURl);
		Reporter.log("User is able to open DemoWeBshop", true);
		String url = driver.getCurrentUrl();
		if (url.equals(actualURL)) {
			Reporter.log("User is able to land on Demoweb shop Home page", true);
		} else {
			Reporter.log("User is not able to open demo webshop");
		}
		Thread.sleep(6000);
	}

//AfterTest
	@AfterClass
	public void toQuitBrowser() {
		driver.quit();
		Reporter.log("User is able close the demowebshop", true);
	}

}