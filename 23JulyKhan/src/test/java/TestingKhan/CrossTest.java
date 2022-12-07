package TestingKhan;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import KhanAcademy.LogOut;
import KhanAcademy.Login;
import KhanAcademy.Teachers;

public class CrossTest {
	
	WebDriver driver;
	Login l;
	Teachers T;
	LogOut lo;
	
	@Parameters("browser")
	
	@BeforeTest
	
	public void openBrowser(String browsername)
	{
		System.out.println(browsername);
		
		if(browsername.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		    driver = new EdgeDriver();
		}
		
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.khanacademy.org/login");
		 
		driver.manage().window().maximize();
	}
	
	
	
	@BeforeClass
	public void beforeclass() {
		l = new Login(driver);
		T = new Teachers(driver);
		lo = new LogOut(driver);
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
	  T = new Teachers(driver);
	  
	  T.Profile();
	  
	  String url = driver.getCurrentUrl();
	  if(url.equals("https://www.khanacademy.org/profile/me/"))
		  
	  {
		  System.out.println("Test case is passed");
	  }
	  
	  else
	  {
		  System.out.println("Test case is failed");
	  }
	  
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		 lo = new LogOut(driver);
		 lo.Account();
		 lo.Acc_Logout();
	}
	
	
	@AfterClass
	public void afterClass()
	{
	  l = null;
	  T = null;
	  lo = null;
	}
	
	@AfterTest
	 public void aftertest()
	 {
		driver.close();
		System.gc();
	 }
	
	
		
		
}




