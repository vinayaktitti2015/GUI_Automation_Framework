package Test_Scripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_Baseurl;
import Base_Utils.Capture_dropdown_elements;
import Base_Utils.Dropdown_elements_clickable;
import POM_Files.Newlaunch_POM_File;

public class Verify_landingpage_dropdown_search_moreoptions{
	
	

	     static WebDriver driver;

	     
	     // initiate Excel_Data_Config Library
	     
	     static Excel_Data_Config excel = new Excel_Data_Config("C:\\Users\\vinayak\\Documents\\Selenium\\workspace\\Automation_Framework\\src\\Test_Data\\Test_Data.xlsx");

	     


	    @
	    BeforeMethod
	    public static void OpeningBrowser() throws InterruptedException, IOException {


	        // Create a new instance of the  driver

	    	//WebDriver driver = new FirefoxDriver();

	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Files\\chromedriver.exe");
	         driver = new ChromeDriver();


	        // Launch the URL
	        driver.get(Constant_Baseurl.baseurl);

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


	    
	    
	    
	    

// TEST Scenario: Verify_dropdown_listing_values - LANDING PAGE


	    @Test
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


	    @Test (priority = 1)
	    public static void Verify_dropdown_listing_values_CLICKABLE() throws InterruptedException, IOException, Exception{
	    	
	    	
	    	
	    	System.out.println("Verify_landingpage_dropdown_listing_values_CLICKABLE.......");
	    	
	    	
	   	   // POM File Constructors

	       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	       
	       
	       // verify property_Type elements clickable
	       
	       Dropdown_elements_clickable.Execute(driver, page.property_Type);
	    	
	       
	       
	      // verify all_states  elements clickable
	       
	       Dropdown_elements_clickable.Execute(driver, page.all_states);
	    }
	    	
	    
	    
	    
	    
// TEST Scenario: Verify_dropdown_listing_values_CLICKABLE- LANDING PAGE


		    @Test (priority = 1)
		    public static void Verify_landingpage_moreoptions_feature() throws InterruptedException, IOException, Exception{
		    	
		    	
		    	
		    	System.out.println("Verify_landingpage_moreoptions_feature.......");
		    	
		    	
		   	   // POM File Constructors

		       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
		       
		       
		       // click moreoptions
		       
		       page.moreoption_arrow.click();
		       
		       
		       
		    
		    
		    }
		    
		    

	

}
