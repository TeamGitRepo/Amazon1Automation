package com.Amazon1Automation.QA.TestData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataIntoExcelExample1 
{
	@Test
	public void writeDataIntoexcel()
	{
		XSSFWorkbook excel = new XSSFWorkbook();
		XSSFSheet wb = excel.createSheet("EmployeeInfo");
		Object employeeDetails[][] = new Object[5][3];
		int numberOfRows = employeeDetails.length;
		int numberOfColumns = employeeDetails[0].length;
		System.out.println("Number of rows = "+numberOfRows);
		System.out.println("Number of columns = "+numberOfColumns);		
	}
}