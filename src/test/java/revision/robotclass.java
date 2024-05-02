package revision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class robotclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver drive=new EdgeDriver();
drive.get("https://www.amazon.in/");
Robot r =new Robot();
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_PAGE_UP);
r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
