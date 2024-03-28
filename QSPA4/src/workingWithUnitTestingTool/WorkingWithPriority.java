package workingWithUnitTestingTool;
import org.testng.annotations.Test;

public class WorkingWithPriority {
	
	@Test
	public void register() {
		System.out.println("User is able to register");
	}
	@Test
	public void login() {
		System.out.println("User is able to login");
	}
	@Test
	public void searchProduct() {
		System.out.println("User is able to search product");
	}
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("User is able to add product to cart");
	}
	@Test(priority = 5)
	public void payment() {
		System.out.println("User is able to make a payment");
	}
	@Test(priority = 6)
	public void closeTheApp() {
		System.out.println("User is able to close the app");
	}
	@Test(alwaysRun = true)//driver.close()
	public void run() {
		System.out.println("User is able to run");
	}
	@Test(enabled  = false)//skip
	public void testCase() {
		System.out.println("I am test case");
	}
}
