package Utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void takeScreenshot(WebDriver driver,int testId) throws IOException
	{
		
		/*DateTimeFormatter Date = DateTimeFormatter.ofPattern("yyyy-mm-dd hh mm ss");
		LocalDateTime N = LocalDateTime.now();
		
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("test-output//Screenshot//Test-" + testId + " " + Date.format(N) + ".jpeg");
		 org.openqa.selenium.io.FileHandler.copy(src, dest);*/
		
		
		
		
		
		
		/*DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-dd-mm hh mm ss");
		LocalDateTime N = LocalDateTime.now();
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File dest = new File("test-output//Screenshot//Failss-" +testId + " " +Date.format(N) +".jpeg");
      //File dest = new File("test-output//Screenshot//Fails-" +testId+ " " +date.format(N)+".jpeg");
      
		File dest = new File("test-output//Screenshot//Test-" +testId+ " "+date.format(N) +".jpeg");
		FileHandler.copy(src, dest);*/
		
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-mm-dd hh mm ss");
		LocalDateTime N = LocalDateTime.now();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("test-output//Screenshot//Test-" +testId+ " "+date.format(N) +".jpeg");
		
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
		 
		 
	}
	
}
