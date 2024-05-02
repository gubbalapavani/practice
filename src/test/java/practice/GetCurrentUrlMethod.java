package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) {
		//it will get the title of webpage
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		//get the current url
		String url = driver.getCurrentUrl();
		System.out.println(url );
}
}
