package selenium_task;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import SELENIUM.basemethods;
 
  
  
 
public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------------");
		System.out.println("The ["+Result.getName()+ "] Test Case execution is started...");	
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------------");
		System.out.println("The ["+Result.getName()+ "] Test Case is Passed...");	

	}

	@Override
	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------------");
		System.out.println("The ["+Result.getName()+ "] Test Case is Failed...");	
	}
}