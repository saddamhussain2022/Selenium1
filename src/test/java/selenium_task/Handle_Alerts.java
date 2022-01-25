package selenium_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");

	}
	public void click_ok_button   () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		
	}

}
