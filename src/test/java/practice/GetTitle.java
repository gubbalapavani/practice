package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {
public static void main(String[] args) {
	//it will get the title of webpage
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	//take the title of page
	String tit = driver.getTitle();
	System.out.println(tit);
}
}
 