package revision;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class keysclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver drive =new EdgeDriver();
drive.get("https://www.saucedemo.com");
drive.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
