package com.Amazon1Automation.QA.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class WorkingWithAlertsPageObjects extends BaseClass
{
	
	public WorkingWithAlertsPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='promtButton']") 
	private WebElement clickMeButton;
	
	public void workingWithAlerts()
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",clickMeButton);
	//	clickMeButton.click();
		driver.switchTo().alert().dismiss(); // dismiss() will click the cancel button on an alert 
		clickMeButton.click();
		driver.switchTo().alert().sendKeys("Ram"); // sendkeys() will send text on to the editbox present on a alert/popup
		driver.switchTo().alert().accept(); // accept() will click the ok button or confirm button present on the alert/popup
		
		
	}	
	
}