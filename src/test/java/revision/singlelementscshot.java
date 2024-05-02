package revision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class singlelementscshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new EdgeDriver();
driver.get("https://www.meesho.com");
WebElement ele = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
File src = ele.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\pavan\\Desktop\\SCREENSHOTS\\Logo.png");
Files.copy(src, dest);
	}

}
