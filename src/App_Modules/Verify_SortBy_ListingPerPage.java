package App_Modules;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import Base_Utils.Capture_dropdown_elements;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Dropdown_elements_clickable;
import Base_Utils.Take_Screenshot;
import Base_Utils.Wait_Commands;
import Base_Utils_Verify.Verify_Text;
import POM_Files.Newlaunch_POM_File;

public class Verify_SortBy_ListingPerPage {
	

	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	
	public static void Execute(WebDriver driver , WebElement locator1, int value , int expected ) throws IOException, InterruptedException   {
		
		
		
		 // POM File Constructors

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


        // clcik search btn

        page.search_Btn.click();
        Thread.sleep(2000);

        // put implicit wait
        
        Wait_Commands.Executeimplicitwait(driver);
        
        
       // Select ListingPerPage --
        
        
        Dropdown_Feature.Execute_index(driver, locator1, value);
        
        
         
        // 	Validate ListingPerPage --10 
    	
    	
       //int i =3;
		List<WebElement> listing = driver.findElements(By.className("dev-id"));

		int Actual = listing.size();
		
		//System.out.println("No. of Listing per page is :  " +  listing.size());
			
		Assert.assertEquals(Actual, expected);
		
		
		System.out.println("No. of Listing per page Expected :  " +  expected);
		
		System.out.println("No. of Listing per page Actual :  " +  Actual);
		
    	
   	    if(expected==Actual)
	       {
	       System.out.println(   ANSI_GREEN + "Assertion Passed" + ANSI_RESET );
	       }
	       else
	       {
	       System.out.println(   ANSI_RED + "Assertion Failed"  + ANSI_RESET);
	       }
   	  	
	        
	        
        
	   
	
	        
		
		
	}

}
