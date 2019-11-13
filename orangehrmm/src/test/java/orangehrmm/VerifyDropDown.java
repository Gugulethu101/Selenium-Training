package orangehrmm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDown {
public static WebDriver driver = null;
	
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://adactin.com/HotelApp/index.php");
		
		login();

	}


	public static void login() {
		WebElement username =  driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Bongani10");
		
		WebElement password =  driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("1DE292");
		
		WebElement login =  driver.findElement(By.xpath("//input[@id='login']"));
		login.click();	
		verifyDropDown();
	}
	
	public static void verifyDropDown() {
		
		String[] location = {"Sydney","Melbourne","Brisbane","Adelaide","London","New York","Los Angeles","Paris"};
		Select selectLocation = new Select(driver.findElement(By.xpath("//select[@id='location']")));
		List<WebElement> values = selectLocation.getOptions();
		int arraySize  = values.size();
		System.out.println("Array Size is" + arraySize);
		selectLocation.selectByVisibleText("Brisbane");
	//	System.out.println("Original list " + values.get(i).getText());
		
		for(int i = 0; i < arraySize; i++ ) {
		
			
			if(location[i].contains("Brisbane")) {
				System.out.println(location[i] + "Test passed");
				break;
			}
			else {
				System.out.println("Test failed");
				continue;
			}//end else
			
		}//end for loop
		/*
		 * --radio button >> click >> selected >> Boolean
				Boolean variable =radioButton.isSelected
		 */
	}//end method
}//end class

