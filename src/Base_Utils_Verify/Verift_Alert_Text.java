package Base_Utils_Verify;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM_Files.Newlaunch_POM_File;

public class Verift_Alert_Text {
	
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	 
	 
	 
	
	
	public static void Execute(WebDriver driver, String expected)   {

		
		// POM File Constructors

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
        
        
		
		
    	
    	
    	try {
    		
			//Now once we hit AlertButton we get the alert
			Alert alert = driver.switchTo().alert();
			//Text displayed on Alert using getText() method of Alert class
			String Actual = alert.getText();
			//accept() method of Alert Class is used for ok button
			alert.accept();
			//Verify Alert displayed correct message to user
			Assert.assertEquals(Actual, expected);
			
			
	
			System.out.println("Actual Text Showing: " +Actual);
			
			System.out.println("expected Text : " +expected);
			
			
			
	    	 if(expected.contentEquals(Actual))
		       {
		       System.out.println(ANSI_GREEN + "Assertion Passed" + ANSI_RESET );
		       }
		       else
		       {
		       System.out.println(ANSI_RED + "Assertion Failed"  + ANSI_RESET);
		       }
	    	 
			} catch (Exception e) {
			e.printStackTrace();
			}
    	
		
		
		
		
		
		
	}
	
	
	

}
