package Base_Utils_Verify;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verify_Text {
	
	
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	// pass actual & expected values in the script ex:  class.Execute(driver,"actual","expected");

		public static void Execute(WebDriver driver, WebElement locator, String expected, String textname ) throws IOException   {
			
			
			
			
	
				String Actual;
				try {
					WebElement element = locator;
					Actual = element.getText();
					
					
					
					Assert.assertEquals(Actual, expected);
					
					System.out.println("Actual Element: " +Actual);
					
					System.out.println("Expected Element: " +expected);
					
			
		    	
		    	
		    	 if(expected.contentEquals(Actual))
			       {
			       System.out.println( textname + ANSI_GREEN + "Assertion Passed" + ANSI_RESET );
			       }
			       else
			       {
			       System.out.println( textname +  ANSI_RED + "Assertion Failed"  + ANSI_RESET);
			       }
		    	
		    	   
		 		
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
						
				
			 
			
			
			
		}
		
		
		
		
		public static void ExecuteBackend_VerifyText(WebDriver driver, WebElement locator, String expected, String textname ) throws IOException   {
			
			
			
			
			
			String Actual;
			try {
				
				WebElement element = locator;
				Actual = element.getText();
				
				
				
				Assert.assertEquals(Actual, expected);
				
				System.out.println("Actual Element: " +Actual);
				
				System.out.println("Expected Element: " +expected);
				
		
	    	
	    	
	    	 if(expected.contentEquals(Actual))
		       {
		       System.out.println( textname + ANSI_GREEN + "Assertion Passed" + ANSI_RESET );
		       }
		       else
		       {
		       System.out.println( textname +  ANSI_RED + "Assertion Failed"  + ANSI_RESET);
		       }
	    	
	    	   
	 		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
					
			
		 
		
		
		
	}
	
		
		
		public static void ExecuteSplitText(WebDriver driver, WebElement locator, String expected, String textname ) throws IOException   {
			
			
			String st1 = "This World is Very Nice"; 
			
			String st2 = " And Beautiful."; 
			
			
			String Actual;
			try {
				
				WebElement element = locator;
				Actual = element.getText();
				
				st1 = "Size : 1024 sq. ft. - 1600 sq. ft.";
				
				st2 = "Location : Bukit Jelutong, Shah Alam, Selangor Posted Date : 17/01/2011";
						
				
				String splt[] = Actual.split(st2); 
				
				System.out.println("String Part 1 Is -> "+splt[0]);
				
				
				Assert.assertEquals(splt[0], expected);
				
				System.out.println("Actual Element: " +splt);
				
				System.out.println("Expected Element: " +expected);
				
		
	    	
	    	
	    	 
	 		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
					
			
		 
		
		
		
	}


}
