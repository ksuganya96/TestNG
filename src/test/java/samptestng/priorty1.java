package samptestng;

import org.testng.annotations.Test;
public class priorty1 {
@Test(priority=3)
public void sugu() 
{
	System.out.println("sugu method1");
}
@Test(priority=2)
public void nishu() 
{
	System.out.println("nishu method2");
}
@Test(priority=1)
public void krish() 
{
	System.out.println("krish method3");
}
}
