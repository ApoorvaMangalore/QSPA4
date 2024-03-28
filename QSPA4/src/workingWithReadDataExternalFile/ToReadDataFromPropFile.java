package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropFile {

	public static void main(String[] args) throws IOException {
		// Step1: Create obj for file
		File file = new File("./testData/data.properties");

		// step 2: fis obj
		FileInputStream fis = new FileInputStream(file);

		// step 3 obj prop file

		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.get("url"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("company"));
		System.out.println(prop.get("place"));

	}

}
