package TestingKhan;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KhanAcademy.CodeAdd;
import KhanAcademy.LogOut;
import KhanAcademy.Login;
import KhanAcademy.Teachers;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.khanacademy.org/login");
		 
		 driver.manage().window().maximize();
		 
		 Login l = new Login(driver);
		 l.loginLink();
		 Thread.sleep(2000);
		 
		 l.enterUN();
		 Thread.sleep(1000);
		 
		 l.enterPWD();
		 Thread.sleep(2000);
		 
		 l.Login();
		 Thread.sleep(2000);
		 
		 Teachers T=new Teachers(driver);
		 
		 T.Teach();
		 Thread.sleep(1000);
		 
		 T.EnterClassCode();
		 Thread.sleep(2000);
		 
		 
		 CodeAdd ca = new CodeAdd(driver);
		  ca.Addcode();
		 Thread.sleep(2000);
		 ca.Continue();
		 Thread.sleep(1000);
		 
		 Thread.sleep(2000);
		 LogOut lo = new LogOut(driver);
		 lo.BackButton();
		 Thread.sleep(1000);
		 lo.Account();
		 Thread.sleep(1000);
		 lo.Acc_Logout();
		 
		 
		
	}
}
