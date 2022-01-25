package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpop_Down_List1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.apsrtcpass.in/counterstupass.do");

		WebElement District = driver.findElement(By .id("distId"));
		Select saddam = new Select(District);
		saddam.selectByVisibleText("KURNOOL");
		Thread.sleep(3000);
		
		WebElement Mandal = driver.findElement(By.id("man"));
		Select saddam1 = new Select(Mandal);
		saddam1.selectByVisibleText("ORVAKAL");
		Thread.sleep(3000);
		
		
		WebElement Village = driver.findElement(By.id("vilId"));
		Select sc = new Select( Village);
		sc.selectByVisibleText("KALVA");
		WebElement Address = driver.findElement(By.xpath("//textarea[@rows='1']"));
		 Address.sendKeys("mainroad,1-54");
	//creating an object for select class
		//Select sc = new  Select(Mandal_ddl);
		
		//int count = sc.getOptions().size();
		//System.out.println(count);
		//sc.selectByIndex(count-18);
		Thread.sleep(4000);
		driver.close();

	}

}
