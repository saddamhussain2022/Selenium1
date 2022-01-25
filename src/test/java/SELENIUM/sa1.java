package SELENIUM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  sa1 {
	
	@BeforeMethod
	public void openERP()
	{
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
	
	/*
	 * @AfterMethod public void closeERP() { basemethods.driver.close(); }
	 */
	
  @Test
  public void TC_1_Verify_AdminUser_Can_Login_With_Valid_UserCrendentials(){
	  
	  
	  basemethods.loginERP(); 
	  basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
	  
	 basemethods.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
	 basemethods.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 Select stockCat = new Select(basemethods.driver.findElement(By.id("x_Category")));
	 stockCat.selectByVisibleText("mobiles");
	 Select supplier = new Select(basemethods.driver .findElement(By.id("x_Supplier_Number")));
	  supplier.selectByVisibleText("Harry");
	  basemethods.driver.findElement(By.id("x_Stock_Name")).sendKeys("iPhone 13");
	  Select uom = new Select(basemethods.driver.findElement(By.id("x_Unit_Of_Measurement")));
	  uom.selectByVisibleText("Numbers");
	  basemethods.driver.findElement(By.id("x_Purchasing_Price")).sendKeys("100000");
	  basemethods.driver.findElement(By.id("x_Selling_Price")).sendKeys("120000");
	  basemethods.driver.findElement(By.id("x_Notes")).sendKeys("New Model of iPhone 13");
	  basemethods.driver.findElement(By.id("btnAction")).click();
	  String alertWindow = basemethods.driver.getWindowHandle();
	  basemethods.driver.switchTo().window(alertWindow);
	  basemethods.driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  basemethods.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	  basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
	  basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  basemethods.driver.findElement(By.xpath(" //span[@class='glyphicon glyphicon-search ewIcon']")).click();
	  basemethods.driver.findElement(By.id("psearch")).sendKeys("iPhone 13");
	  basemethods.driver.findElement(By.id("btnsubmit")).click();
	  String res = basemethods.driver.findElement(By.xpath("//td[@data-name='Stock_Name']")).getText();
	  Assert.assertEquals(res,"iPhone 13"); 
	  
	 
  }
   
	  

	 
}
