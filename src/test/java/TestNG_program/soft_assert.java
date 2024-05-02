package TestNG_program;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	@Test
	public void TC1() {
		String s1= "pavu";
		String s2= "pavu";
	SoftAssert s= new SoftAssert();
	s.assertEquals(s1, s2);
	System.out.println("boss i am after passing TC1");
	s.assertAll();
}
}