package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SELENIUM.basemethods;

public class Accessto_unit {

	public static void main(String[] args) {
		
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		basemethods.loginERP();
		 WebElement stockItems = basemethods.driver.findElement(By.id("mi_a_stock_items"));
		  
		 Actions actions = new Actions(basemethods.driver);
		 actions.moveToElement(stockItems).build().perform();
		 //Actions.moveToElement("stockCategories").build().perform();
         
		WebElement  Unit =  basemethods.driver.findElement(By.id("mi_a_unit_of_measurement"));
		 actions.moveToElement(Unit).build().perform();
		 Unit.click();
		 String actualresult =   basemethods.driver.findElement(By.id("ewPageCaption")).getText();
		 
	 if(actualresult.equals("Unit of Measurement")) {
		 System.out.println("Unit of Measurement page displayed, test case is passed");
		 
	 }
	 else {
		 System.out.println("Unit of Measurement page not displayed, test case is failed");
	 }
	
	}  
	

}
