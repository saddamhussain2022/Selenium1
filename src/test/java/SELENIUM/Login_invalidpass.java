package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_invalidpass {

	public static void main(String[] args) {
		 
System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		
		 
        WebElement username= driver.findElement(By.id("username"));
         username.clear();
         username.sendKeys("admin");
         WebElement password = driver.findElement(By.id("password"));
         password.clear();
         password.sendKeys("hello");
         WebElement login = driver.findElement(By.id("btnsubmit"));
         login.click();
          
         String actresult = driver.findElement(By.xpath("//div[@class='alert alert-danger ewError']")).getText();
          
         if(actresult.contains("Incorrect")) {
        	 
        	 System.out.println("test is passed");
         }
         else {
        	 System.out.println("test case is faileds");
        	 
         }
        }

}
