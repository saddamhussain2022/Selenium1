package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List {

	public static void main(String[] args) throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		WebElement District_ddl = driver.findElement(By.xpath(" //select[@id='distId']"));
	// creating an object for select class
		Select sc = new Select( District_ddl);
		int count =  sc.getOptions().size();
		
        System.out.println(count);
        
        sc.selectByIndex(count-14);
          Thread.sleep(6000);
     
        driver.close();		

	}

}
  