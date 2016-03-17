package Base_Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Commands {

	
	public static void ExecuteExplicitClickable(WebDriver driver, WebElement locator) throws IOException   {
		
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		
		
		
	}
	
	
	
	public static void ExecuteExplicitPresence(WebDriver driver, WebElement locator) throws IOException   {
		
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
		
		
		
		
	}
	
	
	public static void ExecuteExplicitVisible(WebDriver driver, WebElement locator) throws IOException   {
		
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.visibilityOf( locator));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
