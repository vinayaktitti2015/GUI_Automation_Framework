package CrossBrowser_Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import App_Modules.Constant_baseurl;
import App_Modules.Verify_State_with_Area_Matching;
import Base_Utils.Capture_dropdown_elements;
import Base_Utils.Dropdown_elements_clickable;
import Base_Utils_Verify.Verify_Text;
import POM_Files.Newlaunch_POM_File;

public class MultiBrowser {
	
	    

	     static WebDriver driver;

	     
	     // initiate Excel_Data_Config Library
	     
	     static Excel_Data_Config excel = new Excel_Data_Config("C:\\Users\\vinayak\\Documents\\Selenium\\workspace\\Automation_Framework\\src\\Test_Data\\Test_Data.xlsx");

	     
	     
	     
	 @Parameters("Browser")
	 @org.testng.annotations.BeforeClass
	 
	    // Here this parameters we will take from testng.xml
	    
	       public  void OpenBrowser(String Browser) {
	        
	       if(Browser.equalsIgnoreCase("chrome")){

	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Files\\chromedriver.exe");
		     driver = new ChromeDriver();
		     
	             
	       driver.get(Constant_baseurl.baseurl);
	       
	       driver.manage().window().maximize();
	            
	        
	       }
	       
	       else if(Browser .equalsIgnoreCase("ie")){
	        
	    	   System.setProperty("webdriver.ie.driver", "C:\\Users\\vinayak\\Documents\\Selenium\\Drivers\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		       driver = new InternetExplorerDriver();
	           driver.get(Constant_baseurl.baseurl);
	                   
	          

	        }
	       
	     

	  }
	  

	    
	    


		//It will execute after every test execution
	    @ AfterClass

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
	
	    
	    

	    
	    
	    

// TEST Scenario: Verify_dropdown_listing_values - LANDING PAGE


	    @Test (enabled =false)
	    public static void Verify_CAPTURE_dropdown_listing_values() throws InterruptedException, IOException, Exception{
	    	
	    	
	    	System.out.println("Verify_CAPTURE_landingpage_dropdown_listing_elements.......");
	    	
	    	
	    	 // POM File Constructors

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	        
	        
	        System.out.println("All Property Type Elements.......");
	        
	        // capture property type elements
	        Capture_dropdown_elements.Execute(driver, page.property_Type);
	      
	        
	        System.out.println("All States Elements.......");
	        
	        
	       // capture all states elements
	        Capture_dropdown_elements.Execute(driver, page.all_states);
	      
		
	    }
	    
	    
	    
	    
// TEST Scenario: Verify_dropdown_listing_values_CLICKABLE- LANDING PAGE


	    @Test 
	    public static void Verify_dropdown_listing_values_CLICKABLE() throws InterruptedException, IOException, Exception{
	    	
	    	
	    	
	    	System.out.println("Verify_landingpage_ALL PROPERTY TYPE_listing_values_Selectable.......");
	    	
	    	
	   	   // POM File Constructors

	       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	       
	       
	       // verify property_Type elements clickable
	       
	       Dropdown_elements_clickable.Execute(driver, page.property_Type);
	    	
	       
	       
	       System.out.println("Verify_landingpage_ALL STATES_listing_values_Selectable.......");
	       
	       
	       
	       
	      // verify all_states  elements clickable
	       
	       Dropdown_elements_clickable.Execute(driver, page.all_states);
	    }
	    	
	    
	    
	    
	    

// TEST Scenario: Select Property type/ state/area/click search btn-verify results page -Header[with developer]


		    @Test 
		    public static void Verify_landingpage_Search_Filter_HeaderAssertion() throws InterruptedException, IOException, Exception{


		    	
		    	System.out.println("Verify_landingpage_Search_Filter_HeaderAssertion.......");
		    	
		    	
		    	 // POM File Constructors

		        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


		    	  // select property type -

		    	    WebElement dropdown = page.property_Type;
		            Select value = new Select(dropdown);
		            value.selectByIndex(5);
		            Thread.sleep(1000);


			     // select state
		            WebElement dropdown1 = page.all_states;
		            Select value1 = new Select(dropdown1);
		            value1.selectByIndex(6);
		            Thread.sleep(1000);



		         // select area

		            page.area_select.click();
		            Thread.sleep(1000);

		            
		            // check Area
		            page.check_random1.click();
		            Thread.sleep(1000);
		           
		            
		         // Enter Development
		            
		            page.search_Box.sendKeys("Sapphire");
		            Thread.sleep(1000);


		          // clcik search

		            page.search_Btn.click();
		            Thread.sleep(2000);
		            
		            
		          // listing page Validations

		          // Validate Header

			        Verify_Text.Execute(driver, page.header_breadcumb, "Seremban New Semi-D/Bungalow for Sale" , "Bread Crumb Validation: ");

			        
			        
			      // Validate Development

			        Verify_Text.Execute(driver, page.development_assertionx, "Sapphire", "Development Name: ");

			        
			     // Validate Property Type Assertion

			        Verify_Text.Execute(driver, page.propertytype_assertion, "Semi-detached House", "Property Type Validation: ");

			       
			        
			        
		    }
		
		    
		    
		    
		    

		    

// TEST Scenario: Verify_landingpage_States_with_Area_Validation

		 		    @Test 
		 		    public static void Verify_landingpage_States_with_Area_Validation() throws InterruptedException, IOException, Exception{


		 		    	
		 		    	System.out.println("Verify_landingpage_States_with_Area_Validation.......");
		 		    	
		 		    
		 		    	
		 		    	 // POM File Constructors

				        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);

				        

				        	
				        	
							Verify_State_with_Area_Matching.Execute(driver );
							
							
					
		 		    	 
				        
		 		            
		 		            
		 		    }
		    
		    
		    
		    





// TEST Scenario: Verify_landingpage_moreoptions_PriceValidation


