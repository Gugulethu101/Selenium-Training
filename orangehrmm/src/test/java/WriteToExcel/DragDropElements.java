package WriteToExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropElements {
	
	@Test
	public void dragDrop() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	// launch url
	driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	 
	
	Thread.sleep(3000);
	 
	// instance of Action class
	Actions act=new Actions(driver);
	 
	// Drag element
	WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	 
	// find element which we need to drop
	WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
	 
	// this will drag element to destination
	act.dragAndDrop(drag, drop).build().perform();
	 
	}

}
