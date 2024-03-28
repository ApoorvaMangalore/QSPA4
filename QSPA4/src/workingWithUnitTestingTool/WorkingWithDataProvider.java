package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	@DataProvider(name = "testData")
	public String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "Apoorva";
		data[0][1] = "Mangalore";
		data[0][2] = "apoorva@gamil.com";
		data[0][3] = "123abc";
		data[0][4] = "123abc";

		data[1][0] = "Mangalore";
		data[1][1] = "Apoorva";
		data[1][2] = "apoorva.c@gamil.com";
		data[1][3] = "123abcABC";
		data[1][4] = "123abcABC";
		return data;
	}

	@Test(dataProvider = "testData")
	public void detaDemo(String Firstname, String LastName, String emailId, String password, String cnfmPwd) {
		System.out.println(Firstname);
		System.out.println(LastName);
		System.out.println(emailId);
		System.out.println(password);
		System.out.println(cnfmPwd);
	}
}
