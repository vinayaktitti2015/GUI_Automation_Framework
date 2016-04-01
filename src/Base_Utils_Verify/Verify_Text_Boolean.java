package Base_Utils_Verify;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_Text_Boolean {
	
	
	 public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_BLACK = "\u001B[30m";
	 public static final String ANSI_RED = "\u001B[31m";
	 public static final String ANSI_GREEN = "\u001B[32m";
	
	

	public static void Execute(WebDriver driver, WebElement locator, String textname) throws IOException   {
	
	// GETTING CC IMAGE
	
	
	try {

		WebElement TextFile = locator;

		String Actual = TextFile.getText();
		
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("", Actual);

		if (!ImagePresent) {
			System.out.println(ANSI_RED + Actual +"  Text NOT Found." + ANSI_RESET);
		} else {
			System.out.println(ANSI_GREEN + Actual + " Text  Found." + ANSI_RESET);
		}

	} catch (Exception e) {
		System.out.println(e.getClass());
		e.printStackTrace();
	}
	
	
	}

}
