package wokingWithPom;

import org.testng.annotations.Test;

public class Tc_Reg_001 extends BaseClass {

	@Test
	public void register() {
		RegisterPage rp = new RegisterPage(driver);

		rp.getRegisterLink().click();
		rp.getFemaleRadioButton().click();
		rp.getFirstNameTextBox().sendKeys("Apoorva");
		rp.getLastNameTextBox().sendKeys("Mangalore");
		rp.getEmailTextBox().sendKeys("apoorva@123");
	}
}
