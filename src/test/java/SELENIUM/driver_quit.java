package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_quit {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		driver.get("https://twitter.com/?lang=en");
		Thread.sleep(6000);
		driver.get("https://myaccount.google.com/intro/signing-in-to-google");
		Thread.sleep(6000);
		driver.quit();
	}

}
