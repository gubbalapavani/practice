package group_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllGroups {
@Test(priority = 1,groups = "SmokeTest")
public void verifyLink() {
	Reporter.log("smoketestcase",true);
}
@Test(priority = 3,groups = "Functional")
public void verifyLogin() {
	Reporter.log("Functionaltestcase",true);
}
@Test(priority = 2,groups = "SmokeTest")
public void verifyLogo() {
	Reporter.log("smoketestcase",true);
}
@Test(priority = 4,groups = "Functional")
public void verifyLogout() {
	Reporter.log("Functionaltestcase",true);
}
}
