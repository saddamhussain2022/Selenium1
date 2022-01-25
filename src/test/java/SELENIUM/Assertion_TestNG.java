package SELENIUM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion_TestNG {

	 @Test
	 public void testcase() {
		 System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
	 }
		 


}
