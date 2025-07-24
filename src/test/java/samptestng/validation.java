package samptestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class validation {
@Test
public void Test1() {
String s = "Aiite";
Assert.assertEquals("Aiit", s);
System.out.println("hard assert test");
}
@Test
public void Test2() {
	String s = "Aiite";
	Assert.assertTrue(s.contains("A"));
	System.out.println("test2");
	}	

@Test
public void Test3() {
	String s = "Aiite";
	Assert.assertFalse(s.contains("Z"));
	System.out.println("test3");
	}

@Test
public void Test4() {
	String s = "Aiite";
	SoftAssert s1 = new SoftAssert();
	s1.assertEquals("Aii", s);
	System.out.println("test4");
	}
}

