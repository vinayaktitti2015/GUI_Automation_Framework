package Base_Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Feature {


	public static void Execute_index(WebDriver driver,  WebElement locator, int indx  ) throws IOException   {
		
		
		
        WebElement dropdown = locator;

        Select value = new Select(dropdown);

        value.selectByIndex(indx);
        
        
	}
        
        
	
	public static void Execute_visibletext(WebDriver driver, WebElement locator, String strng  ) throws IOException, InterruptedException   {
        
		 WebElement dropdown = locator;
	        Select value = new Select(dropdown);
	        value.selectByVisibleText(strng);
	        Thread.sleep(2000);
        
        
        
		
	}
	
       
	
	public static void Execute_value(WebDriver driver,  WebElement locator, String val  ) throws IOException   {
		
		
		
        WebElement dropdown = locator;

        Select value = new Select(dropdown);

        value.selectByValue(val);
        
        
	}
	
	
	
	
	
}
