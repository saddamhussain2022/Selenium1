package BlueStone_Project.Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		 

	}
	public static void SwitchToFrame_ByIndex() {
		
System.setProperty("webdriver.chrome.driver", "C:\\work_2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
	}

}
