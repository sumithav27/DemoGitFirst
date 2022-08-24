package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {

	@Parameters({"URL"})
	@Test
	public void WebLogin(String url){
		System.out.println(url);
	}
	
//	@Test(dataProvider="getData")
//	public void MobileAppLogin(String username,String pass){
//		System.out.println(username);
//		System.out.println(pass);
//	}
//	
//	@DataProvider
//	public Object[][]  getData(){
//		Object[][] data=new Object[2][2];
//		data[0][0]="firstuser";
//		data[0][1]="fistpassword";
//		data[1][0]="seconduser";
//		data[1][1]="secondpass";
//		return data;
//	}
//	
	@Test
	public void failure(){
		Assert.assertTrue(false);
	}
//	
//	@Test(enabled=false)
//	public void notneedtest(){
//		System.out.println("not needed testcase");
//	}
//	
//	@Test
//	public void skipped(){
//		System.out.println("skipped");
//		throw new SkipException("still under development");
//	}
//	
//	@Test(retryAnalyzer=test.RetryAnalyzer.class)
//	public void test1(){
//		System.out.println("retry Testcase");
//		SoftAssert softassert=new SoftAssert();
//		softassert.assertEquals("Run", "Run");  //
//		softassert.assertEquals("come", "go");
//		softassert.assertAll();
//	}
//	private int i=0;
//	@Test(successPercentage=80,invocationCount=5)
//	public void ontestfailedpercent() {
//		++i;
//		boolean a=i<4;
//		Assert.assertTrue(a);
		
	 
	//}
	
	
	
}
