package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomeLoan;
import testBase.BaseClass;



public class TC002_HomeLoan_Calculator extends BaseClass {
	
	@Test(priority=1)
	public void Test2_001()
	{
		HomeLoan home=new HomeLoan(driver);
		home.click_Menu();
	}
	@Test(priority=1)
	public void Test2_002()
	{
		HomeLoan home=new HomeLoan(driver);
		home.verify_homeloan_page();
	}
	
	@Test(priority=2)
	public void Test2_003() throws IOException 
	{
		HomeLoan home=new HomeLoan(driver);
		
		home.setHomePrice();
		
	}
	@Test(priority=3)
	public void Test2_004() throws IOException, InterruptedException {
		HomeLoan home=new HomeLoan(driver);
		home.setDownPay();
		home.setTenure();
		home.setInsurance();
		home.scrollToTable();
	}
	@Test(priority=4)
	public void Test2_005() throws IOException {
		HomeLoan home=new HomeLoan(driver);
		home.storingDataToExcel();
	}
		
}

	

