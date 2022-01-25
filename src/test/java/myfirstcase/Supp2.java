package myfirstcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SELENIUM.basemethods;

public class  Supp2 {
	
	@BeforeMethod
	public void openERP() {
		basemethods.openBrowser("chrome");
		
		basemethods.launchERP();
		 
	}
	
  @Test
  public void  Adminlogin () {
	  basemethods.loginERP();
	  basemethods.driver.findElement(By.id("mi_a_suppliers")).click();
	 
	  basemethods.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
	  basemethods.driver.findElement(By.id("x_Supplier_Name")).sendKeys("sdm");
	  basemethods.driver.findElement(By.id("x_Address")).sendKeys("knl");
	  basemethods.driver.findElement(By.id("x_City")).sendKeys("hyd");
	  basemethods.driver.findElement(By.id("x_Country")).sendKeys("india");
	  basemethods.driver.findElement(By.id("x_Contact_Person")).sendKeys("sah");
	  basemethods.driver.findElement(By.id("x_Phone_Number")).sendKeys("9966887712");
	  basemethods.driver.findElement(By.id("x__Email")).sendKeys("samjam656@gmail.com");
	  basemethods.driver.findElement(By.id("x_Mobile_Number")).sendKeys("1284789");
	  basemethods.driver.findElement(By.id("x_Notes")).sendKeys("iam a good boy");
	  basemethods.driver.findElement(By.id("btnAction")).click();
	  String alertWindow = basemethods.driver.getWindowHandle();
	  basemethods.driver.switchTo().window(alertWindow);
	  basemethods.driver.findElement(By.xpath(" //button[@class='ajs-button btn btn-primary']")).click();
	  basemethods.driver.findElement( By.id("mi_a_suppliers")).click();
	  basemethods.driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  basemethods.driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search ewIcon']")).click();
	  basemethods.driver.findElement(By.id("psearch")).sendKeys("sah");
	  basemethods.driver.findElement(By.id("btnsubmit")).click();
	String res = basemethods.driver.findElement(By.id("el2_a_suppliers_Contact_Person")).getText();
	Assert.assertEquals(res, "abrasm");
	  
	  
  }
}
