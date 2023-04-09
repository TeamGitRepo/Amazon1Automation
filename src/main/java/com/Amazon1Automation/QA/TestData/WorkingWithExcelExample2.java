package com.Amazon1Automation.QA.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class WorkingWithExcelExample2 extends BaseClass
{
	@Test
	public void readDataFromExcel()
	{
		File fl;
		FileInputStream fis = null;
		XSSFWorkbook xlsxWorkbook = null; // this is a object to my workbook with xlsx extension
		HSSFWorkbook xlsWorkbook = null; // this is a object to my workbook with xls extension
		//Find extension of your excel file
		int indexOfDot = prop.getProperty("customerAddressTestPath").indexOf(".");
		String extensionOfExcelFile = prop.getProperty("customerAddressTestPath").substring(indexOfDot+1);
		System.out.println("Extension of my excel file is "+extensionOfExcelFile);
		// Load your excel file start
		fl = new File(prop.getProperty("customerAddressTestPath"));
		try 
		{
			fis = new FileInputStream(fl);
		} 
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		// Load your excel file complete
		if(extensionOfExcelFile.equalsIgnoreCase("xlsx")) // start of if
		{
			try
			{
			xlsxWorkbook = new XSSFWorkbook(fis);
			XSSFSheet sh = xlsxWorkbook.getSheet("AddressSheet");
            int numberOfRows = sh.getLastRowNum();
            for(int i=1;i<=numberOfRows;i++)
            {
               XSSFRow rw = sh.getRow(i);
               XSSFCell name = rw.getCell(0);
               XSSFCell mobileNumber = rw.getCell(1);
               XSSFCell pincode = rw.getCell(2);
               XSSFCell address1 = rw.getCell(3);
               XSSFCell address2 = rw.getCell(4);
               XSSFCell landmark = rw.getCell(5);
               System.out.println("Cusotomer Name is "+name);
               System.out.println("Customer Mobile Number is "+mobileNumber);
               System.out.println("Customer pincode is "+pincode);
               System.out.println("Customer address1 is "+address1);
               System.out.println("Customer address2 is "+address2);
               System.out.println("Customer landmark is "+landmark);
               System.out.println("*******************************************************************");              
            }
            System.out.println("Number of rows in the excel are "+numberOfRows);
			}
			catch(IOException obj)
			{
				obj.printStackTrace();
			}
			finally
			{
				try
				{
				xlsxWorkbook.close();
				}
				catch(IOException obj)
				{
				   obj.printStackTrace();	
				}
			}
		} // end of if
		// below is code to work with excel with version xls
		else if(extensionOfExcelFile.equalsIgnoreCase("xls"))
		{ // start of else if
			
			try
			{
			xlsWorkbook = new HSSFWorkbook(fis);
			HSSFSheet sh = xlsWorkbook.getSheet("AddressSheet");
            int numberOfRows = sh.getLastRowNum();
            for(int i=1;i<=numberOfRows;i++)
            {
               HSSFRow rw = sh.getRow(i);
               HSSFCell name = rw.getCell(0);
               HSSFCell mobileNumber = rw.getCell(1);
               HSSFCell pincode = rw.getCell(2);
               HSSFCell address1 = rw.getCell(3);
               HSSFCell address2 = rw.getCell(4);
               HSSFCell landmark = rw.getCell(5);
               System.out.println("Cusotomer Name is "+name);
               System.out.println("Customer Mobile Number is "+mobileNumber);
               System.out.println("Customer pincode is "+pincode);
               System.out.println("Customer address1 is "+address1);
               System.out.println("Customer address2 is "+address2);
               System.out.println("Customer landmark is "+landmark);
               System.out.println("*******************************************************************");
               
            }
            System.out.println("Number of rows in the excel are "+numberOfRows);
			}
			catch(IOException obj)
			{
				obj.printStackTrace();
			}
			finally
			{
				try
				{
				xlsWorkbook.close();
				}
				catch(IOException obj)
				{
				   obj.printStackTrace();	
				}
			}
		} // end of else if
		else
		{
			System.out.println("Please give the file with extension .xls or .xlsx");
		}	
	}		
}