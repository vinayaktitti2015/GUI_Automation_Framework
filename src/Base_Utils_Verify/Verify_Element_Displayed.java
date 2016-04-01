package Base_Utils_Verify;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verify_Element_Displayed {
	
	  
     public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	 
	
	public static void Execute(WebDriver driver, WebElement locator, String Titlename ) throws IOException   {
		
		 // Here driver will try to find out My Account link on the application
		 
	      WebElement element = locator;
	 
	      //Test will only continue, if the below statement is true
	 
	      //This is to check whether the link is displayed or not
	 
	      Assert.assertTrue(element.isDisplayed());
	 
	      //My Account will be clicked only if the above condition is true
	 
	      String Actual = element.getText();
	      
	      System.out.println("Actual Text : " + Actual);
	      
	      System.out.println("Titlename :  " + Titlename);
	      
	      try {
	    	   
	    	   

	 	  		if (!element.isDisplayed()) {
	 	  			System.out.println(ANSI_RED + Actual + "  Text NOT Found." + ANSI_RESET);
	 	  		} else {
	 	  			System.out.println(ANSI_GREEN + Actual + " Text  Found." + ANSI_RESET);
	 	  		}

	 	  	} catch (Exception e) {
	 	  		System.out.println(e.getClass());
	 	  		e.printStackTrace();
	 	  	}
	         
	      
	      
		
		
	}

}
