package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basemethods {
	 public static WebDriver driver;
	
       public static void  openBrowser(String browserType) {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			driver.manage().window().maximize();

	}
		 
		 public static void launchERP() {
			  
			 driver.get("http://projects.qedgetech.com/webapp/login.php");
			 
		 }
		 
		 public static void loginERP() {
			 
			 WebElement username= driver.findElement(By.id("username"));
	         username.clear();
	         username.sendKeys("admin");
	         WebElement password = driver.findElement(By.id("password"));
	         password.clear();
	         password.sendKeys("master");
	         WebElement login = driver.findElement(By.id("btnsubmit"));
	         login.click();
	         
	         String actresult = driver.findElement(By.id("ewPageCaption")).getText();
	         
	         if(actresult.equals("Dashboard")) {
	        	 System.out.println("login is success. and test is passed");
	         }
	         else {
	        	 System.out.println("unable to login, and test case is failed");
	         }
	    


		 }
		 
}
