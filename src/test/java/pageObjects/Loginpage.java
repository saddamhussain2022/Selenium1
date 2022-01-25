package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By LoginButton = By.xpath("//button[@id='btnsubmit']");
	public static String baseurl; 
	public static String uname; 
	public static String upass; 

	public void LoginPage(WebDriver driver) {
	   this.driver=driver;
	}

	/*
	 * public static void readConfigProperties() {
	 * 
	 * readProperties get = new readProperties(); get.readData(); baseurl =
	 * readProperties.appurl; uname = readProperties.username; upass =
	 * readProperties.pwd;
	 * 
	 * }
	 */
	public void launchERP() {
		\\LoginPage.readConfigProperties();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
}
