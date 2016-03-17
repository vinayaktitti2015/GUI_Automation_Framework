package Test_Scripts;

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

import App_Modules.Constant_Baseurl;
import Base_Utils.Dropdown_Feature;
import Base_Utils.Verify_Header;
import Base_Utils.Wait_Commands;
import POM_Files.Newlaunch_POM_File;

public class Verify_Developers_Page {

	
	

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

   	 //System.setProperty("webdriver.ie.driver", "C:\\Users\\vinayak\\Documents\\Selenium\\Drivers\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
        // driver = new InternetExplorerDriver();
   	

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
       
       
       Wait_Commands.ExecuteExplicitClickable(driver,  page.developer_link);
       
      // click developer link
       
       page.developer_link.click();

        
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
       
       
      // wait cmd
       
       Wait_Commands.ExecuteExplicitClickable(driver, page.thankyou_bottom_message);
       
       
       // Assertion - TY Message
       
       Verify_Header.Execute(driver, page.thankyou_bottom_message, "Thank you, your message have been successfully sent out.");
       
       
       
       
       
       
   }
}
