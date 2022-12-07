package TestingKhan;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTestNG {

	@BeforeClass
    public void beforeClass() {
		System.out.println("before class is running");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is running");
	}
	
	
	@Test
	public void test() {
		System.out.println("test method is running");
	}
	
	

}
