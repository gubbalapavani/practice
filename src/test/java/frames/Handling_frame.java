package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Handling_frame {
public static void main(String[] args) {
WebDriver driver=new EdgeDriver(); 
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	//switch to frame
	driver.switchTo().frame("iframeResult");
	//xpath for FN
	WebElement FN = driver.findElement(By.xpath("//input[@id='fname']"));
	//clear the name inside the FN textfield
	FN.clear();
	//write the new name
	FN.sendKeys("Rajkumar");
}
}
