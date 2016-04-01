package Test_Scripts_Malaysia_Singapore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.DDT.Excel_Data_Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_baseurl;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Wait_Commands;
import Base_Utils_Verify.Verify_Element_Displayed;
import Base_Utils_Verify.Verify_HTTPRequest;
import Base_Utils_Verify.Verify_Text;
import POM_Files.Newlaunch_POM_File;

public class Verify_Developers_Page {

	
	

    static WebDriver driver;

   
  


   @
   BeforeMethod
   public static void OpeningBrowser() throws InterruptedException, IOException {


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





// TEST Scenario: Go TO landing page > Listing page > details page > developers page > verify Formfield_Validations



   @Test 
   public static void Verify_Developers_Page_LeadSubmission() throws InterruptedException, IOException, Exception{


   	// POM File Constructors

       Newlaunch_POM_File page = new Newlaunch_POM_File(driver);
       

  	 System.out.println("Verify_Developers_Page_LeadSubmission");
  	 
  	 
  	 
       // clcik search btn

       page.search_Btn.click();
       Thread.sleep(2000);


       // click view details btn

       page.view_btn3.click();
       Thread.sleep(2000);
       
       
       //driver.switchTo().frame(driver.findElement(By.className("custom3b")));
       
       
       Wait_Commands.ExecuteExplicitClickable(driver,  page.developer_link_detailspage);
       
      // click developer link
       
       page.developer_link_detailspage.click();
       
       
       // put implicit wait
       
       Wait_Commands.Executeimplicitwait(driver);

        
       // Enter name
       page.name_developer.clear();
       
       page.name_developer.sendKeys(Constant_baseurl.excel.getData(0, 1, 1));
       

      // Enter email
       page.email_developer.clear();
      
       page.email_developer.sendKeys(Constant_baseurl.excel.getData(0, 1, 2));
      

      // Enter phone
       page.phone_developer.clear();
      
       page.phone_developer.sendKeys(Constant_baseurl.excel.getData(0, 1, 3));
      



      // Enter Reamrks

       page.message_developer.sendKeys(Constant_baseurl.excel.getData(0, 1, 5));
       
       
 
       
       
       // check Terms and conditions
       
       page.terms_developer.click();
       

       
       // Submit Btn
       
       page.submit_btn_developer.submit();
       Thread.sleep(5000);
       
       
      // wait cmd
       
       Wait_Commands.ExecuteExplicitClickable(driver, page.thankyou_developer_message);
       
       
       // Assertion - TY Message
       
       Verify_Text.Execute(driver, page.thankyou_developer_message, "Thank you, your message have been successfully sent out." , "TY Message");
       
       
       
       // Verify API Submission 
       
       
       Verify_HTTPRequest.Execute(driver, "http://test.newlaunch.iproperty.com.my/api/developer/sendenquiry", "API - Developer Sendenquiry Response: ");
       
       
       
       
  
       
   }
   
   
   
   
//TEST Scenario: Verify_DetailsPage_Title_Validations



	    @Test 
	    public static void Verify_DeveloperPage_Title_Validations() throws InterruptedException, IOException, Exception{

	    	
	   	 System.out.println("Verify_DeveloperPage_Title_Validations........");

	   	 
	    	// POM File Constructors

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


	        // clcik search btn

	        page.search_Btn.click();
	        Wait_Commands.Executeimplicitwait(driver);


	        // click view details btn

	        page.developer_link_listingpage.click();
	       

	        // put implicit wait
           Wait_Commands.Executeimplicitwait(driver);
	        
           
        
           // Validate Titles ON DEVELOPERS PAGE
           
           
              //boolean Title = page.main_headline_detailspage.isDisplayed();
           
           Verify_Element_Displayed.Execute(driver, page.main_headline_detailspage, "Main Headline");
	      
	   
           Verify_Element_Displayed.Execute(driver, page.sub_headline_detailspage, "Sub Headline");
           
           
           
           
           
           
           
           
           
	    }
}
