package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		//SwitchToFrame_ByIndex();
		//SwitchToFrame_ByNameId();
		SwitchToFrame_ByWebElement();
	}
    public static void SwitchToFrame_ByIndex() {
    
    	System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://the-internet.herokuapp.com/iframe");
	   driver.switchTo().frame(0);
	   WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']")); 
	   textBox.clear();
	   textBox.sendKeys("saddam hussain");
}
         public static void SwitchToFrame_ByNameId() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
 	   WebDriver driver = new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.get("https://the-internet.herokuapp.com/iframe");
 	   driver.switchTo().frame("mce_0_ifr");
 	   WebElement textBox = driver.findElement(By.id("tinymce"));
 	   textBox.clear();
 	  textBox.sendKeys("saddam hussain mittakandala");
}
         public static void SwitchToFrame_ByWebElement() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://the-internet.herokuapp.com/iframe");
   WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
  
   driver.switchTo().frame(iFrame);
   WebElement textBox = driver.findElement(By.id("tinymce"));
	   textBox.clear();
	  textBox.sendKeys("saddam");
	  Thread.sleep(5000);
	  driver.close();
	  
}
}
