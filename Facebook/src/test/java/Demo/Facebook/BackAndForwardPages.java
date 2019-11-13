package Demo.Facebook;

               
import org.openqa.selenium.WebDriver;          
import org.openqa.selenium.chrome.ChromeDriver;


public static WebDriver driver;

public class BackAndForwardPages {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	// Launch Chrome
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.facebook.com");
	
	//Switch to a different url
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
}
