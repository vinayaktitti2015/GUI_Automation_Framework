package Base_Utils;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verify_TY_Message {
	
	
	// pass actual & expected values in the script ex:  class.Execute(driver,"actual","expected");

			public static void Execute(WebDriver driver, WebElement path, String expected ) throws IOException   {
				
			try {
				
				 String Element1 = "Make sure to check these out!";
					
					
			       assertTrue("Verification failed: Element1 and Element2 are not same.",Element1.equals(driver.findElement(By.className("home__section__title" )).getText()));
			    	   
	        }catch(Exception e){
				e.printStackTrace();
			}		
							
					
				 
				
				
				
			}

}
