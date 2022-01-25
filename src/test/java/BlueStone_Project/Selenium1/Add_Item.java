package BlueStone_Project.Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Add_Item {
	
@BeforeMethod
	
	public void openerp() {
		basemethods.openBrowser("chrome");
		
		basemethods.launchERP();
		
	}
@Test
	public void AddStockItem() {
	basemethods.loginERP();
	basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
	 basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	basemethods.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
	Select Stockcat = new Select(basemethods.driver.findElement(By.id("x_Category")));
	Stockcat.selectByVisibleText("mobiles");
	Select supplier = new Select(basemethods.driver.findElement(By.id("x_Supplier_Number")));
	supplier.selectByVisibleText("sdm");
	basemethods.driver.findElement(By.id("x_Stock_Name")).sendKeys("yoyo");
	basemethods.driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("abcd");
	basemethods.driver.findElement(By.id("x_Purchasing_Price")).sendKeys("12500");
	basemethods.driver.findElement(By.id("x_Selling_Price")).sendKeys("15200");
	basemethods.driver.findElement(By.id("x_Notes")).sendKeys("new phone");
	basemethods.driver.findElement( By.id("btnAction")).click();
		
	}	
 
  }

