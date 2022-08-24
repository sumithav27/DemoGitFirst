package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoforRetry {
	
	@Test(retryAnalyzer=test.Retry.class)
	public void retrying() {
		System.out.println("Sample code");
		Assert.assertTrue(false);
	}

}
