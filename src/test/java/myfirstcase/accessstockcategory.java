package myfirstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SELENIUM.basemethods;

public class accessstockcategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		basemethods.loginERP();
		 WebElement stockItems = basemethods.driver.findElement(By.id("mi_a_stock_items"));
		  
		 Actions act = new Actions(basemethods.driver);
		 act.moveToElement(stockItems).build().perform();
		 //Actions.moveToElement("stockCategories").build().perform();
		 WebElement  stockCat = basemethods.driver.findElement(By.id("mi_a_stock_categories"));
		 act.moveToElement(stockCat).build().perform();
		 stockCat.click();
		 
		 
		 
		 
	}
	

}
