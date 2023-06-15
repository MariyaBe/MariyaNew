package excelFileExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcel {
@Test
	public void method() throws IOException {
		// TODO Auto-generated method stub
		
		
		
		String filename= "C:\\Users\\17184\\Desktop\\Learning excel.xlsx";
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet("Information");
			XSSFRow row = sheet.createRow(0);
			row.createCell(0).setCellValue("First Name");
			row.createCell(1).setCellValue("Last Name");
			row.createCell(2).setCellValue("Phone");
			row.createCell(3).setCellValue("age");
			
			XSSFRow row1 = sheet.createRow(1);
			row1.createCell(0).setCellValue("Mariya");
			row1.createCell(1).setCellValue("Begum");		
			row1.createCell(2).setCellValue("123456");
			row1.createCell(3).setCellValue("29");
			
			FileOutputStream fileout = new FileOutputStream(filename);
			wb.write(fileout);
			fileout.close();
			wb.close();
			
		}
		

	}


