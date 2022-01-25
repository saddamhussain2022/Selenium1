package BlueStone_Project.Selenium1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class SearchStockitem {
	
	@BeforeMethod 
	public void openERP() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
	@Test
	public void loginErp() {
		basemethods.loginERP();
		
		basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
		basemethods.driver.findElement(By.xpath("//span[@data-caption='Search']")).click();
		basemethods.driver.findElement(By.id("psearch")).sendKeys("oneplus");
		basemethods.driver.findElement(By.id("btnsubmit")).click();
		String result = basemethods.driver.findElement(By.xpath("//span[@id='el1_a_stock_items_Stock_Name']")).getText();
		Assert.assertEquals(result, "oneplus");
		 
		
	}
	

}
