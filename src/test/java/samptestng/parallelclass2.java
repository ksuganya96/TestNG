package samptestng;

import org.testng.annotations.Test;

public class parallelclass2 {
	@Test
	public void nishu1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("nishu 4");
		
	}
	@Test
	public void sugu1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("sugu 5");
		
	}
	@Test
	public void krish1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("krish 6");
		
	}
}
