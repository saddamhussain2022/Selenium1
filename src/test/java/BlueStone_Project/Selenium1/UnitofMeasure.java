package BlueStone_Project.Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  UnitofMeasure {
	
	
	@BeforeMethod
	public void openerp() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
  @Test
  public void loginerp() {
	  basemethods.loginERP();
	  WebElement StockItem = basemethods.driver.findElement(By.id("mi_a_stock_items"));
		   basemethods.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 Actions  ac = new Actions(basemethods.driver);
		  ac.moveToElement(StockItem).build().perform();
 
	  WebElement stockcat = basemethods.driver.findElement(By.id("mi_a_stock_categories"));
     ac.moveToElement(stockcat).build().perform();
     stockcat.click();
  }
}
