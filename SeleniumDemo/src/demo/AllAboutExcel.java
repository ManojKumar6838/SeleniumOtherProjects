package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllAboutExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/Demo Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cell=row.getCell(0);
		String data=cell.getStringCellValue();
		System.out.println(data);
		System.out.println("==============");
		readMultipleData();
		writeBackToExcel();
	}
	
	public static void readMultipleData() throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/Demo Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getPhysicalNumberOfRows();
		int colCount=sh.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		
	}
	
	public static void writeBackToExcel() throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/Demo Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cell=row.createCell(2);
		cell.setCellValue("Done");
		
		FileOutputStream fos=new FileOutputStream("./TestData/Demo Excel.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("===========");
		System.out.println("Done");
		
	}
}
