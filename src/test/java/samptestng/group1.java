package samptestng;

import org.testng.annotations.Test;

public class group1 {
@Test(groups= {"sugu","nishan"})
public void test1()
{
	System.out.println("sun group1");
}
@Test(groups= {"nishu"})
public void test2()
{
	System.out.println("moon group1");
}

}
