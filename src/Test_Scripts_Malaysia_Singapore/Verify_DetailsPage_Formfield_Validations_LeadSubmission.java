package Test_Scripts_Malaysia_Singapore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_baseurl;
import App_Modules.Shortlist_Feature;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Scroll_Page;
import Base_Utils.Wait_Commands;
import Base_Utils_Verify.Verify_Element_Displayed;
import Base_Utils_Verify.Verify_HTTPRequest;
import Base_Utils_Verify.Verify_Text;
import Base_Utils_Verify.Verify_Text_Boolean;
import Base_Utils_Verify.Verify_error_message;
import POM_Files.Newlaunch_POM_File;



public class Verify_DetailsPage_Formfield_Validations_LeadSubmission {
	
	

	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	 
	 
	 
	    

	     static WebDriver driver;
	     
	     public static Logger Log = Logger.getLogger(Verify_Any_Broken_Links.class.getName());

	     
	  
	     


	    @
	    BeforeMethod
	    public static void OpeningBrowser() throws InterruptedException, IOException {


	    	
	    	DOMConfigurator.configure("log4j.xml");
	    	
	    	
	        // Create a new instance of the  driver

	    	//WebDriver driver = new FirefoxDriver();

	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Files\\chromedriver.exe");
	         driver = new ChromeDriver();

	    	 //System.setProperty("webdriver.ie.driver", "C:\\Users\\vinayak\\Documents\\Selenium\\Drivers\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
	         // driver = new InternetExplorerDriver();
	    	

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
	
	
	
	    
	    
// TEST Scenario: Verify_DetailsPage_Title_Validations



	 	    @Test 
	 	    public static void Verify_DetailsPage_Title_Validations() throws InterruptedException, IOException, Exception{

	 	    	
	 	   	 System.out.println("Verify_DetailsPage_Title_Validations........");

	 	    	// POM File Constructors

	 	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


	 	        // clcik search btn

	 	        page.search_Btn.click();
	 	        Wait_Commands.Executeimplicitwait(driver);


	 	        // click view details btn

	 	        page.view_btn1.click();
	 	       

	 	        // put implicit wait
	            Wait_Commands.Executeimplicitwait(driver);
	 	        
	            
	         
	            // Validate Titles ON DETAILS PAGE
	            
	            
	               //boolean Title = page.main_headline_detailspage.isDisplayed();
	            
	            Verify_Element_Displayed.Execute(driver, page.main_headline_detailspage, "Main Headline");
	 	      
	 	   
	            Verify_Element_Displayed.Execute(driver, page.sub_headline_detailspage, "Sub Headline");
	            
	            
	            
	            // click property tab
	            
	            page.PropertyDescription_tab_detailspage.click();
	            
	            
	            Verify_Element_Displayed.Execute(driver, page.PropertyDescription_title_detailspage, "PropertyDescription Headline");
	            
	            
	            Verify_Element_Displayed.Execute(driver, page.QuikProNo_title_detailspage, "QuikProNo Title");
	            
	            Verify_Element_Displayed.Execute(driver, page.QuikProNo_value_detailspage, "QuikProNo Value");
	            
	            
	            
	            Verify_Element_Displayed.Execute(driver, page.Address_title_detailspage, "Address_title ");
	            
	            Verify_Element_Displayed.Execute(driver, page.Address_value_detailspage, "Address_value ");
	            
	            
	            
	            Verify_Element_Displayed.Execute(driver, page.PropertyType_title_detailspage, "PropertyType_title ");

	            Verify_Element_Displayed.Execute(driver, page.PropertyType_value_detailspage, "PropertyType_title ");
	            
	            
	            
	            Verify_Element_Displayed.Execute(driver, page.ListingPrice_title_detailspage, "ListingPrice_title ");
	            
	            Verify_Element_Displayed.Execute(driver, page.ListingPrice_value_detailspage, "ListingPrice_value ");
	            
	           
	            
	            //Verify_Element_Displayed.Execute(driver, page.PropertyDetails_title_detailspage, "PropertyDetails Headline");
	            
	            
	            Verify_Element_Displayed.Execute(driver, page.tellmemore_title_detailspage, "Tellme more Headline");
	 	        
	            
	            /*
	            
	        	// Verify Carousel feature

	            System.out.println("Verify Carousel feature ");

	            page.Carousel_right_detailspage.click();
	            Thread.sleep(2000);
	            page.Carousel_left_detailspage.click();
	            Thread.sleep(2000);
	            
	            
	            */
	            
	            
	            
	            
	            
	            
	            
	            
	 	       
	 	    }


	 	    
	 	    


// TEST Scenario: Go TO landing page > Listing page > details page > verify Formfield_Validations



	    @Test 
	    public static void Verify_DetailsPage_Formfield_Validations() throws InterruptedException, IOException, Exception{

	    	
	   	 System.out.println("Verify_DetailsPage_Formfield_Validations........");

	    	// POM File Constructors

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


	        // clcik search btn

	        page.search_Btn.click();
	        Thread.sleep(1000);


	        // click view details btn

	        page.view_btn1.click();
	       

	        // put implicit wait
           Wait_Commands.Executeimplicitwait(driver);
	        
           
           // Validate Name field error message
           
	       Verify_error_message.Execute(driver, page.name_field_bottom, page.register_btn_bottom, page.name_error, "T", "Please enter at least 2 characters.", "Name Field: ");
	       
	       
	       // Validate EMAIL field error message
	       
	       Verify_error_message.Execute(driver, page.email_field_bottom, page.register_btn_bottom, page.email_error, "0121312111", "Please enter a valid email address.", "Email Field: ");
	  

          // Validate PHONE  field error message
	       
	       Verify_error_message.Execute(driver, page.phone_field_bottom, page.register_btn_bottom, page.phone_error, "test", "Please specify a valid phone number.", "Phone Field: ");
	       
	       
	       
          // Validate REMARKS  field error message
	       
	       Verify_error_message.Execute(driver, page.remark_field, page.register_btn_bottom, page.remark_error, "", "This field is required." , "Remark Field: ");
	       
	       
        
	       
	       
	    }




	    
	    
// TEST Scenario: Verify Carousel feature  & Lead_Submission feature



	    @Test 
	    public static void Verify_DetailsPage_LeadSubmission_Bottom() throws InterruptedException, IOException, Exception{


	    	 System.out.println("Verify_DetailsPage_Lead_Submission_Bottom........");


	       // POM File Constructor

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);




	        // clcik search btn landing page

	        page.search_Btn.click();
	        Thread.sleep(1000);


	        // click view details btn

	        page.view_btn2.click();
	        
	        
	        // put implicit wait
	           Wait_Commands.Executeimplicitwait(driver);

	        

	        // Enter name
	         page.name_field_bottom.clear();
	         Thread.sleep(1000);
	         page.name_field_bottom.sendKeys(Constant_baseurl.excel.getData(0, 1, 1));
	         Thread.sleep(1000);
	         
	         
	        // Enter email
	         page.email_field_bottom.clear();
	         Thread.sleep(1000);
	         page.email_field_bottom.sendKeys(Constant_baseurl.excel.getData(0, 1, 2));
	         Thread.sleep(1000);

	        // Enter phone
	         page.phone_field_bottom.clear();
	         Thread.sleep(1000);
	         page.phone_field_bottom.sendKeys(Constant_baseurl.excel.getData(0, 1, 3));
	         Thread.sleep(1000);


	        // Select Country

	         Dropdown_Feature.Execute_visibletext(driver, page.country_dropdown_bottom, Constant_baseurl.excel.getData(0, 1, 4));


	        // Enter Reamrks

	         page.remark_field.sendKeys(Constant_baseurl.excel.getData(0, 1, 5));
	         Thread.sleep(1000);
	         
	        // Check Updates
	         
	         page.recieve_updates_check_bottom.click();
	         Thread.sleep(1000);
	         page.recieve_updates_check_bottom.click();
	         Thread.sleep(1000);
	         
	         
	         // check Terms and conditions
	         
	         page.terms_conditions_check_bottom.click();
	         Thread.sleep(1000);
	  
	         
	         // Submit Btn
	         
	         page.register_btn_bottom.submit();
	         Thread.sleep(3000);
	         
	         
	        // wait cmd
	         
	         Wait_Commands.ExecuteExplicitClickable(driver, page.thankyou_bottom_message);
	         
	         
	         // Assertion - TY Message
	         
	         Verify_Text.Execute(driver, page.thankyou_bottom_message, "Thank you, your message have been successfully sent out." , "Thankyou Message: ");
	         
	         
	        
	         // Verify API Submission 
	         
	         
		        Verify_HTTPRequest.Execute(driver, "http://test.newlaunch.iproperty.com.my/api/developer/sendenquiry", "API -emailtofriend Response is");
		         
		         
		         
		        
	        
	    }
	    
	    
	    
	    
	  
	    
// TEST Scenario: Verify Lead_Submission feature TOP



