package Testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.Screenshots;

public class Listeners implements ITestListener {
	WebDriver driver;
	public void onTestStart(ITestResult result) {  
		
		System.out.println("Test is Started : "+result.getName());
	}  
	  
	 
	public void onTestSuccess(ITestResult result) {  

	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  
	
	public void onTestFailure(ITestResult result) {  
	
	try {
		Screenshots.takescreenshot( driver, "anup");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Hello this failed : "+result.getName());
	}  
	  
	
	public void onTestSkipped(ITestResult result) {  
	
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	
	
	}  
	  
	 
	public void onStart(ITestContext context) {  
	 
	}  
	  
	 
	public void onFinish(ITestContext context) {  
 
	}  
}
