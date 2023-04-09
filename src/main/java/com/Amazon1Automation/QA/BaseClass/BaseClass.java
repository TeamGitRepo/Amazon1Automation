package com.Amazon1Automation.QA.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{

	public static WebDriver driver;
	public static Properties prop;
	public static final String propertyFilePath = "C:\\Users\\Prathap\\OneDrive\\Desktop\\Batch\\SPG4\\SPG4Maven\\Amazon1Automation\\src\\main\\java\\com\\Amazon1Automation\\QA\\Configuration\\config.properties"; 
	
	
	
	public BaseClass()
	{
		try
		{
		File fl = new File(propertyFilePath);
		FileInputStream fis = new FileInputStream(fl);
		prop = new Properties();
		prop.load(fis);
		}
		catch(FileNotFoundException obj)
		{
			obj.printStackTrace();
		}
		catch(IOException obj)
		{
			obj.printStackTrace();
		}
	}
	
	/*@Test
	@Parameters({"browserToExecute"})
	public void initilize(String browserToExecute)
	{
		if(browserToExecute.equalsIgnoreCase("chrome")==true)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserToExecute.equalsIgnoreCase("firefox")==true)
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserToExecute.equalsIgnoreCase("ie")==true)
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
	}*/
/*
	@Test
	@Parameters({("browserToExecute"), ("pinCode")})
	public void initilize(String browserDetails, String pincode)
	{
		System.out.println("Pin Code is "+pincode);
		if(browserDetails.equalsIgnoreCase("chrome")==true)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserDetails.equalsIgnoreCase("firefox")==true)
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserDetails.equalsIgnoreCase("ie")==true)
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
	}
	
*/
	
	
	@Test
	public void initilize()
	{
		if(prop.getProperty("browserToExecute").equalsIgnoreCase("chrome")==true)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browserToExecute").equalsIgnoreCase("firefox")==true)
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("I have launched firefox browser");
		}
		else if(prop.getProperty("browserToExecute").equalsIgnoreCase("ie")==true)
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		System.out.println("hai");
		driver.manage().window().maximize();
	}
	

	
	
	
}
