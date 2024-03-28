package wokingWithPom;

import org.testng.annotations.Test;

public class Program2  extends BaseClass{

	
	@Test
	public void searchProduct() throws InterruptedException {
		BasePage bp=new BasePage(driver);
		bp.getSearchBar().sendKeys("simple computer");
		Thread.sleep(3000);
		bp.getSearchButton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		bp.getSearchBar().sendKeys("Books");
		Thread.sleep(3000);
	}
}
