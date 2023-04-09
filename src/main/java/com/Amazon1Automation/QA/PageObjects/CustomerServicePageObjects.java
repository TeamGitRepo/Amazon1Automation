package com.Amazon1Automation.QA.PageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class CustomerServicePageObjects extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public CustomerServicePageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	@FindBy(xpath="//div[@class='nav-left']//descendant::a[@aria-label='Open Menu']")
	private WebElement allMenuButton;
	@FindBy(xpath="//a[@class='hmenu-item' and contains(text(),'Customer Service')]")
	private WebElement customerService;
	@FindBy(xpath="//img[@alt='Manage Addresses']//parent::div[@class='a-column a-span3']//ancestor::div[@class='a-box-inner']")
	WebElement manageAddressButton;
	@FindBy(xpath="//h2[@class='a-color-tertiary' and contains(text(),'Add address')]//parent::div[@class='a-box-inner a-padding-extra-large']//ancestor::div[@class='a-column a-span4 a-spacing-none a-spacing-top-mini address-column']")
	WebElement addAddress;
	@FindBy(xpath="//span[@class='a-dropdown-prompt' and contains(text(),'India')]//ancestor::span[@id='address-ui-widgets-countryCode']//child::span[@class='a-dropdown-prompt' and contains(text(),'India')]")
	WebElement country;
	@FindBy(xpath="//div[@class='a-row']//child::div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container']//child::input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullName;
	@FindBy(xpath="//div[@class='a-row']//child::div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container']//child::input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement mobileNumber;
	@FindBy(xpath="//div[@class='a-row']//child::div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container']//child::input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement pinCode;
	@FindBy(xpath="//div[@class='a-row']//child::div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container address-ui-widgets-field-container-fixed-height']//child::input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement addressLine1;
	@FindBy(xpath="//div[@class='a-row']//child::div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container address-ui-widgets-field-container-fixed-height']//child::input[@id='address-ui-widgets-enterAddressLine2']")
	WebElement addressLine2;
	@FindBy(xpath="//div[@class='a-row']//child::div[@class='a-section a-spacing-base adddress-ui-widgets-form-field-container']//child::input[@id='address-ui-widgets-landmark']")
	WebElement landMark;
	@FindBy(xpath="//div[@class='a-column a-span6']//child::div[@class='a-section a-spacing-none adddress-ui-widgets-form-field-container']//child::input[@id='address-ui-widgets-enterAddressCity']")
	WebElement townORCity;
	@FindBy(xpath="//div[@class='a-column a-span6 a-span-last']//child::span[@class='a-dropdown-container']//child::select[@name='address-ui-widgets-enterAddressStateOrRegion']//child::option[contains(text(),'ANDHRA PRADESH')]")
	WebElement state;
	@FindBy(xpath="//select[@name='address-ui-widgets-addr-details-address-type-and-business-hours']//child::option[@value='RES']")
	WebElement addressType;
	@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button']//child::input[@class='a-button-input']")
	WebElement addAddressButton;
	
	@FindBy(xpath="//div[@id='address-ui-widgets-original-address-block_id-outer']//child::input[@id='address-ui-widgets-original-address-block_id-input' and @value='original-address-']")
	WebElement originalAddress;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-saveOriginalOrSuggestedAddress']")
	WebElement saveAddress;
	
	@FindBy(xpath="//div[@class='a-box-inner a-alert-container']//descendant::h4[@class='a-alert-heading']")
	private WebElement addNewAddressStatusMessage;
	
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with adding new address functionality 
	 * built id:-
	 */
	public void addNewAddress(String pincd)
	{
		allMenuButton.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",customerService);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//scrollDown.click();
		customerService.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		manageAddressButton.click();
		addAddress.click();
		country.click();
		fullName.sendKeys(prop.getProperty("fullName"));
		mobileNumber.sendKeys(prop.getProperty("mobileNumber"));
		//pinCode.sendKeys(prop.getProperty("pinCode"));
		pinCode.sendKeys(pincd);
		addressLine1.sendKeys(prop.getProperty("addressLine1"));
		addressLine2.sendKeys(prop.getProperty("addressLine2"));
		landMark.sendKeys(prop.getProperty("landMark"));
		townORCity.clear();
		townORCity.sendKeys(prop.getProperty("city"));
		state.click();
		addressType.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.click(addAddressButton).build().perform();
		addAddressButton.click();
		try 
		{
			action.click(originalAddress).build().perform();
			action.click(saveAddress).build().perform();
		}
		catch(JsonException jE)
		{
			jE.printStackTrace();
		}
		
		String actualText = addNewAddressStatusMessage.getText();
		System.out.println("Actual Text after adding the existing address is "+actualText);
		//String expectedText = "You have submitted an address that is already in your address book";
		String expectedText = "jgfhghghgchg";
		
		
		SoftAssert a = new SoftAssert();
		a.assertEquals(actualText, expectedText, "Test Case Fail");
		a.assertEquals(actualText, expectedText, "Test Case Fail");
		a.assertEquals(actualText, expectedText, "Test Case Fail");
		a.assertEquals(actualText, expectedText, "Test Case Fail");
		a.assertEquals(actualText, expectedText, "Test Case Fail");
		
		System.out.println("I am line 1 after hard assert");
		System.out.println("I am line 2 after hard assert");
		System.out.println("I am line 3 after hard assert");
		a.assertAll("Assert is done and messages are written to testNG report");
		
	}


}
