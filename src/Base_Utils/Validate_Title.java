package Base_Utils;

import java.io.IOException;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Validate_Title {
	
	
	// pass actual & expected values in the script ex:  class.Execute(driver,"actual","expected");

	public static boolean Execute(WebDriver driver,  String expected, String result ) throws IOException   {
		
		try {
	 Assert.assertEquals(driver.getTitle(), expected , result );
		}catch(Exception e){
	return false;
	}
	return true;
		
		
	}

}
