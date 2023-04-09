package com.Amazon1Automation.QA.PageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;



public class BestSellersPageObjects extends BaseClass
{

	
	public BestSellersPageObjects() 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//ancestor::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
    private WebElement enterSearchProduct;
    @FindBy(xpath="//ancestor::span[@id='nav-search-submit-text']//input[@type='submit']")
    private WebElement searchMirror;
    @FindBy(xpath="//ancestor::div[@class='nav-left']//a[@aria-label='Open Menu']") 
    private WebElement allTab;
   // @FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_mobiles']")
   // private WebElement mobileTab;
    @FindBy(xpath="//ul[@class='hmenu hmenu-visible']")
    private WebElement scrollDown; 	
    @FindBy(xpath="//a[@class='hmenu-item' ]//child::div[contains(text(),'Mobiles, Computers')]")
    private WebElement mobilesComputers;
    @FindBy(xpath="//a[@class='hmenu-item' and contains(text(),'All Mobile Phones')]")
    private WebElement allMobiles;
    @FindBy(xpath="//ancestor::ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item' and contains(text(),'Best Sellers')]")
    private WebElement bestSellersTab;
    @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal' and contains(text(),'Fire-Boltt Phoenix Smart Watch with Bluetooth Calling 1.3\",120+ Sports Modes, 240*240 PX High Res with SpO2, Heart Rate Monitoring & IP67 Rating')]")
    private WebElement watchSelect;
   // @FindBy(xpath="//input[@name='submit.add-to-cart']//ancestor::span[@class='a-button a-spacing-small a-button-primary a-button-icon']")
    //private WebElement addTocart;
    @FindBy(xpath="//html[@lang='en-in']")
    private WebElement scrollDownButton;
 // @FindBy(xpath="//input[@name='submit.add-to-registry.wishlist']//ancestor::span[@id='wishListMainButton']")
   private WebElement wishList;
   
   /*Author:Pallavi
    * Date :2.12.2022
    * Description:SearchProduct
    * TestCaseId:TC01
    */
   public void searchAProduct()
    {
    	enterSearchProduct.sendKeys("front load washing machines");
    	searchMirror.click();
    }
    /*Author:Pallavi
     * Date :2.12.2022
     * Description:Search Through Mobile Tab
     * TestCaseId:TC02
     */
    public void searchThroughAMobileTab()
    {
    	//mobileTab.click();
    	allTab.click();
    	scrollDown.click();
    	mobilesComputers.click();
        allMobiles.click();
    	enterSearchProduct.sendKeys("Oneplus 10");
    	searchMirror.click();
    }
    
    /*Author:Pallavi
     * Date :2.12.2022
     * description:Search a Product Through Best Sellers
     * TestCaseId:Tc03
     */
    public void bestSellers()
    {
    	allTab.click();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	//scrollDown.click();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	bestSellersTab.click();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	enterSearchProduct.sendKeys("Fire-Boltt Phoenix Smart Watch with Bluetooth Calling");
    	searchMirror.click();
     }
	
	
}
