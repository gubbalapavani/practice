package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	//UN 
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	//pwd
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	//Click On Login btn
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//get the title of Homepage
	String actT = driver.getTitle();
	System.out.println(actT); 
	String expT="Swag Labs";
	//Verification
	if(expT.equals(actT)) {
		System.out.println("Boss User is navigated to Home Page");
	}
	else {
		System.out.println("Boss Login is not Done properly");
	}
}
}
