package com.Amazon1Automation.QA.PageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTablesExamplePageObjects extends BaseClass
{

	
	public void webTableMoneyControlWorkingWithRows() 
	{
		List<WebElement> a = driver.findElements(By.xpath("//table[@class='tbldata14 bdrtpg']//descendant::tr"));
		System.out.println("Number of Rows inside the table are "+a.size());
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		    
		for(int i=1;i<=a.size();i = i + 1) // this for loop is for number of rows means number of tr tags
		{
			WebElement row = driver.findElement(By.xpath("//table[@class='tbldata14 bdrtpg']//descendant::tr["+i+"]"));
			jsExecutor.executeScript("arguments[0].style.border='2px solid red'", row);
			System.out.println("Data from the Row number "+i+" is "+row.getText());
			
		}
	}
	
	
	public void webTableMoneyControlWorkingWithColumns() 
	{
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tbldata14 bdrtpg']//descendant::tr"));
		System.out.println("Number of Rows inside the table are "+rows.size());
		
		for(int i=2;i<=rows.size();i=i+1)
		{
		   String xpathForColumns= "//table[@class='tbldata14 bdrtpg']//descendant::tr["+i+"]//descendant::td"; // this is xpath for all the columns in each row
		   List<WebElement> columns = driver.findElements(By.xpath(xpathForColumns));
		   for(int j=0;j<columns.size();j++)
			{
				String dataInCell = columns.get(j).getText();
				System.out.println("Data from Row Number "+i+" and column number "+j+" is "+dataInCell);
			}
		   System.out.println("****************************************************************************");
		   
		}
		
	}
	
}