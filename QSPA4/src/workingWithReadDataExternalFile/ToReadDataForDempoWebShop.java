package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataForDempoWebShop {

	public static void main(String[] args) throws IOException {
		// step 1:Create obj file
		File file = new File("./testData/testdata.xlsx");

		// step 2:FIS
		FileInputStream fis = new FileInputStream(file);

		// step 3:Create obj for file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step4: get the sheet name
		String sheet = workbook.getSheetName(0);
		System.out.println(sheet);

		String url = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

}
