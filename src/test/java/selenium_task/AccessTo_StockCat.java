package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessTo_StockCat {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://projects.qedgetech.com/webapp/login.php");
		 
		  WebElement username = driver.findElement(By.id("username"));
		  username.clear();
		  username.sendKeys("admin");
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.clear();
		  password.sendKeys("master");
		  
		  WebElement login = driver.findElement(By.id("btnsubmit")) ;
		  login.click();
		  
		  WebElement StockItems = driver.findElement(By.id("mi_a_stock_items"));
		  
		  StockItems.click();
		  
				 

	}

}
