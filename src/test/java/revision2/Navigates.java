package revision2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigates {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new EdgeDriver();
driver.get("https://www.google.com");
Thread.sleep(2000);
driver.navigate().to("https://www.amazon.com");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.quit();
	}

}
