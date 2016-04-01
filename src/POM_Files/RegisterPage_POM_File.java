package POM_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage_POM_File {
	
	
	
	public  RegisterPage_POM_File (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

	
	
	
// REGISTER PAGE  properties.......
	
	
	@FindBy(id= "loginbtn")
	public WebElement signin_btn_registerpage;
	
	
	@FindBy(id= "txtEmail")
	public WebElement email_field_registerpage;
	
	@FindBy(id= "txtPassword")
	public WebElement passwrd_field_registerpage;
	
	
	@FindBy(id= "chkAutoSign")
	public WebElement checkbox_registerpage;
	
	
	
	
	
	
	
	
	
	

}
