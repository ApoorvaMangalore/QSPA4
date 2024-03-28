package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenDemoWebshop {

	public static void main(String[] args) throws IOException {
		File file = new File("./testData/data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String URL = prop.getProperty("url");

		// driver.get(prop.getProperty("url"));
		
		driver.get(URL);
		driver.quit();
	}

}
