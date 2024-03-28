package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromXlSheet {

	public static void main(String[] args) throws IOException {
		//step 1:Create obj file
		File file=new File("./testData/testdata.xlsx");
		
		//step 2:FIS
		FileInputStream fis=new FileInputStream(file);
		
		//step 3:Create obj for file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//step4: get the sheet name
		String sheet = workbook.getSheetName(0);
		System.out.println(sheet);
		
		 String url = workbook.getSheet("data").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(url);
		 String url1 = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
	     System.out.println(url1);
	     String username = workbook.getSheet(sheet).getRow(1).getCell(1).getStringCellValue();
	     System.out.println(username);
	}

}
