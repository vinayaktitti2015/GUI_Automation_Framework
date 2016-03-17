package App_Modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Handling_Captcha {


	public WebDriver driver;


	public static void Execute(WebDriver driver) throws IOException   {


//Method -2


// We can't automate captacha but can Handle those. scenario: 1. enter username 2. enter captcha in console manually 3. enter password
	
	
	
  //driver.findElement(By.id("username")).sendKeys("username");
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String captcha;   
            System.out.println("Please Enter the CAPTCHA Code:: ");
            captcha = br.readLine();
            System.out.println("Entered  CAPTCHA Code is:: "+captcha);
            driver.findElement(By.id("password")).sendKeys("password");

    }
	
}




//Method- 2






