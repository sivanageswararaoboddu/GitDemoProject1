package listenerPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGListenerDemo1 {
	
	@Test  
	public void sum()  
	{  
		int sum=0;  
		int a=5;  
		int b=7;  
		sum=a+b;  
		System.out.println(sum);  
		
	}
	
	
	@Test  
	public void testtopass()  
	{  
		System.out.println("I am in TestNGListenersDemo1 Class Pass Method");
		Assert.assertTrue(false);  
	}  
	
	
	
	@Test 
	public void testSkip(){
		System.out.println("I am in TestSkip Method");
		throw new SkipException("This test is skipped");
	}
	

}
