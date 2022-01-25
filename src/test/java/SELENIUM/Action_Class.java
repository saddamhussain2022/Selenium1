package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		 RightClick();
	}		
	
	
	public static void RightClick() {
		WebDriver driver = new ChromeDriver();
	//creating an object
		Actions ac = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		WebElement tagsTextBox = driver.findElement(By.xpath("//input[@id='tags']"));
		
		ac.contextClick(tagsTextBox).build().perform();
			
			
}

}
