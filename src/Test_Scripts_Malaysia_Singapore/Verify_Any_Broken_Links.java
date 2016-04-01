package Test_Scripts_Malaysia_Singapore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_baseurl;
import Base_Utils.Verify_Broken_Links;

public class Verify_Any_Broken_Links {
	
	

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
       
       Log.info("Baseurl Web application launched");

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
   
   
   
   
   
// TEST Scenario: Go TO landing page > Listing page > details page > verify Formfield_Validations



   @Test 
   public static void GET_Broken_Links() throws InterruptedException, IOException, Exception{

	   
	   System.out.println("GET_Broken_Links on Landing page........");
	   
	   
	   // verify landing page
	 Verify_Broken_Links.Execute(driver );
	   
	   
	   
	   
	   
	   
	   
   }
   
   
   
  
	

}
