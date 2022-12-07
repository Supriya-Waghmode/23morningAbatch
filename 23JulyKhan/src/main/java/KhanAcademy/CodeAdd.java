package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodeAdd {

	

	@FindBy(xpath="//input[@maxlength='8']")
	private WebElement addcode;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement continues;
	
	
	
	public CodeAdd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void Addcode()
	{
		addcode.sendKeys("32262708");
	}
	
	public void Continue()
	{
		continues.click();
	}
	
	
}
