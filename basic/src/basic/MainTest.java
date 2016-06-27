package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {
	
	
	static level5 l;
	public static void main(String[] args)
	{
		WebDriver webdriver=new FirefoxDriver();
		webdriver.get("http://10.0.1.86/tatoc/basic/grid/gate");
		webdriver.manage().window().maximize();
		
		l=new level5(webdriver);
		webdriver.close();
	}
}
