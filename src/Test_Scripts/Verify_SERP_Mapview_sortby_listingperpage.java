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
import App_Modules.Verify_SortBy_ListingPerPage;
import Base_Utils.Take_Screenshot;
import Base_Utils.Verify_Header;
import POM_Files.Newlaunch_POM_File;

public class Verify_SERP_Mapview_sortby_listingperpage {
	

	    

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

	    
	    
	    
	    


	 // TEST Scenario: Click Search Btn -verify results page - map / listing search / sort by / listing per page



	     @Test (priority = 2)
	     public static void Verify_SERP_Mapview_listingview() throws InterruptedException, IOException, Exception{


	     	System.out.println("Verify_SERP_Mapview_listingview.......");

	     	 // POM File Constructors

	         Newlaunch_POM_File page = new Newlaunch_POM_File(driver);



	         // clcik search btn

	         page.search_Btn.click();
	         Thread.sleep(2000);

	         // Validate Header breadcumb

	         Verify_Header.Execute(driver, page.header_breadcumb, "New Properties for Sale");


	         // verify  map_search function

	         page.map_search.click();
	         Thread.sleep(2000);


	        // Take screenshot - map_search

	         Take_Screenshot.Execute(driver , "./Execution_Screenshots/Take_Screenshots/map_search.png");



	        // verify  listing_search function

	         page.listing_search.click();
	         Thread.sleep(2000);


	        // Take screenshot - listing_search

	         Take_Screenshot.Execute(driver , "./Execution_Screenshots/Take_Screenshots/listing_search.png");


	     }
	     
	     
	     
	         
	         
	 // TEST Scenario: Verify_SERP_SortBy_ListingPerPage



	         @Test (priority = 2)
	         public static void Verify_SERP_SortBy_ListingPerPage() throws InterruptedException, IOException, Exception{


	         	System.out.println("Verify_SERP_SortBy_ListingPerPage.......");

	         	
	         	// POM File Constructors

	             Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
	             
	              
	         	// Execute Verify_SortBy_ListingPerPage app module
	             
	         	Verify_SortBy_ListingPerPage.Execute(driver, page.sort_by);
	         



	     }

	    
	    
	    
	    
	    
	    
	    
	    
	    

}
