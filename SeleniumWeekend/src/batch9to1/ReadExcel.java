package batch9to1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream path=new FileInputStream("./Data/GoIbiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(path);
		Sheet sheet=wb.getSheet("TestData");
		Row row=sheet.getRow(2);
		Cell cell=row.getCell(1);
		String value=cell.getStringCellValue();
		System.out.println(value);
	}
}