	    @Test 
	    public static void Verify_DetailsPage_LeadSubmission_Top() throws InterruptedException, IOException, Exception{


	    	 System.out.println("Verify_DetailsPage_Lead_Submission_TOP........");


	       // POM File Constructor

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);



	        // clcik search btn landing page

	        page.search_Btn.click();
	        Thread.sleep(1000);


	        // click view details btn

	        page.view_btn5.click();
	       
	        
	        // put implicit wait
	           Wait_Commands.Executeimplicitwait(driver);
	        

	        // Enter name
	         page.name_field_top.clear();
	         Thread.sleep(1000);
	         page.name_field_top.sendKeys(Constant_baseurl.excel.getData(0, 1, 1));
	         Thread.sleep(1000);

	        // Enter email
	         page.email_field_top.clear();
	         Thread.sleep(1000);
	         page.email_field_top.sendKeys(Constant_baseurl.excel.getData(0, 1, 2));
	         Thread.sleep(1000);

	        // Enter phone
	         page.phone_field_top.clear();
	         Thread.sleep(1000);
	         page.phone_field_top.sendKeys(Constant_baseurl.excel.getData(0, 1, 3));
	         Thread.sleep(1000);


	        // Select Country

	         Dropdown_Feature.Execute_visibletext(driver, page.country_dropdown_top, Constant_baseurl.excel.getData(0, 1, 4));


	        
	         
