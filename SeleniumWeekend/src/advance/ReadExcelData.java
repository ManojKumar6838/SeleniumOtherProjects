package advance;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws Throwable  {
//		FileInputStream fis=new FileInputStream("./TestData/GoIbiboTC.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("TestData");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		String data = cell.getStringCellValue();
//		System.out.println(data);
		readMultipleData();
		
	}
	
	public static void readMultipleData() throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("TestData");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(cellCount);
		
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		
	}

}
