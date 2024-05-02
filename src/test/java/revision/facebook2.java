package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver drive= new EdgeDriver();
drive.get("https://www.facebook.com");
drive.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("pavani");
drive.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("355778");
drive.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}

}
