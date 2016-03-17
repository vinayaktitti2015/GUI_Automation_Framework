package App_Modules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validation_error_message {
	
	public static void Execute(WebDriver driver, WebElement locator, String fieldname)throws IOException   {

		
		 boolean message_error = locator.isDisplayed();
		
		 
	        System.out.println(message_error);
	            if (!message_error==true){
	                    System.out.println( fieldname + "error message is NOT Showing up ");
	                    }       
	                else{
	                     System.out.println( fieldname + "Field_error message is  Showing up ");
	                  
	                   
	                    }
	            
	            
	         String message_text = locator.getText();
	   		 System.out.println(message_text);
		
		
	}

}
