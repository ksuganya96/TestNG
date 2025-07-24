package samptestng;

import org.testng.annotations.Test;

public class parallelclass1 {
@Test
	public void nishu() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("nishu 1");	
}
@Test
public void sugu() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("sugu 2");	
}
@Test
public void krish() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("krish 3");	
}
}