		    @Test 
		    public static void Verify_landingpage_moreoptions_PriceValidation() throws InterruptedException, IOException, Exception{
		    	
		    	
		    	
		    	System.out.println("Verify_landingpage_moreoptions_PriceValidation.......");
		    	
		    	
		   	   // POM File Constructors

		       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
		       
		       
		       // click moreoptions
		       
		       page.moreoption_arrow.click();
		       Thread.sleep(2000);
		       
		       
		       // enter price
		       page.price_min.sendKeys("2000000");
		       Thread.sleep(2000);
		       page.price_max.sendKeys("4000000");
		       Thread.sleep(2000);
		       
		       
		       // clcik search

	            page.search_Btn.click();
	            Thread.sleep(1000);
		       
		       
		       // Verify validation
		       
		       Verify_Text.Execute( driver,page.price_validation, "From RM 2,225,505", "Price Range validation" );
		       
		       
		       
		       
               // Clk Reset btn
		       
		       page.reset_btn.click();
               Thread.sleep(2000);
               
               // Verify NULL Values
               
               
               Verify_Text.Execute( driver,page.price_min, "" , " Reset Btn Validation" );
               Verify_Text.Execute( driver,page.price_max, "" , " Reset Btn Validation" );
               
               
               
               System.out.println("Verify_landingpage_moreoptions_PriceValidation.......");
               
               
               
               // enter price
		       page.bed_min.sendKeys("1");
		       Thread.sleep(2000);
		       page.bed_max.sendKeys("3");
		       Thread.sleep(2000);
		       
		       
		       // clcik search

	            page.search_Btn.click();
	            Thread.sleep(1000);
		       
		       
		       // Verify validation
		       
		       Verify_Text.Execute( driver,page.bed_validation, "3", "Bed Range validation" );
		       
               
                
		       
		    }    
		    
		    
		    


		    
// TEST Scenario: Verify_landingpage_moreoptions_SizeValidation


		 		    @Test 
		 		    public static void Verify_landingpage_moreoptions_SizeValidation() throws InterruptedException, IOException, Exception{
		 		    	
		 		    	
		 		    	
		 		    	System.out.println("Verify_landingpage_moreoptions_SizeValidation.......");
		 		    	
		 		    	
		 		   	   // POM File Constructors

		 		       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
		 		       
		 		       
		 		       // click moreoptions
		 		       
		 		       page.moreoption_arrow.click();
		 		       Thread.sleep(2000);
		 		       
		 		       
		 		       // enter price
		 		       page.size_min.sendKeys("1000");
		 		       Thread.sleep(2000);
		 		       page.size_max.sendKeys("1600");
		 		       Thread.sleep(2000);
		 		       
		 		       
		 		       // clcik search

		 	            page.search_Btn.click();
		 	            Thread.sleep(1000);
		 		       
		 		       
		 		       // Verify validation
		 		       
		 		       Verify_Text.Execute( driver,page.size_validation, "Size : 1024 sq. ft. - 1600 sq. ft. ", "Size Range Validation");
		 		       
		 		       
		                // Clk Reset btn
		 		       
		 		       page.reset_btn.click();
		                Thread.sleep(2000);
		                
		                
		                
		                
		                 
		 		       
		 		    }    
		 		  		    
		    	    
	    
	    
	    
	    
	    
	    
	    	

}
