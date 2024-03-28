package genricLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromPropFile {

	@Test
	public void toOpenDemoWebshop() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		UtlitilyMethods um=new UtlitilyMethods();
		//String URL = um.readingTheDataFromPropFile("./testData/data.properties", "url");
		driver.get(um.readingTheDataFromPropFile("./testData/data.properties", "url"));
		
		//driver.get(URL);
	}

}
