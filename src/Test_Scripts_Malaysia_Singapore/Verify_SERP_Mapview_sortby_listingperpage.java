package Test_Scripts_Malaysia_Singapore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_baseurl;
import App_Modules.Shortlist_Feature;
import App_Modules.Verify_SortBy_ListingPerPage;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Take_Screenshot;
import Base_Utils.Wait_Commands;
import Base_Utils_Verify.Verift_Alert_Text;
import Base_Utils_Verify.Verify_First_and_LastCharacters;
import Base_Utils_Verify.Verify_Text;
import POM_Files.Newlaunch_POM_File;

public class Verify_SERP_Mapview_sortby_listingperpage {
	

	    
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	 
	 
	 
		static WebDriver driver;

	 


	    @
	    BeforeMethod
	    public static void OpeningBrowser() throws InterruptedException, IOException {


	        // Create a new instance of the  driver

	    	//WebDriver driver = new FirefoxDriver();

	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Files\\chromedriver.exe");
	         driver = new ChromeDriver();


	        // Launch the URL
	        driver.get(Constant_baseurl.baseurl);

	        //Maximize the browser
	        driver.manage().window().maximize();

	        // Put an Implicit wait,
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	    }

		





		//It will execute after every test execution
	    @ AfterMethod

	    public void tearDown(ITestResult result) throws FileNotFoundException, Exception {


	    	// Here will compare if test is failing then only it will enter into if condition
	        if (ITestResult.FAILURE == result.getStatus()) {
	            try {
	                // Create refernce of TakesScreenshot
	                TakesScreenshot ts = (TakesScreenshot) driver;

	                // Call method to capture screenshot
	                File source = ts.getScreenshotAs(OutputType.FILE);

	                // Copy files to specific location here it will save all screenshot in our project home directory and
	                // result.getName() will return name of test case so that screenshot name will be same
	                FileUtils.copyFile(source, new File("./Execution_Screenshots/Failed_Case_Screenshots/" + result.getName() + ".png"));

	                System.out.println("Screenshot taken");
	                System.out.println("Test FAILED");


	            } catch (Exception e) {

	                System.out.println("Exception while taking screenshot " + e.getMessage());
	            }

	        }


	         // Here will compare if test is success then only it will enter into if condition
	         else if (ITestResult.SUCCESS == result.getStatus()) {
	            try {
	                // Create refernce of TakesScreenshot
	                TakesScreenshot ts = (TakesScreenshot) driver;

	                // Call method to capture screenshot
	                File source = ts.getScreenshotAs(OutputType.FILE);

	                // Copy files to specific location here it will save all screenshot in our project home directory and
	                // result.getName() will return name of test case so that screenshot name will be same
	                FileUtils.copyFile(source, new File("./Execution_Screenshots/Passed_Case_Screenshots/" + result.getName() + ".png"));



	            } catch (Exception e) {

	                System.out.println("Exception while taking screenshot " + e.getMessage());
	            }


	        }



	        // close application
	        driver.quit();

	    }

	    
	    
	    
	    


	 // TEST Scenario: Click Search Btn -verify results page - map / listing search / sort by / listing per page



	     @Test 
	     public static void Verify_SERP_Mapview_listingview() throws InterruptedException, IOException, Exception{


	     	System.out.println("Verify_SERP_Mapview_listingview.......");

	     	 // POM File Constructors

	         Newlaunch_POM_File page = new Newlaunch_POM_File(driver);



	         // clcik search btn

	         page.search_Btn.click();
	         Thread.sleep(1000);

	         // Validate Header breadcumb

	         Verify_Text.Execute(driver, page.header_breadcumb, "New Properties for Sale" , "Header breadcumb Validation");

	         
	         
	         // click Map btn landing page 
	         
	         page.map_Btn.click();
	         
	         // Take screenshot - map_search

	         Take_Screenshot.Execute(driver , "./Execution_Screenshots/Take_Screenshots/map_search.png");
	         
	         
	         
	         
	         // verify  listing_search function

	         page.listing_search.click();
	         Thread.sleep(1000);


	        // Take screenshot - listing_search

	         Take_Screenshot.Execute(driver , "./Execution_Screenshots/Take_Screenshots/listing_search.png");
	         
	         

	         // verify  map_search function

	         page.map_search.click();
	         Thread.sleep(1000);


	        // Take screenshot - map_search

	         Take_Screenshot.Execute(driver , "./Execution_Screenshots/Take_Screenshots/map_search1.png");



	     


	     }
	     
	     
	     
	         
	         
	 // TEST Scenario: Verify_SERP_SortBy_ListingPerPage Feature



