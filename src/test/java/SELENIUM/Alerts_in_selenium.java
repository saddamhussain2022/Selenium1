package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_in_selenium {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	}

	
	  public void click_ok_Button() {
		  WebDriver driver = new ChromeDriver();
		  driver.get("");
	  }
	  
}

