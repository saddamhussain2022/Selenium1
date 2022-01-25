package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWmdow {

	public static void main(String[] args) {
		 
System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebElement about_link = driver.findElement(By.xpath("//div[text()='About']"));
		WebElement Blog_link = driver.findElement(By.xpath("//div[text()='Blog']"));
		WebElement api_link = driver.findElement(By.xpath("//div[text()='API']"));
		
		about_link.click();
		Blog_link.click();
		api_link.click();
		
		int count = driver.getWindowHandles().size();
		System.out.println("Count  of windows opened = " +count);
		//how to switch to windows and get the 
           
				
		

	}

}
