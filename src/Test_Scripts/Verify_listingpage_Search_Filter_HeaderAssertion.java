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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import App_Modules.Constant_Baseurl;
import Base_Utils.Verify_Header;
import POM_Files.Newlaunch_POM_File;

public class Verify_listingpage_Search_Filter_HeaderAssertion {


	    

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
	
	
	
	    
	    
	    

	// TEST Scenario: Select Property type/ state/area/click search btn-verify results page -Header[blank developer]


	    @Test (priority = 1)
	    public static void Verify_landingpage_Search_Filter_HeaderAssertion() throws InterruptedException, IOException, Exception{


	    	
	    	System.out.println("Verify_landingpage_Search_Filter_HeaderAssertion.......");
	    	
	    	
	    	 // POM File Constructors

	        Newlaunch_POM_File page = new Newlaunch_POM_File(driver);


	    	  // select property type -

	    	    WebElement dropdown = page.property_Type;
	            Select value = new Select(dropdown);
	            value.selectByIndex(2);
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
	
	
}
