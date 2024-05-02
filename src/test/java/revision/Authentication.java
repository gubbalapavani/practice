package revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Alert alt=driver.switchTo().alert();
alt.accept();
System.out.println(alt.getText());
	}

}
