package samptestng;

import org.testng.annotations.Test;

public class group1 {
@Test(groups= {"sugu","nishanth"})
public void test1()
{
	System.out.println("sun group1");
}
@Test(groups= {"nishanth"})
public void test2()
{
	System.out.println("moon group1");
}
public void test3()
{
	System.out.println("saturn group1");
}
}
