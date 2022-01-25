package myfirstcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		 
		
		//Classname obj = new Classname();
		  
System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		 
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		 username.sendKeys("");
		 password.sendKeys("");
		 login.click();
		
	  

	}

}
