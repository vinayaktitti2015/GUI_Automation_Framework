package CrossBrowser_Testing;

import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base_Utils.Capture_dropdown_elements;
import Base_Utils.Dropdown_elements_clickable;
import POM_Files.Newlaunch_POM_File;

public class Multi_Browser {
	

	
	
	// MY DOMAIN
	
		//public static String baseurl = "http://newlaunch.iproperty.com.my/";
	    //public static String baseurl = "http://beta-newlaunch.iproperty.com.my/";
	    //public static String baseurl = "http://test.newlaunch.iproperty.com.my/";


	// SG DOMAIN
	    
	    //public static String baseurl = "http://newlaunch.iproperty.com.sg/";
	    //public static String baseurl = "http://beta-newlaunch.iproperty.com.sg/";
	    public static String baseurl = "http://test.newlaunch.iproperty.com.sg/";
	    

	     static WebDriver driver;

	     
	     // initiate Excel_Data_Config Library
	     
	     static Excel_Data_Config excel = new Excel_Data_Config("C:\\Users\\vinayak\\Documents\\Selenium\\workspace\\Automation_Framework\\src\\Test_Data\\Test_Data.xlsx");

	     
	     
	     
	 @Parameters("Browser")
	 @BeforeMethod
	    
	    // Here this parameters we will take from testng.xml
	    
	       public  void OpenBrowser(String BrowserName) {
	        
	       if(BrowserName.equalsIgnoreCase("Chrome")){

	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Files\\chromedriver.exe");
		     driver = new ChromeDriver();
		     
	             
	       driver.get(baseurl);
	       
	       driver.manage().window().maximize();
	            
	        
	       }
	       else if(BrowserName .equalsIgnoreCase("ie")){
	        
	    	   System.setProperty("webdriver.ie.driver", "C:\\Users\\vinayak\\Documents\\Selenium\\Drivers\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		       driver = new InternetExplorerDriver();
	           driver.get(baseurl);
	                   
	          

	        }
	       
	     

	  }
	  

	    
	    

	    
//It will execute after every test execution 
	    @AfterMethod
		
	    public void tearDown(ITestResult result) throws FileNotFoundException {




	        // Here will compare if test is failing then only it will enter into if condition
	        if (ITestResult.FAILURE == result.getStatus()) {
	            try {
	                // Create refernce of TakesScreenshot
	                TakesScreenshot ts = (TakesScreenshot) driver;

	                // Call method to capture screenshot
	                File source = ts.getScreenshotAs(OutputType.FILE);

	                // Copy files to specific location here it will save all screenshot in our project home directory and
	                // result.getName() will return name of test case so that screenshot name will be same
	                FileUtils.copyFile(source, new File("./ScreenshotsCrossBrowserPH/" + result.getName() + ".png"));

	                System.out.println("Screenshot taken");
	            } catch (Exception e) {

	                System.out.println("Exception while taking screenshot " + e.getMessage());
	            }



	        }
	        // close application
	        driver.quit();

	    }
	    
	    
	    
	    

// TEST Scenario: Verify_dropdown_listing_values - LANDING PAGE


		    @Test (priority = 0)
		    public static void Verify_CAPTURE_dropdown_listing_values() throws InterruptedException, IOException, Exception{
		    	
		    	
		    	System.out.println("Verify_CAPTURE_dropdown_listing_elements.......");
		    	
		    	
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
		    	
		    	
		    	
		    	System.out.println("Verify_dropdown_listing_values_CLICKABLE.......");
		    	
		    	
		   	   // POM File Constructors

		       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
		       
		       
		       // verify property_Type elements clickable
		       
		       Dropdown_elements_clickable.Execute(driver, page.property_Type);
		    	
		       
		       
		      // verify all_states  elements clickable
		       
		       Dropdown_elements_clickable.Execute(driver, page.all_states);
		    }	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    	

}
