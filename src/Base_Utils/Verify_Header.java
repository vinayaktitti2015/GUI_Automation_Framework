package Base_Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verify_Header {
	
	
	// pass actual & expected values in the script ex:  class.Execute(driver,"actual","expected");

		public static void Execute(WebDriver driver, WebElement locator, String expected ) throws IOException   {
			
		try {
				WebElement element = locator;
		    	String Actual = element.getText();
		    	System.out.println(Actual);
		    	Assert.assertEquals(expected, Actual);
		    	
		    	 if(expected.contentEquals(Actual))
			       {
			       System.out.println("Assertion Passed");
			       }
			       else
			       {
			       System.out.println("Assertion Failed");
			       }
		    	
		    	   
        }catch(Exception e){
			e.printStackTrace();
		}		
						
				
			 
			
			
			
		}

}
