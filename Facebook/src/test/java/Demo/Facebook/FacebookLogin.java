package Demo.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookLogin {

public static WebDriver driver = null;
public static String Browser = "chrome";	
	
	public static void main(String[] args) throws Throwable {
		
		if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "/driver./geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println("Firefox is selected");
			
		}
		
		else if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Chrome is selected");
		}
		
		else if(Browser.equalsIgnoreCase("Internet Explorer")) {
			System.setProperty("webdriver.edge.EdgeDriver", "./msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com");
			System.out.println("Edge driver is selected");
		}
		
		
		
		
		
		
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); //
		//Launch chrome
		
		driver.findElement(By.name("email")).sendKeys("0791177242");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("gugu1984");
		Select d = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		d.selectByIndex(10);
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		if (pageTitle.equals("Facebook – log in or sign up")) {
		System.out.println("Title Verified"); }
		
		else { System.out.println("Incorrect Titlesoft"); }
		
		 
		 
		 alert();
		 quit();
		 
	} 
	
	public static void alert() {
		Alert clearAlert = driver.switchTo().alert();
		clearAlert.getText();
		clearAlert.accept();
	}
	public static void quit() throws Throwable{
		Thread.sleep(5000);
		driver.quit();
	}
} // 