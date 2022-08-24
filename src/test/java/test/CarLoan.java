package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	
//	@BeforeTest
//	public void clLoginpage(){
//		System.out.println("test case for car loan login-executes before carloan testfolder");
//	}
	
	
	@Test(dependsOnMethods={"clDetails"})
	public void clChoosevehicle(){
		System.out.println("test case for choosing vehicle");
	}
	

	@Test(groups={"smoke"})
	public void clDetails(){
		System.out.println("test case for filling details");
	}
	
	@AfterTest
	public void plLogout(){
		System.out.println("executes after Car Loan testfolder");
	}
	@Test
	public void samplegit1() {
		System.out.println("edited now @ 8.45pm in sumitha");
	}
	
}
