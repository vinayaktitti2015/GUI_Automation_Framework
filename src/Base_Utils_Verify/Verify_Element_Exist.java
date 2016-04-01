package Base_Utils_Verify;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Verify_Element_Exist {


	public static String element;

    @Test
	public static void control () {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.imoney.my/");
		
		
		
		 WebElement element1= driver.findElement(By.xpath("//*[@id='featured']/div/div/div[2]/div[1]/div[1]/a/img"));
		
		System.out.println(Exist(element1));
	
		
		}
	
	
    
  
	
	
	public static boolean Exist(WebElement element){
		
		
		try {
			
			return element.isDisplayed();
			
		}catch (NoSuchElementException e){
		return false;
		}
		
		
		
		
		
		
	}
	
	
	
		
	
	

	}


