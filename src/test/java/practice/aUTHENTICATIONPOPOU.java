package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class aUTHENTICATIONPOPOU {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//customer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	//click on submit
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//how to handle alert popup
	Alert alt = driver.switchTo().alert();
	//click on ok btn
	alt.accept();
	//get teh text
	System.out.println(alt.getText());
}
}
