package samptestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class samp {
	@BeforeSuite 
	public void test1()
	{
	System.out.println("BeforeSuite");	
	}
	@BeforeTest
	public void test10()
	{
		System.out.println("BeforeTest");	
	}
@BeforeClass
public void test2()
{
	System.out.println("BeforeClass");	
}
@BeforeMethod
public void test3()
{
	System.out.println("BeforeMethod");
}
@AfterClass
public void test4()
{
	System.out.println("AfterClass");	
}
@AfterMethod
public void test5()
{
	System.out.println("AfterMethod");
}

@AfterSuite
public void test6()
{
	System.out.println("AfterSuite");
}
@AfterTest
public void test7()
{
	System.out.println("AfterTest");
}
@Ignore 
public void test8()
{
	System.out.println("Ignore");
}
@Test
public void test9()
{
	System.out.println("Test");
}
}
