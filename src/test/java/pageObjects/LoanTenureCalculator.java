package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanTenureCalculator extends BasePage {

	public LoanTenureCalculator(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//li[@id='loan-tenure-calc']")
	WebElement loan_tenure_menu;
	@FindBy(xpath="//input[@id='loanamount']")
	WebElement loan_amount;
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	WebElement loan_amount_slider;
	@FindBy(xpath="//input[@id='loanemi']")
	WebElement emi_checkbox;
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]")
	WebElement emi_slider;
	@FindBy(xpath="//input[@id='loaninterest']")
	WebElement interest_checkbox;
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement interest_slider;
	@FindBy(xpath="//input[@id='loanfees']")
	WebElement fees;
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement fees_slider;
	
	//To click on loan tenure calculator
	public void switchToLoanTenure()
	{
		loan_tenure_menu.click();
	}
	//To validate text boxes and sliders in loan tenure calculator
	public void loanTenureValidation()
	{
		if(loan_amount.isEnabled()==true)
		{
			System.out.println("Validation for Loan Tenure Calculator page");
			System.out.println("-----------------------------------");
			System.out.println("AmountcheckBox is validated");
		}
		else
		{
			System.out.println("AmountcheckBox is not validated");
		}
		if(loan_amount_slider.isEnabled()==true)
		{
			System.out.println("Amount Slider is validated");
		}
		else
		{
			System.out.println("Amount Slider is not validated");
		}
		if(emi_checkbox.isEnabled()==true)
		{
			System.out.println("Emi checkBox is validated");
		}
		else
		{
			System.out.println("Emi checkBox is not validated");
		}
		if(emi_slider.isEnabled()==true)
		{
			System.out.println("Emi Slider is validated");
		}
		else
		{
			System.out.println("Emi Slider is not validated");
		}
		if(interest_checkbox.isEnabled()==true)
		{
			System.out.println("Interest Rate checkBox is validated");
		}
		else
		{
			System.out.println("Interest Rate checkBox is not validated");
		}
		if(interest_slider.isEnabled()==true)
		{
			System.out.println("Interest Rate Slider is validated");
		}
		else
		{
			System.out.println("Interest Rate Slider is not validated");
		}
		if(fees.isEnabled()==true)
		{
			System.out.println("Fees and charges tenure checkBox is validated");
		}
		else
		{
			System.out.println("Fees and charges tenure checkBox is not validated");
		}
		if(fees_slider.isEnabled()==true)
		{
			System.out.println("Fees and charges Slider is validated");
		}
		else
		{
			System.out.println("Fees and charges Slider is not validated");
		}
	}
}
