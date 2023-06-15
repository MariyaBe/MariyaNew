package excelFileExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listner.ListnerSample.class)
public class ReadingExcel {
	
@Test	
	

	public void method() throws IOException  {
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\17184\\Desktop\\Learning excel.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		for(Row row : sheet) {
		
		for(Cell cell : row) { 
			
			System.out.print(cell.getStringCellValue()+ "\t\t");

			//not reading the numbers. only string value is printed
			
		}
		}
		
		}
	}
	
	


