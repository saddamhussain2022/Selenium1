package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erp_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
       
        driver.get("http://projects.qedgetech.com/webapp/login.php");	
        
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("admin");
         
         
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("master");
        
        WebElement login = driver.findElement(By.id("btnsubmit"));
        login.click();
        
        String  actresult = driver.findElement(By.id("ewPageCaption")).getText();
        if(actresult.equals("Dashboard")) {
        	
        	System.out.println("login is success, and test case is passed");
        
        }
        else {
        	
        	System.out.println("unable to login, test case is failed..");
        }    
   }

    }
