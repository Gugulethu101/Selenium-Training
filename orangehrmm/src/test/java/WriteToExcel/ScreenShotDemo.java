package WriteToExcel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotDemo {
	
	@Test
	 public void captureScreenShot()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	driver.get("http://ilabquality.com");
	 
	// cast driver
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("./screenShot.png"));
	}
	 
	//capture exceptions
	catch (IOException e)
	 {
		e.getCause();
		e.printStackTrace();
	  System.out.println(e.getMessage());
	 
	 }//end catch

	}//end captureScreenShot
	
}//end class
