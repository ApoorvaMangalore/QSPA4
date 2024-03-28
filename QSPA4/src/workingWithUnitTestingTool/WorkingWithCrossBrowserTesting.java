package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class WorkingWithCrossBrowserTesting {
	public WebDriver driver;
	
	@Parameters({"browserName","url"})
	@Test
	public void browser(@Optional("chrome")String browserName,@Optional("https://www.bmw.in/en/index.html")String url) throws InterruptedException {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("fireFox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser name");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}
}