	        // Check Updates
	         
	         page.recieve_updates_check_top.click();
	         Thread.sleep(1000);
	         page.recieve_updates_check_top.click();
	         Thread.sleep(1000);
	         
	         
	         // check Terms and conditions
	         
	         page.terms_conditions_check_top.click();
	         Thread.sleep(1000);
	  
	         
	         // Submit Btn
	         
	         page.register_btn_top.submit();
	        
	         
	         // put implicit wait
	           Wait_Commands.ExecuteExplicitVisible(driver, page.thankyou_top_message);
	         
	           
	         // scroll down page
	           
	          Scroll_Page.Execute(driver);
	          
	          
	         // Assertion - TY Message
	         
	         Verify_Text.Execute(driver, page.thankyou_top_message, "Thank you, your message have been successfully sent out." , "Thank you Message: ");
	         
	        
	        
	         // Verify API Submission 
	         
	         
		        Verify_HTTPRequest.Execute(driver, "http://newlaunch.iproperty.com.my/api/developer/emailtofriend", "API -emailtofriend Response is");
		         
		         
		         
	        
	    }
	    
	    
	    
	    
	    
	    
	    
	    
// TEST Scenario: Verify_DetailsPage_SocialSharing_Top



	    @Test 
	    public static void Verify_DetailsPage_SocialSharing() throws InterruptedException, IOException, Exception{


	    	 System.out.println("Verify_DetailsPage_SocialSharing........");


	       // POM File Constructor

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);



	        // clcik search btn landing page

	        page.search_Btn.click();
	    
	        
	        // put implicit wait
	           Wait_Commands.Executeimplicitwait(driver);


	        // click view details btn

	        page.view_btn1.click();
	       
	        
	        // put implicit wait
	           Wait_Commands.Executeimplicitwait(driver);
	        
	           
	          
	        // click reveal number
	           
	           WebElement number = page.reveal_number;
	           
	           
	           number.click();
	           
	           //System.out.println(number.getText());
	        	
	        	
	        	if(number.isEnabled())
	        	{
	        		 System.out.println(  "Reveal Number" + ANSI_GREEN  + " is Active" + ANSI_RESET);
	        		 
	        	}
	        	else {
	        		
	        		 System.out.println( "Reveal Number" + ANSI_RED  + " is In-Active" + ANSI_RESET );
	        		
	        	}
	     
	           
	        	
	        	
	           // Verify shortlist feature social share section
	        	
	        	Shortlist_Feature.Execute(driver, page.shortlist_detailspage_btn, page.sign_into_iproperty_registerpage);
	         
	            
	            
	            // put implicit wait
		           Wait_Commands.Executeimplicitwait(driver);
		           
		           
		       
		        // Click email share
		           
		           
		         page.email_share_detailspage.click();
		         
		         
		         // enter name
		         
		         page.name_field_propertyshare.sendKeys("Test Purpose Only");
		         
		         
		         
		         int i;
		         for ( i=1; i<=5; i++){
		         
		         // enter email 5 times
		         
		         page.email_field_propertyshare.sendKeys(Constant_baseurl.excel.getData(2, i, 1));
		         
		        // page.email_field_propertyshare.sendKeys("test123@gmail.com");
	           
		         page.email_field_propertyshare.sendKeys(Keys.ENTER);
		         
	            
	        	
		         }
		         
		         
		         
	           
		         // click submit btn
		         
		         page.email_submit_btn_propertyshare.submit();
		         
		         
		         // wait cmd
		         
		         Wait_Commands.ExecuteExplicitVisible(driver, page.thankyou_message_emaitofrnd);
		         
		         
		         // Assertion - TY Message
		         
		         Verify_Text.Execute(driver, page.thankyou_message_emaitofrnd, "Thank you, your message have been successfully sent out." , "Thank you Message: ");
		         
		         
		         
		         // Verify API Submission 
		         
		         
		        Verify_HTTPRequest.Execute(driver, "http://newlaunch.iproperty.com.my/api/developer/emailtofriend", "API -emailtofriend Response is");
		         
		         
		         
		      
	           
	    }
	    
	    
	    
	    
	    
	    
		  
	    
