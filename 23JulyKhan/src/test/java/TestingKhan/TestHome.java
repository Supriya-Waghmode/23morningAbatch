package TestingKhan;

import java.io.IOException;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KhanAcademy.LogOut;
import KhanAcademy.Login;
import KhanAcademy.Teachers;
import Utils.Utility;

public class TestHome {
	
	WebDriver driver;
	Login l;
	Teachers T;
	LogOut lo;
	int testId;
	
	
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.khanacademy.org/login");
		 
		driver.manage().window().maximize();
	}

		
	@BeforeMethod
	public void beforemethod()
	{
	      l=new Login(driver);
	      l.loginLink();
		  l.enterUN();
		  l.enterPWD();
		  l.Login();
		  
	}
	
	@Test
	public void test()
	{
		testId = 1234;
		System.out.println("Test method is running");
		
		 T = new Teachers(driver);
		 T.Teach();
		 
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://www.khanacademy.org/profile/me/teachers"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
	}
	
	@Test
	public void test2() {
	  testId = 4567;
	  T = new Teachers(driver);
	  
	  T.Profile();
	  
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://www.khanacademy.org");
	  if(url.equals("https://www.khanacademy.org"))
		  
	  {
		  System.out.println("Test case is passed");
	  }
	  
	  else
	  {
		  System.out.println("Test case is failed");
	  }
	  
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.takeScreenshot(driver, testId);
		}
		
		 lo = new LogOut(driver);
		 lo.Account();
		 lo.Acc_Logout();
	}
	
	
	@AfterClass
	public void afterClass()
	{
	  driver.close();	
	}
	
	
		
		
}
