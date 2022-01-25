package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erp_custemer {

	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("http://projects.qedgetech.com/webapp/login.php");
			 WebElement username= driver.findElement(By.id("username"));
	         username.clear();
	         username.sendKeys("admin");
	         WebElement password = driver.findElement(By.id("password"));
	         password.clear();
	         password.sendKeys("master");
	         WebElement login = driver.findElement(By.id("btnsubmit"));
	         login.click();
	         
	         WebElement customers = driver.findElement(By.xpath("//*[@id=\"mi_a_customers\"]/a"));
	         customers.click();
	         String actresult = driver.findElement(By.id("ewPageCaption")).getText();
	         
	         if(actresult.equals("customers")) {
	        	 System.out.println(" customer page is diaplayed, and test is passed");
	         }
	         else {
	        	 System.out.println(" customer page not displayed, and test case is failed");
	         }


	}

}
