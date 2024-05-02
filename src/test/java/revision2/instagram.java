package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class instagram {
	public static void main(String[] args) throws Throwable {
		
WebDriver driver= new EdgeDriver();
driver.get("https://www.instagram.com");
driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys("pavani");
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[2]")).sendKeys("pavu@123");
driver.findElement(By.xpath(" //button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
}
}