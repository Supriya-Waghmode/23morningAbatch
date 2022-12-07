package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	
	@FindBy(xpath="//a[@role='button']")
	private WebElement back;
	
	@FindBy(xpath="//span[text()='sdwaghmode15']")
	private WebElement loginlink;
	
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement logout;
	
	
	 public LogOut(WebDriver driver)
	 {
		PageFactory.initElements(driver,this); 
	 }
	 
	 
	 
	 
	 public void BackButton() {
		 back.click();
	 }
	 
	public void Account() {
		loginlink.click();
	}
	
	public void Acc_Logout()
	{
		logout.click();
		
	}
	 
	 
}
