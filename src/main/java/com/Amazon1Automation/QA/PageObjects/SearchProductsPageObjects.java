package com.Amazon1Automation.QA.PageObjects;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Amazon1Automation.QA.BaseClass.BaseClass;
import com.Amazon1Automation.QA.TestData.WorkingWithDataProviderExample1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SearchProductsPageObjects extends BaseClass
{

	public SearchProductsPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']") 
	private WebElement enterProductToSearch;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	@FindBy(xpath="//a[text()='Mobiles' and@ data-csa-c-content-id='nav_cs_mobiles']")
	private WebElement mobilesTab;
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	private WebElement searchResutsMessage;
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	private WebElement searchbarAllDropDown;
	@FindBy(xpath="//li[@aria-label='Get It Today']//descendant::input[@type='checkbox']//following-sibling::i[@class='a-icon a-icon-checkbox']")
	private WebElement checkBoxGetItToday;
	
	public void verifyGetItToday()
	{
		enterProductToSearch.sendKeys("books");
		searchButton.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		boolean x = checkBoxGetItToday.isSelected();
		if(x==false)
		{
			System.out.println("The checkbox is not checked");
			checkBoxGetItToday.click();	
		}
		else if(x==true)
		{
			System.out.println("The checkbox is allready checked, so you can un check it");
			checkBoxGetItToday.click();
		}
		
	}
	
	public void validateSearchBoxDropDown()
	{
		ExtentTest test;
		ExtentReports report;
		String filePath = "C:\\Users\\Prathap\\OneDrive\\Desktop\\Batch\\SPG4\\SPG4Maven\\Amazon1Automation\\src\\main\\java\\com\\Amazon1Automation\\QA\\Reports\\";
		report = new ExtentReports(filePath+"ExtentReportResults.html");
		test = report.startTest("ExtentDemo");

		
		String itemsInDropDown = searchbarAllDropDown.getText();
		if(itemsInDropDown.contains("Jewelldddery"))
		{
			System.out.println("The given item is present in the list");
			test.log(LogStatus.PASS, "The given item is present in the list");
		}
		else
		{
			System.out.println("The given item is not present in the list");
			test.log(LogStatus.FAIL, "The given item is not present in the list");
		}
		
		report.endTest(test);
		report.flush();
	}
	
	// This test case will select an option from dropdown and validate if it is selected
	public void workingWithDropDown()
	{
		Select allDropdown = new Select(searchbarAllDropDown);
		//allDropdown.selectByVisibleText("Car & Motorbike");
		//allDropdown.selectByValue("search-alias=automotive");
		allDropdown.selectByIndex(14);
		WebElement x = allDropdown.getFirstSelectedOption();
		String textfromDropdown = x.getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(textfromDropdown, "mputers & Accessories","The dropdown value is not selected");
		enterProductToSearch.sendKeys("engine oil");
		searchButton.click();
		softAssert.assertAll();
	}
	

	
	public void searchProduct(String product)
	{
		enterProductToSearch.sendKeys(product);
		searchButton.click();
		enterProductToSearch.clear();	
	}
	
	public void searchThroughMobileTab()
	{
		mobilesTab.click();
		enterProductToSearch.sendKeys("iphone pro 14");
		searchButton.click();		
	}
	
		
}