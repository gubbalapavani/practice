package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;
public class Screenshot {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	//typecasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	//create object of file class and give path of scshot folder
	File dest=new File("C:\\Users\\pavan\\Desktop\\SCREENSHOTS\\AMAZON.png");
	//copy
	Files.copy(src, dest);
	
	
}
}
