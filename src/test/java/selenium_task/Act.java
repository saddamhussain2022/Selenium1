package selenium_task;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Act {
	@BeforeMethod
	public void openerp () {
		
	basemethods.openBrowser("chrome");
	basemethods.launchERP();
	}
	
  @Test
  public void loginerp() {
	  basemethods.loginERP();
	  basemethods.driver.findElement(By.xpath("//*[@id=\"mi_a_stock_items\"]")).click();
		String actresult = basemethods.driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actresult ,  "Stock Items");
  }
}
