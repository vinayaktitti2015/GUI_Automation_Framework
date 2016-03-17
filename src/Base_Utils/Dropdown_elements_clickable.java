package Base_Utils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown_elements_clickable {
	
	public static void Execute(WebDriver driver, WebElement locator) throws IOException   {
		
		
		 // id of the dropdown
        WebElement dropdown = locator;
        
        // capture all the proprty type elements
        
        List<WebElement>list = dropdown.findElements(By.tagName("option"));
        
        for(int i=0; i<list.size(); i++){
        	
        	
        	list.get(i).click();
        	
        	
        	if(list.get(i).isSelected())
        	{
        		
             System.out.println(list.get(i).getText() + " is Active");
        	}
        	
        	
        	else{
        		
        		 System.out.println(list.get(i).getText() + " is In-Active");
        		
        	}
        }
        
		
		
		
		
	}

}
