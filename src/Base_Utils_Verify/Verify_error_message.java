package Base_Utils_Verify;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verify_error_message {
	
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	public static void Execute(WebDriver driver, WebElement fieldlocator1, WebElement fieldlocator2, WebElement errorlocator, String value, String Expected, String Formfieldname)throws IOException   {

		
		
		fieldlocator1.clear();
		fieldlocator1.sendKeys(value);
		fieldlocator2.click();
    	
    	
		 WebElement alertMessage = errorlocator;
		 String Actual =  alertMessage.getText();
		 
	       
	        Assert.assertEquals(Expected, Actual);
	    	
	    	 if(Expected.contentEquals(Actual))
	    	 {
	            System.out.println(ANSI_GREEN + Formfieldname + "Error Message displayed: " + ANSI_RESET);
	            
	        } else {
	            System.out.println(ANSI_RED +Formfieldname + "Error Message Not displayed: " + ANSI_RESET);
	        }
	    	 
	    	 System.out.println(Actual);
	    }
	         
	
		
		
	}


