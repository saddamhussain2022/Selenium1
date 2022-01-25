package selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Uom {
	@BeforeMethod
	public void launchbrowser() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
 		basemethods.loginERP();
	}
  @Test
  public void able_to_uom() {
	  WebElement StockItem = basemethods.driver.findElement(By.id("mi_a_stock_items"));
	   basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	 Actions  ac = new Actions(basemethods.driver);
	  ac.moveToElement(StockItem).build().perform();

 WebElement  uom = basemethods.driver.findElement(By.id( "mi_a_unit_of_measurement"));
ac.moveToElement(uom).build().perform();
 uom.click();
	  
  }
}
