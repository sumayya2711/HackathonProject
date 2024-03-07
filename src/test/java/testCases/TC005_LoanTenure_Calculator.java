package testCases;

import org.testng.annotations.Test;

import pageObjects.LoanTenureCalculator;
import testBase.BaseClass;

public class TC005_LoanTenure_Calculator extends BaseClass {
	
	@Test(priority=1)
	public void Test5_001()
	{
		LoanTenureCalculator loan_tenure=new LoanTenureCalculator(driver);
		logger.info("****Loan Tenure validation initiated****");
		loan_tenure.switchToLoanTenure();
		loan_tenure.loanTenureValidation();
		logger.info("****Loan Tenure validation ended****");
	}

}
