package Test_Suite;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_Baseurl;
import App_Modules.Verify_SortBy_ListingPerPage;
import Base_Utils.Capture_dropdown_elements;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Dropdown_elements_clickable;
import Base_Utils.Opening_Browser;
import Base_Utils.Take_Screenshot;
import Base_Utils.Verify_Header;
import POM_Files.Newlaunch_POM_File;


public class Newlaunch_Frontend {

	 //private static final String Actual = null;

    

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


    @Test 
    public static void Verify_dropdown_listing_values_CLICKABLE() throws InterruptedException, IOException, Exception{
    	
    	
    	
    	System.out.println("Verify_dropdown_listing_values_CLICKABLE.......");
    	
    	
   	   // POM File Constructors

       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
       
       
       // verify property_Type elements clickable
       
       Dropdown_elements_clickable.Execute(driver, page.property_Type);
    	
       
       
      // verify all_states  elements clickable
       
       Dropdown_elements_clickable.Execute(driver, page.all_states);
    }
    
    

    

// TEST Scenario: Select Property type/ state/area/click search btn-verify results page -Header[blank developer]


    @Test 
    public static void Verify_landingpage_Search_Filter_HeaderAssertion() throws InterruptedException, IOException, Exception{


    	
    	System.out.println("Verify_landingpage_Search_Filter_HeaderAssertion.......");
    	
    	
    	 // POM File Constructors

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


    	  // select property type -

    	    WebElement dropdown = page.property_Type;
            Select value = new Select(dropdown);
            value.selectByVisibleText("Semi-D/Bungalow");
            Thread.sleep(2000);


	     // select state
            WebElement dropdown1 = page.all_states;
            Select value1 = new Select(dropdown1);
            value1.selectByVisibleText("Selangor");
            Thread.sleep(2000);



         // select area

            page.area_select.click();
            Thread.sleep(2000);

            // check Bandar utama
            page.check_area1.click();
            // check cyberjaya
            page.check_area2.click();
            // check shah alam
            page.check_area3.click();

            //De-selct area1
            page.check_area1.click();


          // clcik search

            page.search_Btn.click();
            Thread.sleep(2000);

          // Validate Header

	        Verify_Header.Execute(driver, page.header_breadcumb, "Alam Impian, Ambang Botanic New Semi-D/Bungalow for Sale");



    }






// TEST Scenario: Click Search Btn -verify results page - map / listing search / sort by / listing per page



    @Test 
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



        @Test 
        public static void Verify_SERP_SortBy_ListingPerPage() throws InterruptedException, IOException, Exception{


        	System.out.println("Verify_SERP_SortBy_ListingPerPage.......");

        	
        	// POM File Constructors

            Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
            
             
        	// Execute Verify_SortBy_ListingPerPage app module
            
        	Verify_SortBy_ListingPerPage.Execute(driver, page.sort_by);
        



    }







// TEST Scenario: Click Search Btn > click details page > verify Header & Sub-header > Verify Form validations



    @Test 
    public static void Verify_DetailsPage_Formfield_Validations() throws InterruptedException, IOException, Exception{


    	// POM File Constructors

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


        // clcik search btn

        page.search_Btn.click();
        Thread.sleep(2000);


        // click view details btn

        page.view_btn2.click();
        Thread.sleep(2000);


        // Verify Header Titles

        page.openfor_headline.isDisplayed();

        page.sub_headline.isDisplayed();

        page.register_title.isDisplayed();


        // click Register btn - Verify error validation Text


       page.name_error.isDisplayed();
       Thread.sleep(2000);
       page.name_field_bottom.sendKeys("T");
       Thread.sleep(2000);

       // verify Error Message


       page.email_error.isDisplayed();
       page.phone_error.isDisplayed();
       page.remark_error.isDisplayed();
       page.terms_conditions_error.isDisplayed();
       page.continue_alert_error.isDisplayed();



    }




// TEST Scenario: Verify Carousel feature  & Lead_Submission feature



    @Test 
    public static void Verify_DetailsPage_LeadSubmission_Bottom() throws InterruptedException, IOException, Exception{


    	 System.out.println("Verify_DetailsPage_Lead_Submission_Bottom");


       // POM File Constructor

        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);




        // clcik search btn landing page

        page.search_Btn.click();
        Thread.sleep(2000);


        // click view details btn

        page.view_btn4.click();
        Thread.sleep(2000);


        /*
         * 
         
    	// Verify Carousel feature

        System.out.println("Verify Carousel feature ");

        page.Carousel_right.click();
        Thread.sleep(3000);
        page.Carousel_left.click();
        Thread.sleep(3000);

        
        */
        

        // Verify Bottom lead submission

        System.out.println("Verify Lead_Submission Bottom");

        // Enter name
         page.name_field_bottom.clear();
         Thread.sleep(3000);
         page.name_field_bottom.sendKeys(excel.getData(0, 1, 1));
         Thread.sleep(3000);

        // Enter email
         page.email_field_bottom.clear();
         Thread.sleep(3000);
         page.email_field_bottom.sendKeys(excel.getData(0, 1, 2));
         Thread.sleep(3000);

        // Enter phone
         page.phone_field_bottom.clear();
         Thread.sleep(3000);
         page.phone_field_bottom.sendKeys(excel.getData(0, 1, 3));
         Thread.sleep(3000);


        // Select Country

         Dropdown_Feature.Execute_visibletext(driver, page.country_dropdown_bottom, excel.getData(0, 1, 4));


        // Enter Reamrks

         page.remark_field.sendKeys(excel.getData(0, 1, 5));
         Thread.sleep(3000);
         
        // Check Updates
         
         page.recieve_updates_check_bottom.click();
         Thread.sleep(3000);
         page.recieve_updates_check_bottom.click();
         Thread.sleep(3000);
         
         
         // check Terms and conditions
         
         page.terms_conditions_check_bottom.click();
         Thread.sleep(3000);
  
         
         // Submit Btn
         
         page.register_btn_bottom.submit();
         Thread.sleep(5000);
         
         
         // Assertion - TY Message
         
         Verify_Header.Execute(driver, page.thankyou_bottom_message, "Thank you, your message have been successfully sent out.");
         
         
        
        
    }
    
    
    
   
    
    
    
    
    
	
	
}
    








// TAKE SCREENSHOT

       // Take_Screenshot.Execute(driver, "./PassedScreenshotsMYLive/" + "samplename.png");



// Validate Header


/*
WebElement element = driver.findElement(By.xpath("//*[@id='content']/div[3]/h1"));
String strng = element.getText();
System.out.println(strng);
Assert.assertEquals("New Semi-D/Bungalow For Sale in Cyberjaya, Shah Alam, Selangor", strng);

*/