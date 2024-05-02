package revision;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrolldown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver drive= new EdgeDriver();
drive.get("https://www.amazon.com");
JavascriptExecutor jse=(JavascriptExecutor)drive;
jse.executeScript("window.scrollBy(0,2000)");
Thread.sleep(5000);
jse.executeScript("window.scrollBy(0,-1000)");
	}

}
