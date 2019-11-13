package WriteToExcel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//class definition begins here
public class HomeWork {

	public static WebDriver driver = null;
	//program execution begins here
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		/*//determine number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int listSize = links.size();
		System.out.println("Number of links " + listSize);
		for(int i = 0; i < listSize; i++) {
			WebElement web = links.get(i);
			String displayLink  =  web.getAttribute("href");
			System.out.println(displayLink);
		 */			

		List<WebElement> social_icons=driver.findElements(By.xpath("//div[@id='social-icons']//a"));

		// Expected links are stored in array.  
		String[] expectedSocialLinkURLs = {"linkedin","facebook","twitter","youtube"};

		//foreach loop
		for (WebElement sociallinks : social_icons) {
 			String href_value =	sociallinks.getAttribute("href");

			String expectedValue = expectedSocialLinkURLs[social_icons.indexOf(sociallinks)];

			//validate footer
			if (href_value.contains(expectedValue))
			{
				System.out.println( expectedValue + " link ponints to " + expectedValue + " URL" );
				System.out.println("Test Passed");
			}//end if

			else {
				System.out.println( expectedValue + " link doesn't ponits to " + expectedValue + " URL" );
				System.out.println("Test Failed");
			}//end else

		}//end for loop

		login();
		verifyAdminTab();
	}//end main


	// Login with credentials
	public static void login() {

		/*Enter User ID*/	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		/*Enter Password*/	
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//Thread.sleep(9000);
		//
		/*Click on Login*/
		driver.findElement(By.id("btnLogin")).click();

	}//end login

	//verify admin tab
	public static void verifyAdminTab() {

		// Verify admin tab is displayed.
		if (driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed())
		{
			System.out.println("Admin tab is displayed " + "Test passed");
		}
		else {
			System.out.println("Admin tab is NOT displayed " + "Test failed" );
		}

		//'Welcome admin' should display at right panel
		if (driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed())
		{
			System.out.println("Welcome panel is displayed" + "test passed" );
		}//end if
		else {
			System.out.println("Welcome panel is NOT displayed" + "test failed");

		}//end else
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
	
	}//verifyAdminTab

	

}//end class
