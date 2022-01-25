package BlueStone_Project.Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Add_item2 {
	
@BeforeMethod
	
	public void openerp() {
		basemethods.openBrowser("chrome");
		
		basemethods.launchERP();	
	}
  @Test
  public void loginerp() {
	  basemethods.loginERP();
	  basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
	  basemethods.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 basemethods.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
	 Select stockcat = new Select(basemethods.driver.findElement(By.id("x_Category")));
	 stockcat.selectByVisibleText("samosa");
	 Select supplier = new Select(basemethods.driver.findElement(By.id("x_Supplier_Number")));
	 supplier.selectByVisibleText("sdm");
	 basemethods.driver.findElement(By.id("x_Stock_Name")).sendKeys(" mango");
	 Select uom = new Select(basemethods.driver.findElement(By.id( "x_Unit_Of_Measurement")));
	 uom.selectByVisibleText("abcd");
	 basemethods.driver.findElement(By.id("x_Purchasing_Price" )).sendKeys("19830");
	 basemethods.driver.findElement(By.id( "x_Selling_Price")).sendKeys("234567");
	 
	 basemethods.driver.findElement(By.id("x_Notes")).sendKeys("iam good");
	 basemethods.driver.findElement(By.id("btnAction")).click();
	 String alertwindow = basemethods.driver.getWindowHandle();
	 basemethods.driver.switchTo().window(alertwindow);
	 basemethods.driver.findElement(By.xpath(" //button[@class='ajs-button btn btn-primary']")).click();
	 
			 
  }
}
