package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PersonalLoan2 {
	@BeforeClass
	public void plclass2() {
		System.out.println("It will execute before class of PL2");
	}
	
	@Test
	public void plInst2(){
		System.out.println("test case for instructionPage2");
	}
	
	@Test
	public void pllogin2(){
		System.out.println("test case for login2");
	}
	
	
}
