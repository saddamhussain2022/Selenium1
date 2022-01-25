package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://slprb.ap.gov.in/");  
		String Titlename = driver.getTitle();

		
		String reqTitle = "ANDHRA PRADESH POLICE RECRUITMENT BOARD";
		 
		if((Titlename.equals(reqTitle)))
			
		{ 
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		Thread.sleep(6000);
		driver.quit();		
		
		 
	}

}
