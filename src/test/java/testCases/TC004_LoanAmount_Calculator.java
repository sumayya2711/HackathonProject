package testCases;

import org.testng.annotations.Test;

import pageObjects.LoanAmountCalculator;
import testBase.BaseClass;

public class TC004_LoanAmount_Calculator extends BaseClass {
	
	@Test(priority=1)
	public void Test4_001()
	{
		
		LoanAmountCalculator loan=new LoanAmountCalculator(driver);
		logger.info("****Loan Amount validation initiated****");
		loan.SwitchtototalAmount();
		loan.LoanAmountvalidation();
		logger.info("****Loan Amount validation ended****");
	}

}
