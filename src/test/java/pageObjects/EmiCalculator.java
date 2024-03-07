package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EmiCalculator extends BasePage{

	public EmiCalculator(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@title='Calculators']")
	WebElement menu;
	@FindBy(xpath="//a[@title='Loan Calculator']")
	WebElement loan_calculator;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement loan_amount;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement interest;
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	WebElement loan_tenure;
	@FindBy(xpath="(//input[@class='form-control'])[5]")
	WebElement fees;
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	WebElement slider1;
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement slider2;
	
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement slider4;
	@FindBy(xpath="(//label[@class='btn btn-secondary'])[1]")
	WebElement month;
	@FindBy(xpath="(//span[@class='marker'])[25]")
	WebElement InterestTenureslider;
	
	//To click on loan calculator
	public void menu_click()
	{
		menu.click();
		loan_calculator.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//To verify title
	public void verify_title()
	{
		String title="Loan Calculator — Calculate EMI, Affordability, Tenure & Interest Rate";
		String expected_title=driver.getTitle();
		Assert.assertEquals(title, expected_title);
		
	}
	//To validate text boxes and sliders in emi calculator page
	public void loanAmountValidation()
	{
		if(loan_amount.isEnabled()==true)
		{
			System.out.println("Validation for Emi Calculator page");
			System.out.println("-----------------------------------");
			System.out.println("AmountcheckBox is validated");
		}
		else
		{
			System.out.println("AmountcheckBox is not validated");
		}
		if(slider1.isEnabled()==true)
		{
			System.out.println("Amount Slider is validated");
		}
		else
		{
			System.out.println("Amount Slider is not validated");
		}
		if(interest.isEnabled()==true)
		{
			System.out.println("Interest checkBox is validated");
		}
		else
		{
			System.out.println("Interest checkBox is not validated");
		}
		if(slider2.isEnabled()==true)
		{
			System.out.println("Interest Slider is validated");
		}
		else
		{
			System.out.println("Interest Slider is not validated");
		}
		String value1=InterestTenureslider.getText();
		month.click();
		WebElement monthTenure=InterestTenureslider;
		String value2=monthTenure.getText();
		if(value1.equals(value2)) {
			System.out.println("Values are not changing");
		}
		else {
			System.out.println("Amount Tenure is validated");
		}
		if(fees.isEnabled()==true)
		{
			System.out.println("Fees and charges tenure checkBox is validated");
		}
		else
		{
			System.out.println("Fees and charges tenure checkBox is not validated");
		}
		if(slider4.isEnabled()==true)
		{
			System.out.println("Fees and charges Slider is validated");
		}
		else
		{
			System.out.println("Fees and charges Slider is not validated");
		}
	}
}
