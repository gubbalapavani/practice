package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver drive= new EdgeDriver();
drive.get("https://www.facebook.com");
drive.findElement(By.xpath("//input[@id='email']")).sendKeys("pavani");
drive.findElement(By.xpath("//input[@type='password']")).sendKeys("234567");
drive.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
