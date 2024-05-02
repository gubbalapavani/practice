package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getpagesrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver drive=new EdgeDriver();
drive.get("https://www.facebook.com");
String page=drive.getPageSource();
System.out.println(page);
	}

}
