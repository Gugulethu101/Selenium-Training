package orangehrmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDataMethod2 {
	@Test
	public void excelData() throws IOException{
		File src = new File("./demo.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet loginSheet = wb.getSheet("Sheet1");     //get sheet name
		XSSFRow row1 = loginSheet.getRow(0);  //get first row
		//XSSFRow row1 = loginSheet.getRow(0);  //get first row
		XSSFCell c1 = row1.getCell(0);//get the first cell
		XSSFCell c2 = row1.getCell(1);//get the first cell
		String data = c1.getStringCellValue();
		String data1 = c2.getStringCellValue();
		System.out.println(data);
		System.out.println(data1);
		
		
		
	}
	
	

}
