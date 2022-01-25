package myfirstcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Delete_Custemer {
	
	
	@BeforeMethod
	public void openbrowser() {
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		 
	}
  @Test
  public void  login() {
	  basemethods.loginERP();
	  basemethods.driver.findElement(By.id("mi_a_stock_items")).click();
	  basemethods.driver.findElement(By.id("key")).click();
	  basemethods.driver.findElement(By.xpath("//span[@data-phrase='ButtonActions']")).click();
	  basemethods.driver.findElement(By.xpath(" //a[@data-caption='Delete Selected Records']")).click();
	  String res =basemethods.driver.getWindowHandle();
	  basemethods.driver.switchTo().window(res);
	  basemethods.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	  
	   
	   
	  
  }
  
}
