package App_Modules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_Utils_Verify.Verify_Text;

public class Shortlist_Feature {
	

	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	
	public static void Execute(WebDriver driver , WebElement locator1, WebElement locator2 ) throws IOException, InterruptedException   {
		
		
		
		 // click shortlist
    	
    	
		locator1.click();
    	
   
    	// verify text
    	
    	
    	Verify_Text.Execute(driver, locator2, "Sign in to iProperty.com", "Shortlist Feature");
    	
    	
        
        
		
		
		
		
	}

}
