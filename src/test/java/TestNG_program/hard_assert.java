package TestNG_program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {
@Test
public void TC1() {
	String s1= "pavu";
	String s2= "pavu";
	Assert.assertEquals(s1,s2);
	System.out.println("boss i am after passing TC1");
	System.out.println("boss i am loading");
}
}
