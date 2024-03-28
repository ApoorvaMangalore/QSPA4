package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider1 {
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
	public void detaDemo(String[] regdata) {
		System.out.println(regdata[0]);
		System.out.println(regdata[1]);
		System.out.println(regdata[2]);
		System.out.println(regdata[3]);
		System.out.println(regdata[4]);
	}
}
