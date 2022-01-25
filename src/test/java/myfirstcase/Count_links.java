package myfirstcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_links {

	public static void main(String[] args) {
		 
System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
	
       int count = links.size();
       System.out.println(count);
       links.get(6).click();
       // for add number links
       for(int i=1; i<count; i++) {
    	   
    	   if(i%2!=0) {
    		   System.out.println(i);
    		   
    	   }
    	   //for all links with names
    	  // WebElement a = links.get(i);
    	   //String c = a.getText();
    	   //System.out.println(c);
    	   
       }
       
       //links.get(16).click();
	}

}
