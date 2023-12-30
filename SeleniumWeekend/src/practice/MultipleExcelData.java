package practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleExcelData {

	public static void main(String[] args) throws Throwable {
		readMultiple();
	}
	
	public static void readMultiple() throws Throwable  {
		File path=new File("./TestData/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(path);
		Sheet sh=wb.getSheet("TestData");
		int rowCount=sh.getPhysicalNumberOfRows();
		int colCount=sh.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
			System.out.println("");
		}
		
	}
}
