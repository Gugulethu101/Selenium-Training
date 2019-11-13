package appdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelApp {

	public static void main(String[] args) {
		System.setProperty("Webdriver.driver.chrome", "./chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/index.php"); // Step 1
		System.out.println("Hey Hotel Login is displayed");
		// How to verify a WebElement

		//WebElement b = driver.findElement(By.name("username"));
		// WebElement b = driver.findElement(By.name("datepick_in"));
		//Boolean m = b.isDisplayed();
		//System.out.println(m);

		
		  //Enter the username
		  driver.findElement(By.name("username")).sendKeys("Gugulethu");
		//Enter the password
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gugu1984");
		  //Click login
		  driver.findElement(By.id("login")).click();
		  
		  String title = driver.getTitle(); 
		  if (title.equals("AdactIn.com - Search Hotel")) {
		  System.out.println("Test Case 101 Passed"); }
		  
		  else { System.out.println("Test Case 101 Failed"); }
		  
		  //Select Location 
		  Select location = new Select(driver.findElement(By.xpath("//*[@id=\'location\']")));
		  location.selectByVisibleText("Sydney");
		  
		  //Select Hotel 
		  Select Hotel = new Select(driver.findElement(By.xpath("//*[@id='hotels']")));
		  Hotel.selectByVisibleText("Hotel Creek");
		  
		  //Select Room type 
		  Select RoomType = new Select(driver.findElement(By.xpath("//*[@id='room_type']")));
		  RoomType.selectByVisibleText("Standard");
		  
		  //Select No of Rooms 
		  Select NoOfRooms = new Select(driver.findElement(By.xpath("//*[@id='room_nos']")));
		  NoOfRooms.selectByValue("1");
		  
		  //Select date check in date
		  
		  driver.findElement(By.id("datepick_in")).click();
		  driver.findElement(By.id("datepick_in")).clear();
		  driver.findElement(By.name("datepick_in")).sendKeys("05/11/2019");
		  
		  //Select check out date driver.findElement(By.id("datepick_out")).click();
		  driver.findElement(By.id("datepick_out")).clear();
		  driver.findElement(By.name("datepick_out")).sendKeys("03/11/2019");
		  
		  //Click on Search driver.findElement(By.xpath("//*[@id='Submit']"));
		  driver.findElement(By.id("Submit")).click();
		  
	  String actualMsg =driver.findElement(By.xpath("//*[@id='checkin_span']")).getText(); 
		  
		  String errorMsg= "Check-In Date shall be before than Check-Out Date";
		  
		  if (actualMsg.equals("errorMsg")) {
			  System.out.println("Test Case 102 Passed"); }
			  
			  else { System.out.println("Test Case 102 Failed"); }
	
		  
		  
		  
	 
		  //Switch to a different url
		  driver.navigate().to("http://adactin.com/HotelApp/index.php"); 
		  
		  //Enter the username 
		  driver.findElement(By.name("username")).sendKeys("Gugulethu");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gugu1984");
		  driver.findElement(By.id("login")).click();
		  
		  //Select Location 
		  Select location2 = new Select(driver.findElement(By.xpath("//*[@id=\'location\']")));
		  location2.selectByVisibleText("Sydney");
		  
		  //Select Hotel 
		  Select Hotel2 = new Select(driver.findElement(By.xpath("//*[@id='hotels']")));
		  Hotel2.selectByVisibleText("Hotel Creek");
		  
		  //Select Room type 
		  Select RoomType2 = new Select(driver.findElement(By.xpath("//*[@id='room_type']")));
		  RoomType2.selectByVisibleText("Standard");
		  
		  //Select No of Rooms 
		  Select NoOfRooms3 = new Select(driver.findElement(By.xpath("//*[@id='room_nos']")));
		  NoOfRooms3.selectByValue("1");
		  
		  //Select date check in date
		  
		  driver.findElement(By.id("datepick_in")).click();
		  driver.findElement(By.id("datepick_in")).clear();
		  driver.findElement(By.name("datepick_in")).sendKeys("24/10/2019");
		  
		  //Select check out date driver.findElement(By.id("datepick_out")).click();
		  driver.findElement(By.id("datepick_out")).clear();
		  driver.findElement(By.name("datepick_out")).sendKeys("27/10/2019");
		  
		  //SelectAdults per room 
		  Select NoOfAdults = new Select(driver.findElement(By.xpath("//*[@id='adult_room']")));
		  NoOfAdults.selectByValue("1");
		  
		  //Click on Search driver.findElement(By.xpath("//*[@id='Submit']"));
		  driver.findElement(By.id("Submit")).click();
		  
		  
		  System.out.println("Test Case 103 Passed");
		  
		  
		  ////
		  
		  //Switch to a different url
		  driver.navigate().to("http://adactin.com/HotelApp/index.php");
		  
		  //Capture Login details
		  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Gugulethu");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gugu1984");
		  driver.findElement(By.id("login")).click();
		  
		  //Select Location 
		  Select location4 = new Select(driver.findElement(By.xpath("//*[@id=\'location\']")));
		  location4.selectByVisibleText("Sydney");
		  
		  //Select Hotel
		  Select Hotel4 = new Select(driver.findElement(By.xpath("//*[@id='hotels']")));
		  Hotel4.selectByVisibleText("Hotel Creek");
		  
		  //Select Room type 
		  Select RoomType4 = new Select(driver.findElement(By.xpath("//*[@id='room_type']")));
		  RoomType4.selectByVisibleText("Standard");
		  
		  //Select No of Rooms 
		  Select NoOfRooms4 = new Select(driver.findElement(By.xpath("//*[@id='room_nos']")));
		  NoOfRooms4.selectByValue("1");
		  
		  //Select date check in date
		  
		  driver.findElement(By.id("datepick_in")).click();
		  driver.findElement(By.id("datepick_in")).clear();
		  driver.findElement(By.name("datepick_in")).sendKeys("24/10/2019");
		  
		  
		  //Select check out date driver.findElement(By.id("datepick_out")).click();
		  driver.findElement(By.id("datepick_out")).clear();
		  driver.findElement(By.name("datepick_out")).sendKeys("27/10/2019");
		  
		  //SelectAdults per room 
		  Select NoOfAdults3 = new Select(driver.findElement(By.xpath("//*[@id='adult_room']")));
		  NoOfAdults3.selectByValue("1");
		  
		  //Click on Search 
		  driver.findElement(By.xpath("//*[@id='Submit']"));
		  driver.findElement(By.id("Submit")).click();
		  
		  
		  
		// WebElement String G =
		// driver.findElement(By.xpath("//*[@id='hotel_name_0']")).getText();

		// WebElement String G =
		// driver.findElement(By.xpath("//*[@id='hotel_name_0']")).getText();
		//System.out.print(G);
		//

		// String HotelName = "Hotel Creek";

		// if driver.findElement(By.xpath("//*[@id='hotel_name_0']"))
		//

		// System.out.println("Test Case 104 Passed");
		/// }else{
		// System.out.println("Test Case 104 Failed");
		// };
	}

}