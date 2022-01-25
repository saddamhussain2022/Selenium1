package BlueStone_Project.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SELENIUM.basemethods;

public class New_Actions {

	public static void main(String[] args) throws InterruptedException {
		 
	
	System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
	  

		WebDriver driver = new ChromeDriver();
		
		 
		driver.manage().window().maximize();
		driver.get( " https://twitter.com/");
		 basemethods.driver  .findElement(By.xpath("nsm7Bb-HzV7m-LgbsSe-BPrWId")).click();
		 
		  
		 
		
	}

}
