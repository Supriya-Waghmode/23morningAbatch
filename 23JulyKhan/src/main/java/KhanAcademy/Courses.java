package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses {
	Actions act;

	
	
	@FindBy (xpath="//span[normalize-space()='Class 1']")private WebElement clas1;
	
	@FindBy(xpath="//a[@class='_1lrvdlvw']")private WebElement getstart;
	
	@FindBy(xpath="(//a[@role='button'])[1]") private WebElement start;
	
	@FindBy(xpath="//img[@tabindex='0']")private WebElement drag;
	
	@FindBy(xpath="//div[@class='perseus-clearfix draggable-box']")private WebElement drop;
	
	public Courses(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	    act = new Actions(driver);
	}
	
	
	public void Class1() throws InterruptedException
	{
		clas1.click();
		Thread.sleep(2000);
	}
	
	public void Counting() throws InterruptedException
	{
		getstart.clear();
		Thread.sleep(2000);
	}
	
	public void Starting() throws InterruptedException
	{
		start.clear();
		Thread.sleep(2000);
	}
	
	public void DRAGDROP() {
		for(int i=1;i<10;i++) {
			act.dragAndDrop(drag, drop).perform();
			
		}
	}


	
	
	
}
