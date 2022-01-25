package BlueStone_Project.Selenium1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class DeleteStockitem {
	
	@BeforeMethod 
	public void openERP() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
	@Test
	public void loginErp() {
		basemethods.loginERP();
		basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
		basemethods.driver.findElement(By.xpath("//input[@value='423']")).click();
		basemethods.driver.findElement(By.xpath("//span[@data-caption='Actions']")).click();
		basemethods.driver.findElement(By.xpath("//a[@data-caption='Delete Selected Records']")).click();
		 String alertwindow = basemethods.driver.getWindowHandle();
		  basemethods.driver.switchTo().window(alertwindow);
		  basemethods.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();

}
}