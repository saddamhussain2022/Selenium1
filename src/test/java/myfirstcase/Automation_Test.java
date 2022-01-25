package myfirstcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		
		
		//Creating a Web Driver Object
		
		
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();		  
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(4000);
		  driver.close();
		

		
	}

}
