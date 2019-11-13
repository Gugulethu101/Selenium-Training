package WriteToExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteToExcel {
	@Test
	public void excelData() throws IOException{
		File src = new File("./writeToExcel.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet loginSheet = wb.getSheet("Sheet1");     //get sheet name
		
		//add column
		loginSheet.getRow(0).createCell(2).setCellValue("Result");
		loginSheet.getRow(1).createCell(2).setCellValue("Pass");
		loginSheet.getRow(2).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);  //write to the file
		wb.close();
		
	}
	
	

}
