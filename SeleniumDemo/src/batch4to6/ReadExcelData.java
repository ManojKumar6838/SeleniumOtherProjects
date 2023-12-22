package batch4to6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws Throwable {
//		FileInputStream fis=new FileInputStream("./TestData/Demo Excel.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sheet=wb.getSheet("Sheet1");
//		Row row=sheet.getRow(0);
//		Cell cell=row.getCell(1);
//		String data=cell.getStringCellValue();
//		System.out.println(data);
		multipleData();
		
	}
	
	public static void multipleData() throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet2");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		
		
		
	}
}
