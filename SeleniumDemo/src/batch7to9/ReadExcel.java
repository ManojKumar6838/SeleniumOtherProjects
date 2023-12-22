package batch7to9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {
//		String data=readExcel(0, 1);
//		System.out.println(data);
//		readMultipleData();
		writeBack();
		
	}
	
	public static String readExcel(int rowNum, int cellNum) throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("TestData");
		Row row=sh.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String data=cell.getStringCellValue();
		return data;
	}
	
	public static void readMultipleData() throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("TestData");
		int rowCount=sh.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		int cellCount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cellCount);
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
			System.out.println();
		}
		
	}
	public static void writeBack() throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("TestData");
		Row row=sh.getRow(0);
		Cell cell=row.createCell(2);
		cell.setCellValue("Done");
		
		FileOutputStream fos=new FileOutputStream("./TestData/GoIbiboTC.xlsx");
		wb.write(fos);
		wb.close();
		
		System.out.println("Wrote Successfully");
		
		
	}
	
	
}
