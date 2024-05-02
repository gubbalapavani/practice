package revision;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class all_groups {
@Test(priority = 1,groups = "Smoke")
public void verifyLink() {
	Reporter.log("smoketest",true);
}
@Test(priority = 2,groups = "Functional")
public void verifyLogin() {
	Reporter.log("functionaltest",true);
}
@Test(priority = 3,groups = "Smoke")
public void verifyLogo() {
	Reporter.log("smoketest",true);
}
@Test(priority = 4,groups = "Functional")
public void verifyLogoout() {
	Reporter.log("functionaltest",true);
}

}
