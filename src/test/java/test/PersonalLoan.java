package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {

	@BeforeSuite
	public void OpenLoanURL(){
		System.out.println("execute before ALL Test folder");
	}
	
	@BeforeTest
	public void plLoginpage(){
		System.out.println("test case for login-executes before personal loan testfolder");
	}
	@BeforeClass
	public void plclass() {
		System.out.println("It will execute before every class");
	}
	
	@Test(priority=1)
	public void plInstructionPage(){
		System.out.println("test case for instructionPage");
	}
	
	@Test(priority=2)
	public void plEmicalculatorPage(){
		System.out.println("test case for calculating emi");
	}
	
	@BeforeMethod
	public void plNavigateTotoolbar(){
		System.out.println("executes before each test case");
	}
	@AfterMethod
	public void plEnterBack(){
		System.out.println("execute after each test case ");
	}
	
	@AfterTest
	public void plLogout(){
		System.out.println("executes after PersonalLoan testfolder");
	}
	
	@AfterSuite
	public void CloseLoanURL(){
		System.out.println("executes after ALL testfolder");
	}
	
	
}
