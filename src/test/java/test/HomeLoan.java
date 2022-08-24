package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {

//	@BeforeTest
//	public void hlLoginpage(){
//		System.out.println("test case for HOME loan login-executes before carloan testfolder");
//	}
	
	@Test(groups={"smoke"})
	public void hlSubmitPropertyDetails(){
		System.out.println("test case for submitting property details");
	}
	
	@Test(priority=1)
	public void hlDetails(){
		System.out.println("test case for filling HOME Loan details");
	}
		
	@AfterTest
	public void plLogout(){
		System.out.println("executes after HOME Loan testfolder");
	}
}
