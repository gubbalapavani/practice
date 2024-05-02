package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws Throwable {
		
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("pavani");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pavani@123");
//driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pavani");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gubbala");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("vasu");
Thread.sleep(2000);
WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
Select s=new Select(day);
s.selectByVisibleText("17");
Thread.sleep(2000);
WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
Select m=new Select(month);
m.selectByVisibleText("Jun");
Thread.sleep(2000);
WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
Select y=new Select(year);
y.selectByVisibleText("2002");
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}
}