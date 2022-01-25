package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  AddStockCategory {
	@BeforeMethod
	public void openerp() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
  @Test
  public void loginerp() {
	  
	  basemethods.loginERP();
	  WebElement stockItems = basemethods.driver.findElement(By.id("mi_a_stock_items"));
	  
		 Actions act = new Actions(basemethods.driver);
		 act.moveToElement(stockItems).build().perform();
		 //Actions.moveToElement("stockCategories").build().perform();
		 WebElement  stockCat = basemethods.driver.findElement(By.id("mi_a_stock_categories"));
		 act.moveToElement(stockCat).build().perform();
		 stockCat.click();
		 basemethods.driver.findElement(By.xpath("//span[@data-phrase='AddLink']")).click();
		 basemethods.driver.findElement(By.id("x_Category_Name")).sendKeys("himacha");
		 basemethods.driver.findElement(By.id( "btnAction")).click();
		 String alertwindow = basemethods.driver.getWindowHandle();
		 basemethods.driver.switchTo().window(alertwindow);
		 basemethods.driver.findElement(By.xpath(" //button[@class='ajs-button btn btn-primary']")).click();
		 String  res = basemethods.driver.getWindowHandle();
		 basemethods.driver.switchTo().window( res);
		 basemethods.driver.findElement(By.xpath("ajs-button btn btn-primary")).click();
		 
		 
		 
		 
		 
  }
}
