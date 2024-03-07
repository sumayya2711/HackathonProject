package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanAmountCalculator extends BasePage{

	public LoanAmountCalculator(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//ul[@class='loancalculator-nav']/li[2]")
	WebElement clickonloanAmount;
	@FindBy(xpath="//input[@id='loanemi']")
	WebElement EmiTextbox;
	@FindBy(xpath="//div[@id='loanemislider']")
	WebElement Emislider;
	@FindBy(xpath="//input[@id='loaninterest']")
	WebElement Interestcheckbox;
	@FindBy(xpath="//div[@id='loaninterestslider']")
	WebElement Interestslider;
	@FindBy(xpath="//input[@id='loanterm']")
	WebElement InterestTenureCheckBox;
	@FindBy(xpath="(//span[@class='marker'])[25]")
	WebElement InterestTenureslider;

	@FindBy(xpath="(//label[@class='btn btn-secondary'])[1]")
	WebElement clickonMonth;
	@FindBy(xpath="//input[@id='loanfees']")
	WebElement FeesCheckbox;
	@FindBy(xpath="//div[@id='loanfeesslider']")
	WebElement Feesslider;
	// To click on loan amount calculator
	public void SwitchtototalAmount() {
		clickonloanAmount.click();
	}
	
	//To validate text boxes and sliders in loan amount calculator
	public void LoanAmountvalidation() {
		if(EmiTextbox.isEnabled()==true) {
			System.out.println("Validation for Loan Amount Calculator page");
			System.out.println("-----------------------------------");
			System.out.println("AmountcheckBox is validated");
		}
		else
		{
			System.out.println("AmountcheckBox is not validated");
		}
		if(Emislider.isEnabled()==true) {
			System.out.println("Amount Slider is validated");
		}
		else
		{
			System.out.println("Amount Slider is not validated");
		}
		if(Interestcheckbox.isEnabled()==true) {
			System.out.println("AmountInterestcheckbox is validated");
		}
		else
		{
			System.out.println("AmountInterestcheckbox is not validated");
		}
		if(Interestslider.isEnabled()==true) {
			System.out.println("AmountInterestSlider is validated");
		}
		else
		{
			System.out.println("AmountInterestSlider is not validated");
		}
		String value1=InterestTenureslider.getText();
		clickonMonth.click();
		WebElement monthTenure=InterestTenureslider;
		String value2=monthTenure.getText();
		if(value1.equals(value2)) {
			System.out.println("Values are not changing");
		}
		else {
			System.out.println("Amount Tenure is validated");
		}
		if(FeesCheckbox.isEnabled()==true) {
			System.out.println("FeesCheck box is validated");
		}
		else
		{
			System.out.println("FeesCheck box is not validated");
		}
		if(Feesslider.isEnabled()==true) {
			System.out.println("FeesSlider is validated");
		}	
		else
		{
			System.out.println("FeesSlider is not validated");
		}
}
}	

