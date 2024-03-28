package workingWithUnitTestingTool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test case is Succes");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "Test case is fail");

		LocalDateTime systemTime = LocalDateTime.now();
		System.out.println(systemTime);
		String scrnShtName = systemTime.toString().replace(":", "-");

		TakesScreenshot tks = (TakesScreenshot) DemoWebShop.driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/" + scrnShtName + ".png");
		//File dest = new File("./errorShots/webpage.png");
		try {
			//Files.copy(src, dest);
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
