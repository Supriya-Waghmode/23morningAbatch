package TestingKhan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOn {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class is running");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method is running");
	}
	
	@Test  (priority = 4)
	public void test1()
	{
	   	System.out.println("Test1 method is running");
	}
	
	@Test  (priority = 2,dependsOnMethods = {"test3"})
	public void test2()
	{
		System.out.println("Test2 method is running");
	}
	
	@Test (priority = 1)
	public void test3()
	
	{
		System.out.println("Test3 methgod is running");
	}
	
	@Test  (priority = 3)
	public void test4() {
		System.out.println("Test4 method is running");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method is running");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class is running");
	}
	
	
	
	
	
	
	
	
	
}
