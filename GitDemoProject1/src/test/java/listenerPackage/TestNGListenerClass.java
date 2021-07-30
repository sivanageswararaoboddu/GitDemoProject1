package listenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerClass implements ITestListener {

	public void onTestStart(ITestResult result) {  
		// TODO Auto-generated method stub  
	}  

	public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Test is successful : "+result.getName());  
		System.out.println("Pass");
	}  

	public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Test is not successful : "+result.getName());  
		System.out.println("Fail");
	}  

	public void onTestSkipped(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Test is skipped : "+result.getName());  
		System.out.println("Skip");
	}  

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  

	public void onStart(ITestContext context) {  
		// TODO Auto-generated method stub 
		System.out.println("Tests Started: "+context.getName());
	}  

	public void onFinish(ITestContext context) {  
		// TODO Auto-generated method stub  
		System.out.println("Tests Completed: "+context.getName());
	} 

}
