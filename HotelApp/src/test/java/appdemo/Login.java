package appdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "./chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/index.php");
		System.out.println("Hey Hotel Login is displayed");
		
		
	}

}
