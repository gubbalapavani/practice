package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Singleelementscnshot {
	public static void main(String[] args) throws Throwable { 
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		//xpath for individual element
		WebElement ele = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		//take sceenshot of element
		File src = ele.getScreenshotAs(OutputType.FILE);
		//path folder 
		File dest=new File("C:\\Users\\pavan\\Desktop\\SCREENSHOTS\\LOGO.png");
		//copy 
		Files.copy(src, dest);
		
		
		
}
}
