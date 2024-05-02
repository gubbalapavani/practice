package practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	//1.get()>> to open application
	driver.get("https://www.google.com");
	//2.close()>> to close the application
	driver.close();
	
}
}
