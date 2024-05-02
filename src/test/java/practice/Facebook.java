package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//click on create new account Btn
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//store Day DD in ref var
	Thread.sleep(4000);
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	//Create object of Select class
	Thread.sleep(4000);
	Select s=new Select(day);
	//use selectbyvisibketext
	s.selectByVisibleText("24");
	//Month selwction
	Thread.sleep(4000);
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	//create object of select class
	Thread.sleep(4000);
	Select s1=new Select(month);
	s1.selectByVisibleText("Oct");
	
}
}
