package Selenium3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertest {

	@Test(dataProvider="dp")//dp=method name
	public void f(Integer n,String s)
	{
		System.out.println("ln:"+n+" and s" +s);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	}
	
	@DataProvider public Object[][] dp()
	 { 
	return new Object[][] 
	{ new Object[] { 1, "a" }, 
	new Object[] { 2, "b" }, 
	};
	 } 
	}
	


