package SELENIUM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class  param {
      
basemethods base;
	
	@Parameters({ "browser" })
	@Test
	public void testCaseOne(String browser) {
		System.out.println("browser passed as :- " + browser);
		if (browser.equals("chrome")) {
			// Write the code to launch chrome browser
		}
		else if (browser.equals("firefox")) {
			// Write the code to launch firefox browser
		}
		else {
			// Write the code to display no information of the browser..
		}
	}

	@Parameters({ "username", "password" })
	@Test
	public void testCaseTwo(String username, String password) {
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
		
		 basemethods.openBrowser("chrome");
		 basemethods.launchERP();
		 basemethods.
	}
}
   	}
}
