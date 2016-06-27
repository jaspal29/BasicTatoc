package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class level5 extends level4 {

	public level5(WebDriver driver) {
		super(driver);
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("document.getElementsByTagName('a')[0].click()");
		WebElement w9=(WebElement)javascriptExecutor.executeScript("return document.getElementById('token')");
		String str=w9.getText();
		System.out.println(str);
		String [] str11=str.split(":");
		
		String cookie=str11[1].trim();
		System.out.print(cookie);
		
		
		Cookie name = new Cookie("Token", cookie);
		driver.manage().addCookie(name);

		
		
		
		
		javascriptExecutor.executeScript("document.getElementsByTagName('a')[1].click()");
	}

}
