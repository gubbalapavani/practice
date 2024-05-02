package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handling_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new EdgeDriver();
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
driver.switchTo().frame("iframeResult");
WebElement FN = driver.findElement(By.xpath("//input[@id='fname']"));
FN.clear();
FN.sendKeys("pavani");
WebElement LN = driver.findElement(By.xpath("//input[@id='lname']"));
LN.clear();
LN.sendKeys("gubbala");
driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
