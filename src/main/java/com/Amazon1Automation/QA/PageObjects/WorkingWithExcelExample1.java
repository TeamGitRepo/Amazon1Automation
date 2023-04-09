package com.Amazon1Automation.QA.PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class WorkingWithExcelExample1 
{

	public static void main(String args[]) throws IOException
	{
		String filePath="C:\\Users\\Prathap\\OneDrive\\Desktop\\Batch\\SPG4\\SPG4Maven\\Amazon1Automation\\src\\main\\java\\com\\Amazon1Automation\\QA\\TestData\\UserData.xlsx";
		File fl = new File(filePath);
		FileInputStream fis = new FileInputStream(fl);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    int numberOfRows = sh.getLastRowNum();
	    System.out.println("Number of rows = "+numberOfRows);
	    for(int i=1;i<=numberOfRows;i++) 
	    {
	    	XSSFRow r = sh.getRow(i);
	    	XSSFCell c1 = r.getCell(0);
	    	String userName = c1.getStringCellValue();
	    	XSSFCell c2 = r.getCell(1);
	    	String password = c2.getStringCellValue();
	    	System.out.println("UserName="+userName+"||||||"+"Password="+password);
	    	System.out.println("*************************************************");
	    }
	    wb.close();
	}
		
}