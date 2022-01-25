package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Functionality_FaceBook {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       
        driver.get("https://www.facebook.com/" );			 
		
        		 
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement button  =  driver.findElement(By.xpath("//button[@name='login']"));
        
        username.sendKeys("shaikrabbani6271@gmail.com");
        password.sendKeys("rabbani1234");
        button.click();	
        
	}

}

