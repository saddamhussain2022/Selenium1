package selenium_task;

import org.openqa.selenium.By;

import SELENIUM.basemethods;

public class AccessToStockitems {

	public static void main(String[] args) {
		 //verify the user access to the stockitems page
		//steps
		//1) open browserBy.
		//2)launch url
		//3)login admin
		//4)click on stock item menu
		
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		basemethods.loginERP();
		basemethods.driver.findElement(By.xpath("//*[@id=\"mi_a_stock_items\"]")).click();
		String actresult = basemethods.driver.findElement(By.id("ewPageCaption")).getText();
		 
		if(actresult.equals("Stock Items")){
			 
			System.out.println("test case is  passed");
		}
		else {
			System.out.println("test case is failed");
		}
	}

}
