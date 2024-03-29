package Demo2.HRM;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ErrorsValidation {

	public static WebDriver driver ;
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.driver.chrome", "./chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		verifyPageTitle ();		
				
		/* Testcase 2
		 * driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(
		 * ); driver.navigate().to("https://www.linkedin.com/m/login/"); String title1 =
		 * driver.getTitle(); if (title1.equals("LinkedIn")) {
		 * System.out.println("LinkedIn is displayed"); } driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		 * driver.navigate().to("https://www.linkedin.com/m/login/"); String title2 =
		 * driver.getTitle(); if (title2.equals("LinkedIn")) {
		 * System.out.println("LinkedIn is displayed"); } driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		 * driver.navigate().to("https://twitter.com/orangehrm");
		 * driver.navigate().back();
		 * 
		 * WebElement b =
		 * driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		 * Boolean a = b.isDisplayed(); System.out.println("LinkedIn icon is displayed"
		 * +' '+a );
		 * 
		 * WebElement x =
		 * driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")); Boolean
		 * a2 = x.isDisplayed(); System.out.println("Facebook icon is displayed" +' '+a2
		 * );
		 * 
		 * WebElement p =
		 * driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")); Boolean
		 * a3 = p.isDisplayed(); System.out.println("Twitter icon is displayed" +' '+a3
		 * );
		 */
			
				
				//Create a list and find Webelements
		List<WebElement> social_icons = driver.findElements(By.xpath("//div[@id='social-icons']//a"));	
		
		//Expected links are stored in an array
		String[] expectedSocialLinkURLs = {"linkedin","facebook","twitter","youtube"};
		
		//Foreach loop
		for (WebElement sociallinks : social_icons) {
			String href_value = sociallinks.getAttribute("href");
			
			String expectedValue = expectedSocialLinkURLs[social_icons.indexOf(sociallinks)];
			
			//validate footer
			if (href_value.contains(expectedValue))
			{
				System.out.println( expectedValue + " Link points to "+ expectedValue + "URL ");
				System.out.println("Test Passed");
			}// end if
			
			else {
				System.out.println( expectedValue + "Link doesnt point to "+ expectedValue + "URL ");
				System.out.println("Test Failed");
			}//end else
		}//end for loop
		
		
		login ();

		verifyUrl();
		
		verifyAdminTab();
		
		verifyWelcomeAdmin();
		
		verifyUrlText();
		
		verifybuttons();
		
	}//end main
	
	public static void verifyPageTitle () {
		String title = driver.getTitle();
		if (title.equals("OrangeHRM")) {
			System.out.println("Page title is Orange");
		}
		else {
			System.out.println("Page title is not Orange");
		}
	}
	public static void login() {
		
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");;
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}

	public static void verifyUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		if(pageUrl.contains("dashboard")) {
			System.out.println("dashboard test passed");
		}
		else {
			System.out.println("dashboard Test failed");
		}
	}
		
	public static void verifyAdminTab() {
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		if (Admin.isDisplayed()) {
			System.out.println("Admin Tab is displayed");
		}
		else
		{
			System.out.println("Admin Tab is not displayed");
		}
	}
	
	public static void verifyWelcomeAdmin() {
		WebElement welcomeAdmin = driver.findElement(By.xpath("//a[@id='welcome']"));
		if (welcomeAdmin.isDisplayed()) {
			System.out.println("Welcome Admin is displayed on the right hand side");
		}
		else {
			System.out.println("Welcome Admin is not displayed on the right hand side");
		}
		
	}
	
	public static void verifyUrlText() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		String adminUrl = driver.getCurrentUrl();
		if (adminUrl.contains("admin/viewSystemUsers")) {
			System.out.println("url contains admin/viewSystemUsers");
		}
		else {
			System.out.println("url does not contain admin/viewSystemUsers");
		}
	}
	
	public static void verifybuttons() {
		// Add button is displayed
		WebElement Add = driver.findElement(By.xpath("//input[@id='btnAdd']"));
		if (Add.isDisplayed()) {
			System.out.println("The Add button is displayed");
		}
		else{
			System.out.println("The Add button is not displayed");
		}
		
	
		//Delete button is displayed
		WebElement Delete = driver.findElement(By.xpath("//input[@id='btnDelete']"));
		if (Delete.isDisplayed()) {
			System.out.println("The Delete button is displayed");
		}
		else {
			System.out.println("The delete button is not displayed");
		}
		//Search button is displayed
		WebElement Search = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		if (Search.isDisplayed()) {
			System.out.println("The Search button is displayed");
		}
		else {
			System.out.println("The Search button is not displayed");
		}
		//Reset button is displayed
		WebElement Reset = driver.findElement(By.xpath("//input[@id='resetBtn']"));
		if (Reset.isDisplayed()) {
			System.out.println("The Reset button is displayed");
		}
		else {
			System.out.println("The Reset button is not displayed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}//end class
