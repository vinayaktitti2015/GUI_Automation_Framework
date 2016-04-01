package Base_Utils;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll_Page {
	
	
	public static void Execute(WebDriver driver) throws IOException   {
		
		
		
		 
		 // This  will scroll page 400 pixel vertical
		 
		  
		  ((JavascriptExecutor)driver).executeScript("scroll(0,250)");
		
		
	}

}
