package App_Modules;

import java.util.List;

import org.DDT.Excel_Data_Config;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Base_Utils.Wait_Commands;
import POM_Files.Newlaunch_POM_File;

public class Verify_State_with_Area_Matching {
	
	

	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	 
	

	public static void Execute(WebDriver driver ) throws Exception    {
		
		
	 
	    
	    	 
		
    	 // POM File Constructors

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
		
		
		 // select property type -

 	    WebElement dropdown = page.property_Type;
         Select value = new Select(dropdown);
         value.selectByIndex(3);
         

         

   
 		
 		int i;
         for ( i=1; i<=16; i++){
        	 
        	 

        		 
        // SELECT STATE

        	 WebElement dropdown1 = page.all_states;
	         Select value1 = new Select(dropdown1);
	         value1.selectByVisibleText(Constant_baseurl.excel.getData(1, i, 2));		         
	     
	         System.out.println("Selected State"     +   (Constant_baseurl.excel.getData(1, i, 2)) );


	    // wait cmd
	         
	        Thread.sleep(2000);
	         
	         
	         
      // Click All areas

            page.area_select.click();
         
        
       	 try {
       
       // Verify Area1
      
				WebElement element = driver.findElement(By.xpath("//*[@id='searchbar-list']/div[2]/ul/li[2]/label"));
				String Actual =  element.getText();
				
				System.out.println("Actual Area : "  + Actual);
				
				System.out.println("Expected Area : "  + Constant_baseurl.excel.getData(1, i, 3));
		
				Assert.assertEquals(Actual, Constant_baseurl.excel.getData(1, i, 3));
				
				 if(Actual.contentEquals(Constant_baseurl.excel.getData(1, i, 3)))
				   {
				   System.out.println( "Area Matched with State " + ANSI_GREEN + "Assertion Passed" + ANSI_RESET );
				   }
				   else
				   {
				   System.out.println( "Area Mis- Matched with State " +   ANSI_RED + "Assertion Failed"  + ANSI_RESET);
				   }
			
	  
				 
      
         
         } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}
            
         
         }
      
	}



}
