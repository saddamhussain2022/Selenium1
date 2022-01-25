package SELENIUM;
  

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofLinksInPage {

	public static void main(String[] args) throws InterruptedException {
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       
		driver.get("https://www.apsrtconline.in/oprs-web/ ");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		int count = links.size();
		
		System.out.println(count);
		
		links.get(15).click();
		Thread.sleep(5000);
		driver.close();
		 

}
} 