// TEST Scenario: Verify Lead_Submission feature scroll bar



	 	    @Test 
	 	    public static void Verify_DetailsPage_LeadSubmission_ScrollBAR() throws InterruptedException, IOException, Exception{


	 	    	 System.out.println("Verify_DetailsPage_LeadSubmission_ScrollBAR........");


	 	       // POM File Constructor

	 	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);



	 	        // clcik search btn landing page

	 	        page.search_Btn.click();
	 	        Thread.sleep(1000);


	 	        // click view details btn

	 	        page.view_btn4.click();
	 	       
	 	        
	 	        // put implicit wait
	 	           Wait_Commands.Executeimplicitwait(driver);
	 	           
	 	           
	 	           
	 	        // SCROLL DOWN
	 	           
	 	          Scroll_Page.Execute(driver);
	 	          
	 	          
	 	        // clck scrollbar_btnContactDevPopup
	 	          
	 	         page.scrollbar_btnContactDevPopup.click();
	 	        

	 	        // Enter name
	 	         page.name_field_scrollbar.clear();
	 	         Thread.sleep(1000);
	 	         page.name_field_scrollbar.sendKeys(Constant_baseurl.excel.getData(0, 1, 1));
	 	         Thread.sleep(1000);

	 	        // Enter email
	 	         page.email_field_scrollbar.clear();
	 	         Thread.sleep(1000);
	 	         page.email_field_scrollbar.sendKeys(Constant_baseurl.excel.getData(0, 1, 2));
	 	         Thread.sleep(1000);

	 	        // Enter phone
	 	         page.phone_field_scrollbar.clear();
	 	         Thread.sleep(1000);
	 	         page.phone_field_scrollbar.sendKeys(Constant_baseurl.excel.getData(0, 1, 3));
	 	         Thread.sleep(1000);


	 	        // Select Country

	 	         Dropdown_Feature.Execute_visibletext(driver, page.country_dropdown_scrollbar, Constant_baseurl.excel.getData(0, 1, 4));


	 	         
	 	     // Enter Reamrks

		         page.remark_field_scrollbar.sendKeys(Constant_baseurl.excel.getData(0, 1, 5));
		         Thread.sleep(1000);
		         
		         
	 	        
	 	         
	 	        // Check Updates
	 	         
	 	         page.recieve_updates_check_scrollbar.click();
	 	         Thread.sleep(1000);
	 	         page.recieve_updates_check_scrollbar.click();
	 	         Thread.sleep(1000);
	 	         
	 	         
	 	         // check Terms and conditions
	 	         
	 	         page.terms_conditions_check_scrollbar.click();
	 	         Thread.sleep(1000);
	 	  
	 	         
	 	         // Submit Btn
	 	         
	 	         page.tellmemore_sumbitbtn_scrollbar.submit();
	 	        
	 	         
	 	         // put implicit wait
	 	           Wait_Commands.ExecuteExplicitVisible(driver, page.thankyou_scrollbar_message);
	 	         
	 	           
	 	       
	 	         // Assertion - TY Message
	 	         
	 	         Verify_Text.Execute(driver, page.thankyou_scrollbar_message, "Thank you, your message have been successfully sent out." , "Thank you Message: ");
	 	         
	 	        
	 	        
	 	        
	 	    }
	 	    	    
	    
	    
	    

}



/*


Verify_error_message.Execute(driver, page.email_error, "Email");

Verify_error_message.Execute(driver, page.phone_error, "Phone");

Verify_error_message.Execute(driver, page.remark_error, "Remarks");

Verify_error_message.Execute(driver, page.terms_conditions_error, "Terms& conditions");

Verify_error_message.Execute(driver, page.continue_alert_error, "To Continue, please agree");


*/