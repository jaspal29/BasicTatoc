package basic;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class level3 extends level2 {

	public level3(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 	JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;;
		 	WebElement w=(WebElement)javascriptExecutor.executeScript("return document.getElementById('dragbox')");
		WebElement w1=(WebElement)javascriptExecutor.executeScript("return document.getElementById('dropbox')");
		
		
		new Actions(driver).dragAndDrop(w,w1).build().perform();
		
		javascriptExecutor.executeScript("document.getElementsByTagName('a')[0].click()");
	}

}
