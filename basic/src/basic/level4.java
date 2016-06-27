package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class level4 extends level3{

	public level4(WebDriver driver) {
		super(driver);
	   	JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("document.getElementsByTagName('a')[0].click()");
		String winHandleBefore = driver.getWindowHandle();
		
		
		//new window
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		WebElement w4=(WebElement)javascriptExecutor.executeScript("return document.getElementById('name')");
		w4.sendKeys("hejhnfuh");
		
		WebElement w5=(WebElement)javascriptExecutor.executeScript("return document.getElementById('submit')");
		w5.click();
		
		driver.switchTo().window(winHandleBefore);
		
		//old window 
		javascriptExecutor.executeScript("document.getElementsByTagName('a')[1].click()");
	}
	

}
