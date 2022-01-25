package SELENIUM;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  TGlogin {
  
	@BeforeMethod
	public void openERP()
	{
		basemethods.openBrowser("chrome");
		basemethods.launchERP();
	}
	
	@AfterMethod
	public void closeERP()
	{
		basemethods.driver.close();
	}
	
	
	
	
	@Test 
  public void TC_1_Verify_AdminUser_Can_Login_With_Valid_UserCrendentials()
  {
		basemethods.loginERP(); 
				 
}
	
}
