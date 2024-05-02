package revision2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ScrollHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new EdgeDriver();
driver.get("https://www.amazon.in/");
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,2000)");
Thread.sleep(5000);
jse.executeScript("window.scrollBy(0,-1000)");
	}

}
