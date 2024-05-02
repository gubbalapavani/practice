package paralle_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A {
@Test
public void TC1() {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
}
}
 