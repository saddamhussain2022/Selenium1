package myfirstcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class AddStockItems {
	
	@BeforeMethod
	public void openErP () {
		
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
	
	
  @Test
  public void Adminuserlogin() {
	  basemethods.loginERP();
 
	  basemethods.driver.findElement( By.id("mi_a_stock_items")).click();
	  basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  basemethods.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
      Select Stockcat = new Select(basemethods.driver.findElement(By.id("x_Category")));
      Stockcat.selectByVisibleText("mobiles");
      Select supplier = new Select(basemethods.driver .findElement(By.id("x_Supplier_Number")));
	  supplier.selectByVisibleText("sdm");
	  basemethods.driver.findElement(By.id("x_Stock_Name")).sendKeys("iPhone 13");
	  Select uom = new Select(basemethods.driver.findElement(By.id("x_Unit_Of_Measurement")));
	  uom.selectByVisibleText("number");
	  basemethods.driver.findElement(By.id("x_Purchasing_Price")).sendKeys("100000");
	  basemethods.driver.findElement(By.id("x_Selling_Price")).sendKeys("120000");
	  basemethods.driver.findElement(By.id("x_Notes")).sendKeys("New Model of iPhone 13");
	  basemethods.driver.findElement(By.id("btnAction")).click();
	  String alertwindow = basemethods.driver.getWindowHandle();
	  basemethods.driver.switchTo().window(alertwindow);
	  basemethods.driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  basemethods.driver.findElement(By.xpath( "//button[@class='ajs-button btn btn-primary']")).click();
	  basemethods.driver.findElement( By.id("mi_a_stock_items")).click();
	  basemethods.driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  basemethods.driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search ewIcon']")).click();
	  basemethods.driver.findElement(By.id("psearch")).sendKeys("iphone 13");
	  basemethods.driver.findElement(By.id("btnsubmit")).click();
	String res = basemethods.driver.findElement(By.xpath("//td[@data-name='Stock_Name']")).getText();
	Assert.assertEquals(res, "iPhone 13");
	
	 
	  
	 
      
     
  
  
  }
  
  
  
}
