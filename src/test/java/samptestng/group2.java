package samptestng;

import org.testng.annotations.Test;

public class group2 {
	@Test(groups = {"sugu"})
	public void test3()
	{
		System.out.println("star group2");
	}
	@Test(groups = {"nishu","nishan"})
	public void test4()
	{
		System.out.println("galaxy group2");
	}
	}

