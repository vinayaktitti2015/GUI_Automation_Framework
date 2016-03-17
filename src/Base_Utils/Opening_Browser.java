package Base_Utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Opening_Browser {
	
	
	public static void Execute(WebDriver driver, String baseurl){
		
		
		


		        // Create a new instance of the  driver

		    	//WebDriver driver = new FirefoxDriver();

		    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium Files\\chromedriver.exe");
		         driver = new ChromeDriver();


		        // Launch the URL
		        driver.get(baseurl);

		        //Maximize the browser
		        driver.manage().window().maximize();

		        // Put an Implicit wait,
		 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		    

		
		
	}

}
