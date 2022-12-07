package TestingKhan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KhanAcademy.Courses;
import KhanAcademy.LogOut;
import KhanAcademy.Login;
import KhanAcademy.Teachers;

public class DragTest {

	
		
		WebDriver driver;
		Login l;
		Teachers T;
		LogOut lo;
		
		Courses c;
		
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
			  l.COURSES();
			  
		}
		
		@Test
		public void test1() throws InterruptedException
		{
			 c = new Courses(driver);
			 c.Class1();
			 Thread.sleep(2000);
			 c.Counting();
			 Thread.sleep(2000);
			 c.Starting();
			 Thread.sleep(2000);
			 c.DRAGDROP();
			 Thread.sleep(2000);
			 
		}
		
		
		
		@AfterMethod
		public void afterMethod()
		{
			 System.out.println("aftermethod");
		}
		
		
		@AfterClass
		public void afterClass()
		{
		  System.out.println("afterclass");
		}
		
		
			
			
	}

		

	
	

