package com.Amazon1Automation.QA.PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class WorkingWithFramesPageObjects extends BaseClass
{
	
	public WorkingWithFramesPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='AbstractDriverOptions']") 
	private WebElement abstractDriverOptionsLink;
	@FindBy(xpath="//iframe[@name='packageFrame']") 
	private WebElement allClassesFrame;
	@FindBy(xpath="//input[@id='search']")
	private WebElement searchBox;

	public void highLighNumberOfFrames() 
	{
		//istURL=https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		List<WebElement> listOfFrameElements = driver.findElements(By.xpath("//iframe"));
		System.out.println("Total number of frmes in this web page are "+listOfFrameElements.size());
		for(int i=0;i<listOfFrameElements.size();i++)
		{
			jsExecutor.executeScript("arguments[0].style.border='4px solid yellow'", listOfFrameElements.get(i));
		}	
	}	
	
	public void clickAnElement()
	{
		//istURL=https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html
		driver.switchTo().frame(allClassesFrame);
		abstractDriverOptionsLink.click();
		driver.switchTo().defaultContent(); // this line of code will switch the control back to the top of the html page or the DOM structure
		driver.switchTo().frame("classFrame"); // this will switch to a frame whose name is classFrame
		searchBox.sendKeys("buildIt");
		Actions acc = new Actions(driver);
		acc.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void nestedFrames()
	{
		
	}
	
}