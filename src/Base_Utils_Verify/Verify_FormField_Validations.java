package Base_Utils_Verify;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_FormField_Validations {
	
	
	public static void Execute(WebDriver driver, WebElement locator, String fieldname)throws IOException   {
		
		
		
		 String[] invalidChars = {"#", "!", "$", "@", "%", "^", "&"};
		    String name = "acbcdefghijklmnopqrstuvwxyzab";
		    
		    
		    for (String invalid : invalidChars) {
		        driver.findElement(By.id("FIRSTNAME")).clear();
		        driver.findElement(By.id("FIRSTNAME")).sendKeys(name + invalid);
		        driver.findElement(By.id("Button1")).click();
		        String alertMessage = driver.switchTo().alert().getText();
		        System.out.println(invalid);
		        if (alertMessage.equals("First name Should not contain Special Characters")) {
		            System.out.println("Error displayed: First name Should not contain Special Characters");
		            driver.switchTo().alert().dismiss();
		        } else {
		            System.out.println("Accepted");
		        }
		    }
		    driver.findElement(By.id("FIRSTNAME")).sendKeys("acbcdefghijklmnopqrstuvwxyzabcdef");
		    driver.findElement(By.id("Button1")).click();
		    String alertMessage = driver.switchTo().alert().getText();
		    if (alertMessage.equals("First name Should not contain Special Characters")) {
		        System.out.println("Error displayed: First name Should not contain Special Characters");
		        driver.switchTo().alert().dismiss();
		    } else {
		        System.out.println("Accepted");
		    }
		
		
		
		
		
		
	}

}
