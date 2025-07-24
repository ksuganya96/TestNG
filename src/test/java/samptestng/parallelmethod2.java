package samptestng;

import org.testng.annotations.Test;

public class parallelmethod2 {
	@Test
	public void parallel4()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println("para2.1");
	}
	@Test
	public void parallel5()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println("para2.2");
	}
	@Test
	public void parallel6()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println("para2.3");
	}
}
