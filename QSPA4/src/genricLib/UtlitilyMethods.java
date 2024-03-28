package genricLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Apoorva
 */

public class UtlitilyMethods {
	/**
	 * 
	 * @param path pass the path of the pro.. file
	 * @param key  pass the key from pro.. file
	 * @return String URL
	 * @throws IOException
	 */

	public String readingTheDataFromPropFile(String path, String key) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty(key);

		return URL;
	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readingDataFromExcelSingleValue(String path, String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		String data = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return data;
	}
	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public  static String[][] readMultipleData(String path, String sheetName) throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		int numOfRows = workBook.getSheet(sheetName).getPhysicalNumberOfRows();
		int numOfclm = workBook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[numOfRows][numOfclm];
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfclm; j++) {
				data[i][j] = workBook.getSheet(sheetName).getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

}
