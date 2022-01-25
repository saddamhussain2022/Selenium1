package myfirstcase;

import org.openqa.selenium.By;

import SELENIUM.basemethods;

public class Resettc {

	public static void main(String[] args) {
		
		
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
		
		
		basemethods.driver.findElement(By.xpath("//button[@id='btnreset']")).click();
	   String  uname = basemethods.driver.findElement(By.xpath("// input[@id='username']")).getText();
	   String  upass = basemethods.driver.findElement(By.xpath("// input[@id='password']")).getText();
	   
	   if( (uname.equals("")) && (upass.equals(""))){
		  System.out.println("reset test case is passed..");
       }
       else {
    	   System.out.println("reset test case is failed");
       }
	
	}
	

}
