package com.Amazon1Automation.QA.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class HomeImprovementPageObjects extends BaseClass
{
  
	
	public HomeImprovementPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Electronics ']//following-sibling::a[text()='Home Improvement']")
	private WebElement clickHomeImprovement;
	@FindBy(xpath="//div[text()='AmazonBasics Security Safe 20 litres']//ancestor::div[@class='DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32']//descendant::div[text()='AmazonBasics Security Safe 20 litres']")
	private WebElement clickOnProductLocker;
	@FindBy(xpath="//i[@class='a-icon a-icon-cart']//following-sibling::button[@id='dealsx_atc_btn-announce']")
	private WebElement clickAddToCart;
	@FindBy(xpath="//a[@title='Go to Cart']//ancestor::span[@class='a-button a-spacing-mini a-button-span12 a-button-base']//descendant::a[@title='Go to Cart']")
	private WebElement clickOnGoToCart;
	@FindBy(xpath="//option[@data-a-html-content='0 (Delete)']//ancestor::span[@class='a-dropdown-container']//descendant::option[@data-a-html-content='0 (Delete)']")
	private WebElement dropDownOption;
	@FindBy(className="oxd-input oxd-input--active")
    private WebElement nameOfTheElement;
	@FindBy(id="oxd-input oxd-input--active")
    private WebElement var1;
	@FindBy(linkText="Best Sellers") 
	private WebElement BestSellersLink;
	@FindBy(partialLinkText="Mobiles") 
	private WebElement MobilesLink;	
	@FindBy(css="input[id='twotabsearchtextbox']")
	private WebElement searchEditBox;
	
	/*
	 * Author : Srilekha vegi
	 * Date: 4/12/2022
	 * Description :  Add Product To Cart
	 */
	public void AddToCart()
	{
		clickHomeImprovement.click();
		try
		{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",clickOnProductLocker);
			clickOnProductLocker.click();
		}
		catch(NoSuchElementException obj)
		{
			obj.printStackTrace();
		}
		clickAddToCart.click();
		clickOnGoToCart.click();
		dropDownOption.click();
	}
}
