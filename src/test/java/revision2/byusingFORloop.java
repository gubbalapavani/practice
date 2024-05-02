package revision2;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class byusingFORloop {
public static void main(String[] args) {
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.flipkart.com");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String window=driver.getWindowHandle();
	System.out.println(window);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.meesho.com");
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
	int size=list.size();
	System.out.println("list of webelements:"+size);
	for(WebElement webelements:list)
	{
		System.out.println(webelements.getText());
	}
}
}
