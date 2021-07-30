package listenerPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotationClass {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I AM IN BEFORE METHOD");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I AM IN AFTER METHOD");
	}
	
	@Test
	public void testMethod1(){
		System.out.println("I am in testMethod1");
	}

}
