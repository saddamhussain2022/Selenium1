package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_Class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       
        driver.get("https://demo.guru99.com/test/newtours/register.php");			 
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		
		 //we can handle drop down list by using select class
		
		Select saddam = new Select(country);
		
		Thread.sleep(4000);
		// by secting index
		saddam.selectByIndex(8);
		Thread.sleep(3000);
		
		//by select value
		saddam.selectByValue("BARBADOS");
		Thread.sleep(3000);
		//by select visibletext
		
		saddam.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		driver.close();
		

	}

}
