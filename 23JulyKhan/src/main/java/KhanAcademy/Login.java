package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	//declaration of variables globally
	
	@FindBy(xpath="//a[@id='login-or-signup']")
    private WebElement loginlink;	
	
	
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")
     private WebElement	username;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//span[@data-learn-menu-trigger='true']")private WebElement course;
	
	
	
	
	//initialization of variable
	
	public Login(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
	}
	
	//Method Creation
	
	
	public void loginLink()
	{
		loginlink.click();
	}
	
	public void enterUN()
	{
		username.sendKeys("sdwaghmode15@gmail.com");
	}
	
	public void enterPWD()
	{
		password.sendKeys("Swarup@15");
	}
	
	public void Login()
	{
		login.click();
	}
	
	public void COURSES()
	{
		course.click();
	}
	
	
	
	
}
	
     
     
	
	
	




