package samptestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_Testdata {

	@Parameters({"username","password"})
	@Test
	public void test1(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
}
