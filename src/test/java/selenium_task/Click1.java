package selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Click1 {
	@BeforeMethod
	public void openbrowse() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		basemethods.loginERP();
		
	}
  @Test
  public void AddStockItems() {
	  basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
		 basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		basemethods.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
		Select Stockcat = new Select(basemethods.driver.findElement(By.id("x_Category")));
		Stockcat.selectByVisibleText("s");
		Select supplier = new Select(basemethods.driver.findElement(By.id("x_Supplier_Number")));
		
		supplier.selectByVisibleText("sdm");
		basemethods.driver.findElement(By.id("x_Stock_Name")).sendKeys("yoyo");
		basemethods.driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("abcd");
		basemethods.driver.findElement(By.id("x_Purchasing_Price")).sendKeys("1200");
		basemethods.driver.findElement(By.id("x_Selling_Price")).sendKeys("1500");
		basemethods.driver.findElement(By.id("x_Notes")).sendKeys("new phone");
		basemethods.driver.findElement( By.id("btnAction")).click();
		 String alertwindow = basemethods.driver.getWindowHandle();
		 basemethods.driver.switchTo().window(alertwindow);
		 basemethods.driver.findElement(By.xpath( "//button[@class='ajs-button btn btn-primary']")).click();
		 String actresult = basemethods.driver.findElement(By.id("el3_a_stock_items_Stock_Name")).getText();
		 Assert.assertEquals(  actresult, "yoyo");
  }
}
