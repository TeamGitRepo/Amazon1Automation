package com.Amazon1Automation.QA.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class LoginPageObjects extends BaseClass
{

	public LoginPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-nav-ref='nav_custrec_signin']//child::span[@class='nav-action-inner' and text()='Sign in']") 
	private WebElement SignInButton;
	@FindBy(xpath="//label[@class='a-form-label']//following-sibling::input[@id='ap_email']") 
	private WebElement enterEmailOrMobilePhoneNumber;
	@FindBy(xpath="//span[@id='continue-announce']//preceding-sibling::input[@id='continue']") 
	private WebElement continueButton;
	@FindBy(xpath="//ancestor::div[@class='a-section']//descendant::input[@name='password']") 
	private WebElement enterpassword;
	@FindBy(xpath="//span[@class='a-button-text']//preceding-sibling::input[@id='signInSubmit']")
	private WebElement signinClick;
	@FindBy(xpath="//span[@class='nav-line-2 ' and contains(text(), 'Account & Lists')]") 
	private WebElement hoverToLogout;
	@FindBy(xpath="//span[@class='nav-text' and contains(text(),'Sign Out')]") 
	private WebElement signOut;

	
	public void logout() 
	{
		Actions acc = new Actions(driver);
		acc.moveToElement(hoverToLogout).build().perform();
		signOut.click();	
	}
	
	public void launchApplication()
	{
		try
		{
		  driver.get(prop.getProperty("istURL"));
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(TimeoutException obj)
		{
			obj.printStackTrace();
		}
		catch(NullPointerException obj)
		{
			obj.printStackTrace();
		}
		catch(Throwable obj)
		{
			obj.printStackTrace();
		}
		
	}
	
	public void login()
	{
		try
		{
		SignInButton.click();
		}
		catch(NoSuchElementException obj)
		{
			obj.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		enterEmailOrMobilePhoneNumber.sendKeys(prop.getProperty("istUserName"));
		continueButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		enterpassword.sendKeys(prop.getProperty("istPassword"));
		signinClick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	
	
}