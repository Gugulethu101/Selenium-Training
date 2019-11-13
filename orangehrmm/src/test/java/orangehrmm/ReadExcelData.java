package orangehrmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	@Test
	public void excelData() throws IOException{
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("./demo.xlsx")));
		String data =  wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();     //get sheet name
		
		System.out.print(data + "\t");
		System.out.println( wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		
		//write to excel file
		
	}//end method
	
	

}//end excelData
