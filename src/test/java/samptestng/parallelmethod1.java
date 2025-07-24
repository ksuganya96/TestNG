package samptestng;

import org.testng.annotations.Test;

public class parallelmethod1 {
@Test
public void parallel1()
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("para1.1");
}
@Test
public void parallel2()
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("para1.2");
}
@Test
public void parallel3()
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("para1.3");
}
}
