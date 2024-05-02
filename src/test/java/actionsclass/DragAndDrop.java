package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
		WebDriver driver=new EdgeDriver(); 
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		//srcelement
		WebElement srcele = driver.findElement(By.xpath("//div[@id='div1']"));
		//destele
		WebElement destele = driver.findElement(By.xpath("//div[@id='div2']"));
		//create object of Actions class
		Actions a=new Actions(driver);
		a.dragAndDrop(srcele, destele).perform();
		
}
}
