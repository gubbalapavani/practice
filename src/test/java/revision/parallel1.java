package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel1 {
@Test
public  void TC1(){
	Reporter.log("TC1",true);
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.flipkart.com");
}
}
