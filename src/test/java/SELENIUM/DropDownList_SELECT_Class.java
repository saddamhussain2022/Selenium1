package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList_SELECT_Class {

	public static void main(String[] args) throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		driver.manage().window().maximize();
		
		WebElement District_ddl  = driver.findElement(By.xpath("//select[@id='distId']"));
		
		 //we can handle drop down list  by using select class
		
		 Select sc = new Select(District_ddl);
		 
		 Thread.sleep(4000);
		 
		   // by index(index will start from 0)
		 sc.selectByIndex(2);
		 
		 Thread.sleep(4000);  
		  //by value
		 sc.selectByValue("4");
		 
		 
		 Thread.sleep(4000);   
		 //by visible text
		 sc.selectByVisibleText("KADAPA");
		 
		Thread.sleep(4000);
		 driver.close();
		 
		  
		
        
	} 

}
