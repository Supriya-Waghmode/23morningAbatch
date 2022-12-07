package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {

   @FindBy(xpath="(//span[@class='_xy39ea8'])[67]")
    private WebElement teacher; 
	
	@FindBy(xpath="//a[@class='_1rhl3qm4']")
	private WebElement enterClassCode;
	
   @FindBy(xpath="//span[text()='Profile']")
   private WebElement profile;
	
	public Teachers(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Teach() {
		teacher.click();
	}
	
	public void EnterClassCode()
	{
		enterClassCode.click();	
	}
	
	public void Profile()
	{
		profile.click();
	}
	
}

