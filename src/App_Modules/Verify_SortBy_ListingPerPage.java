package App_Modules;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_Utils.Capture_dropdown_elements;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Dropdown_elements_clickable;
import Base_Utils.Take_Screenshot;
import Base_Utils.Verify_Header;
import POM_Files.Newlaunch_POM_File;

public class Verify_SortBy_ListingPerPage {
	
	
	public static void Execute(WebDriver driver , WebElement locator) throws IOException, InterruptedException   {
		
		
		
		 // POM File Constructors

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


        // clcik search btn

        page.search_Btn.click();
        Thread.sleep(2000);

        // Validate Header breadcumb

        Verify_Header.Execute(driver, page.header_breadcumb, "New Properties for Sale");
        
		
		
		System.out.println("Verify capture sort by function elements.......");
        
	       // capture sort by function elements
	        
	        Capture_dropdown_elements.Execute(driver, locator);
	        
	        
	        
	        
	    System.out.println("Verifysort by function elements clickable.......");
	    
	    
	     
	        // id of the dropdown
	        WebElement dropdown = locator;
	        
	        // capture all the proprty type elements
	        
	        List<WebElement>list = dropdown.findElements(By.tagName("option"));
	        
	        for(int i=0; i<list.size(); i++){
	        	
	        	
	        	Dropdown_Feature.Execute_index(driver, locator, i);
	        	
	        	
	        	
	        	// Take screenshot - listing_search

		        Take_Screenshot.Execute(driver , "./Execution_Screenshots/Take_Screenshots/sort_by_feature("+ i+").png");
			
	        	
	        }
	        
	        
	        
	        
	     


	        
		
		
	}

}
