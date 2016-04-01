package Base_Utils_Verify;

import java.io.IOException;
import java.nio.charset.Charset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sun.jna.platform.win32.WinDef.CHAR;

public class Verify_First_and_LastCharacters {
	
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";

	
	
	public static void Execute(WebDriver driver, WebElement locator, char expected , String textname ) throws Exception   {
		
		
		WebElement element = locator;
    	String Actual =  element.getText();
    	System.out.println("First Development Showing :  " + Actual);
    	
    	char firstchar =  Actual.charAt(0);
    	Assert.assertEquals(firstchar, expected);
    	
    	System.out.println( textname + "First Character : " + Actual.charAt(0));
    	
    	
   	
    	 if(expected==firstchar)
	       {
	       System.out.println( textname + ANSI_GREEN + "Assertion Passed" + ANSI_RESET );
	       }
	       else
	       {
	       System.out.println( textname +  ANSI_RED + "Assertion Failed"  + ANSI_RESET);
	       }
  	
    	
    	
    	
	}



	public static void Execute(WebDriver driver, WebElement locator, String expected, String textname) {
		// TODO Auto-generated method stub
		
		
		WebElement element = locator;
    	String Actual =  element.getText();
    	System.out.println("First Development Showing :  " + Actual);
    	
    	char firstchar =  Actual.charAt(0);
    	Assert.assertEquals(firstchar, expected);
    	
    	System.out.println( textname + "First Character : " + Actual.charAt(0));
    	
    	
   	
    
		
	}
	
	
}



