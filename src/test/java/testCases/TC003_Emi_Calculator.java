package testCases;

import org.testng.annotations.Test;

import pageObjects.EmiCalculator;
import testBase.BaseClass;

public class TC003_Emi_Calculator extends BaseClass{
	
	@Test(priority=1)
	public void TC003_Test1()
	{
		EmiCalculator emi=new EmiCalculator(driver);
		emi.menu_click();
	}
	@Test(priority=2)
	public void TC003_Test2()
	{
		EmiCalculator emi=new EmiCalculator(driver);
		emi.verify_title();
	}
	@Test(priority=3)
	public void TC003_Test3()
	{
		EmiCalculator emi=new EmiCalculator(driver);
		logger.info("****Emi validation initiated****");
		emi.loanAmountValidation();
		logger.info("****Emi validation ended****");
	}

}
