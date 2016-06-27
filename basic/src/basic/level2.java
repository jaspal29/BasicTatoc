package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 class level2 extends level1 {

	public level2(WebDriver driver) {
		super(driver);
		while(true)
	    {
	       driver.switchTo().defaultContent();
	   	JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
	        
	   	WebElement webFrame1=(WebElement)javascriptExecutor.executeScript("return document.getElementById('main')");
	   	
	       driver.switchTo().frame(webFrame1);
	       
	       
	       WebElement webFrame2=(WebElement)javascriptExecutor.executeScript("return document.getElementById('answer')");
	       
	       String colour1 =webFrame2.getAttribute("class");
	       WebElement webFrame3=(WebElement)javascriptExecutor.executeScript("return document.getElementById('child')");
	       
	       driver.switchTo().frame(webFrame3);
	       WebElement webFrame4=(WebElement)javascriptExecutor.executeScript("return document.getElementById('answer')");
	       
	        String colour2=webFrame4.getAttribute("class");
	       driver.switchTo().defaultContent();
	       driver.switchTo().frame(webFrame1);
	        if(colour1.equals(colour2))
	        {
	        	javascriptExecutor.executeScript("document.getElementsByTagName('a')[1].click();");
	           //driver.findElement(By.linkText("Proceed")).click();
	            break;
	        }
	        else
	        {
	        	javascriptExecutor.executeScript("document.getElementsByTagName('a')[0].click();");

	           //driver.findElement(By.linkText("Repaint Box 2")).click();
	        }
	        
	    }

	}
	 

}
