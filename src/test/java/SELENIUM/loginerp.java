package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginerp {

	public static void main(String[] args) {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
       
        driver.get("http://projects.qedgetech.com/webapp/login.php");	
        
		 
		  
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("master");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='btnsubmit']"));
		login.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[@href='logout.php']"));
		logout.click();
	
		
	}

}
