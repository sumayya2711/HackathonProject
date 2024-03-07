package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utilities.ReadExcel;
import utilities.WriteExcel;

public class HomeLoan extends BasePage{
	
	public HomeLoan(WebDriver driver) {
		super(driver);
		
		
		
	}

	@FindBy(xpath="//a[@title='Calculators']")
	WebElement menu;
	@FindBy(xpath="//a[@title='Home Loan EMI Calculator']")
	WebElement homeloan;
	@FindBy(xpath="//input[@id='homeprice']")
	WebElement home_price;
	@FindBy(xpath="//input[@id='downpayment']")
	WebElement downpay_el;
	@FindBy(xpath="//input[@id='homeloanterm']")
	WebElement home_tenure;
	@FindBy(xpath="//input[@id='homeloaninsuranceamount']")
	WebElement insurance;
	@FindBy(xpath="//div[@id='paymentschedule']")
	WebElement yearTable;
	@FindBy(xpath="//table[@class='noextras']/tbody")
	WebElement table;
	@FindBy(xpath="//table[@class='noextras']/tbody/tr")
	List<WebElement> row;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String file = (System.getProperty("user.dir")+"/testData/input.xlsx");

   // To click on home loan emi calculator
	public void click_Menu()
	{
		menu.click();
		homeloan.click();
	}
	// To verify home loan calculator title
	public void verify_homeloan_page()
	{
		String title="Home Loan EMI Calculator with Prepayments, Taxes & Insurance";
		String expected_title=driver.getTitle();
		System.out.println(expected_title);
		Assert.assertEquals(title, expected_title);
		}
	//To set home price value
	public void setHomePrice() throws IOException
	{
		home_price.clear();
		home_price.sendKeys(Keys.BACK_SPACE);
		String str=ReadExcel.getCellData(file,"Sheet1", 1, 3);
		home_price.sendKeys(str);
	}
	
	//To set down pay value
	public void setDownPay() throws IOException
	{
		downpay_el.sendKeys(Keys.BACK_SPACE);
		String str=ReadExcel.getCellData(file,"Sheet1", 1, 4);
		downpay_el.sendKeys(str);
	}
	//To set loan tenure value
	public void setTenure() throws IOException
	{
		home_tenure.clear();
		home_tenure.sendKeys(Keys.BACK_SPACE);
		home_tenure.sendKeys(Keys.BACK_SPACE);
		String str=ReadExcel.getCellData(file,"Sheet1", 1, 5);
		home_tenure.sendKeys(str);
	}
    //To  set value for insurance textbox
	public void setInsurance() throws IOException
	{
		insurance.sendKeys(Keys.BACK_SPACE);
		String str=ReadExcel.getCellData(file,"Sheet1", 1, 6);
		insurance.sendKeys(str);
	}
	//To scroll to year on table
	public void scrollToTable() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", yearTable);
		
	}

	//To write data to excel
	public void storingDataToExcel() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WriteExcel.setCellData("Sheet1", 0, 0, "Year");
		WriteExcel.setCellData("Sheet1", 0, 1, "Principal");
		WriteExcel.setCellData("Sheet1", 0, 2, "Interest");
		WriteExcel.setCellData("Sheet1", 0, 3, "Taxes, Home Insurance & Maintenance");
		WriteExcel.setCellData("Sheet1", 0, 4, "Total Payment");
		WriteExcel.setCellData("Sheet1", 0, 5, "Balance");
		WriteExcel.setCellData("Sheet1", 0, 6, "Loan Paid To Date");
		WriteExcel.setCellData("Sheet1", 1, 0,"");
		

		int rownum=row.size();
		for(int r=2;r<rownum;r=r+2)
		{
			
		
			//read data from webtable
			String year=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[1]")).getText();
			String principal=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[2]")).getText();
			String interest1=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[3]")).getText();
			String tax=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[4]")).getText();
			String total=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[5]")).getText();
			String balance=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[6]")).getText();
			String paid=driver.findElement(By.xpath("//table[@class='noextras']/tbody/tr["+r+"]/td[7]")).getText();
			
			System.out.println(year+principal+interest1+tax+total+balance+paid);
			
			//write data to excel
			WriteExcel.setCellData("Sheet1", r, 0, year);
			WriteExcel.setCellData("Sheet1", r, 1, principal);
			WriteExcel.setCellData("Sheet1", r, 2, interest1);
			WriteExcel.setCellData("Sheet1", r, 3, tax);
			WriteExcel.setCellData("Sheet1", r, 4, total);
			WriteExcel.setCellData("Sheet1", r, 5, balance);
			WriteExcel.setCellData("Sheet1", r, 6, paid);
			
			
		}
	}
}