	         @Test 
	         public static void Verify_ListingPage_SortBY_Feature() throws InterruptedException, IOException, Exception{


	         	System.out.println("Verify_ListingPage_SortBY_Feature.......");

	         	
	         	// POM File Constructors

	             Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	             
	              
	             // clcik search btn

	             page.search_Btn.click();
	            
	             
	             // put implicit wait
	             
	             Wait_Commands.Executeimplicitwait(driver);
	             
	             
                // Select sort by -- A-Z
	             
	             System.out.println("Sort By Project Name (A -> Z)");
	             
	             Dropdown_Feature.Execute_visibletext(driver, page.sort_by, "Project Name (A -> Z)");
	             
	             
	            // put ExecuteExplicitVisible wait
	             
	             Wait_Commands.ExecuteExplicitVisible(driver,  page.development_assertionx);
	         	
	             
	             // 	Validate Sorting
	         	
	         	
	             Verify_First_and_LastCharacters.Execute(driver, page.development_assertionx, 'A', "Sort by A - Z: ");
	             
	             
	             
	             
	             
	             // Select sort by -- Z-A 
	             
	             System.out.println("Sort By Project Name (Z -> A)");
	             
	             Dropdown_Feature.Execute_visibletext(driver, page.sort_by, "Project Name (Z -> A)");
	             
	             
	            // put ExecuteExplicitVisible wait
	             
	             Wait_Commands.ExecuteExplicitVisible(driver,  page.development_assertionx);
	         	
	             
	             // 	Validate Sorting
	         	
	         	
	             Verify_First_and_LastCharacters.Execute(driver, page.development_assertionx, 'Z', "Sort by Z-A: ");
		    	
	         	
	        

	     }
	         
	         
	         
	      

	         
// TEST Scenario: Verify_ListingPage_ListingPerPage_Feature



	         @Test 
	         public static void Verify_ListingPage_ListingPerPage_Feature() throws InterruptedException, IOException, Exception{


	         	System.out.println("Verify_ListingPage_ListingPerPage_Feature......");

	         	
	         	// POM File Constructors

	             Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	             
	              
	             // clcik search btn

	             page.search_Btn.click();
	            
	             
	            // verify no.of listing prjects
	             
	             Verify_SortBy_ListingPerPage.Execute(driver, page.listing_perpage, 0, 10);
	            
	             
	             // select 20 
	             
	             Thread.sleep(2000);
	 			
	             
                 // verify no.of listing prjects
	             
	             Verify_SortBy_ListingPerPage.Execute(driver, page.listing_perpage, 1, 20);
	             
	             
	             
	             
	             // validate pagination
	             
	             page.pagination2_listingpage.click();
	             
	             
	             if(page.pagination2_listingpage.isEnabled()){
	            	 
	            	 
	            	 System.out.println( ANSI_GREEN + "Pagination Working" + ANSI_RESET );
	             }
	             
	             else {
	            	 
	            	 System.out.println(ANSI_RED + "Pagination Not Working" + ANSI_RESET);
	             }
	             
	            

	     }
	         
	         	       
	    
	    
	    
	    
	         
// TEST Scenario: Verify_ListingPage_Shorlist_Feature



	         @Test 
	         public static void Verify_ListingPage_Shorlist_Feature() throws InterruptedException, IOException, Exception{


	         	System.out.println("Verify_ListingPage_Shorlist_Feature......");

	         	
	         	// POM File Constructors

	             Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	             
	             
	              
	             // clcik search btn

	             page.search_Btn.click();
	            
	             // click shortlist btn
	             
	             
	             page.shortlist_listingpage.click();
	             
	             
	             // Verify Register page Login 
	             
	             // click sign in
	         	     page.signin_btn_registerpage.click();
		        	
		        
	             Verift_Alert_Text.Execute(driver, "Please enter Your Email.");
		        	
		        	
		         // enter email
	             
	             
	             page.email_field_registerpage.sendKeys("vinayak.harsha");
	             
	             
	            // click sign in
		         	page.signin_btn_registerpage.click();
		        	
	             Verift_Alert_Text.Execute(driver, "Please enter a valid Email.");	
	             
	             
                 // enter email
	             
	             page.email_field_registerpage.clear();
	             page.email_field_registerpage.sendKeys("vinayak.harsha@gmail.com");
		        	
		        	
                // enter PW	
	             
	             
	             page.passwrd_field_registerpage.sendKeys("salforduk");	
		        	
		        	
			        	
		             // click sign in
			         	page.signin_btn_registerpage.click();
			         	Thread.sleep(3000);
		         	
		         
			         	
			         // verify navigation
			         	
			         	
			           Verify_Text.Execute(driver, page.header_breadcumb, "New Properties for Sale", "Login Navigation: ");
		         	
		         	
		         	
	     }
	         	    
	    
	    
	    

}
