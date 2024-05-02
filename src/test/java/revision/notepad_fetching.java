package revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class notepad_fetching {
public static void main(String[] args) throws Throwable {
	FileInputStream fips= new FileInputStream("C:\\Users\\pavan\\Documents\\pavaniNotepadFEtch.txt");
	Properties p=new Properties();
	p.load(fips);
	String un=p.getProperty("UN");
	System.out.println(un);
	String pwd=p.getProperty("Pwd");
	System.out.println(pwd);
	String test=p.getProperty("Test");
	System.out.println(test);
}
}
