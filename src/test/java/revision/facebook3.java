package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver drive =new EdgeDriver();
drive.get("https://www.facebook.com");
Thread.sleep(2000); 
drive.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(2000);
drive.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("pavani");
drive.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("gubbala");
drive.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("4676876457");
Thread.sleep(2000);
drive.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("vasanthi");
WebElement day=drive.findElement(By.xpath("//select[@id='day']"));
Select s= new Select(day);
s.selectByVisibleText("17");
Thread.sleep(2000);
WebElement month = drive.findElement(By.xpath("//select[@id='month']"));
Thread.sleep(2000);
Select s1=new Select(month);
s1.selectByVisibleText("Jun");
WebElement year = drive.findElement(By.xpath("//select[@id='year']"));
Thread.sleep(2000);
Select s2=new Select(year);
s2.selectByVisibleText("2002");
drive.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	}


}
