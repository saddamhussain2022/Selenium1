package myfirstcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Updatestockitem {
	@BeforeMethod
	public void launchbrowser() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		basemethods.loginERP();
	}
  @Test
  public void Update_Stock_Item() {
	  basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
	  basemethods.driver.findElement(By.xpath("//span[@data-phrase='SearchBtn']")).click();
	  basemethods.driver.findElement(By.name("psearch")).sendKeys(" tango");
	  basemethods.driver.findElement(By.id("btnsubmit")).click();
		 basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 basemethods.driver.findElement(By.xpath(" //span[@data-phrase='EditLink']")).click();
		 Select Stockcat = new Select(basemethods.driver.findElement(By.id(" x_Category")));
		 ((WebElement) Stockcat).clear(); 
	      Stockcat.selectByVisibleText("mobiles");
	      Select supplier = new Select(basemethods.driver .findElement(By.id("x_Supplier_Number")));
		  supplier.selectByVisibleText(" vivo");
		  basemethods.driver.findElement(By.id("x_Stock_Name")).sendKeys(" tango");
		  Select uom = new Select(basemethods.driver.findElement(By.id("x_Unit_Of_Measurement")));
		  uom.selectByVisibleText("number");
		  basemethods.driver.findElement(By.id("x_Purchasing_Price")).sendKeys("100000");
		  basemethods.driver.findElement(By.id("x_Selling_Price")).sendKeys("120000");
		  basemethods.driver.findElement(By.id("x_Notes")).sendKeys("New Model of iPhone 13");
		  basemethods.driver.findElement(By.id("btnAction")).click();
		 
   //basemethods.driver.findElement(By.xpath("//input[@value='439']")).click();
  // basemethods.driver.findElement(By.xpath(" //span[@data-phrase='ButtonActions']")).click();
  // basemethods.driver.findElement(By.xpath("//a[@data-caption='Update Selected Records']")).click();
   
			}
}
