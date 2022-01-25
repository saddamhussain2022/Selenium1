package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erpreset {

	public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		WebElement uid = driver.findElement(By.id("username"));
		uid.clear();
		uid.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys(" master");
		driver.findElement(By.id("btnreset")).click();
		String actresult = driver.findElement(By.id("username")).getText();
		String actresult1 = driver.findElement(By.id("password")).getText();
		if(actresult.equals(""))
		{
		System.out.println("Reset tc is passed");
		}else if(actresult1.equals(""))
		{
		System.out.println("Reset tc is passed");

		}else
		{
		System.out.println("Reset tc is Failed");
		}
}

}
