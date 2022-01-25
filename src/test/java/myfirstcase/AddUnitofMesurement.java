package myfirstcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  AddUnitofMesurement {
	@BeforeMethod
	public void launchbrowser() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
 		basemethods.loginERP();
	}
	
	
  @Test
  public void UnitofM() {
	  WebElement StockItem = basemethods.driver.findElement(By.id("mi_a_stock_items"));
	   basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	 Actions  ac = new Actions(basemethods.driver);
	  ac.moveToElement(StockItem).build().perform();

WebElement  uom = basemethods.driver.findElement(By.id( "mi_a_unit_of_measurement"));
ac.moveToElement(uom).build().perform();
uom.click();
basemethods.driver.findElement(By.xpath("//span[@data-caption='Add']")).click();
basemethods.driver.findElement(By.id("x_UOM_ID")).sendKeys("zom");
basemethods.driver.findElement(By.id("x_UOM_Description")).sendKeys("zomato");
basemethods.driver.findElement(By.id("btnAction")).click();
String alertwindow = basemethods.driver.getWindowHandle();
basemethods.driver.switchTo().window(alertwindow);
basemethods.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();


  }
}
