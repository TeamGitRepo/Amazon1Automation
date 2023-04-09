package com.Amazon1Automation.QA.PageObjects;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashMapExample3 
{

	@Test(dataProvider="empDesg")
	public void takeData(String userName, String password)
	{
		System.out.println("UserName = "+userName);
		System.out.println("Password = "+password);
	}
	
	@DataProvider(name="empDesg")
	public HashMap<String, String> provideData()
	{
	
		   HashMap<String, String> employeeNameDesignation = new HashMap();
		   employeeNameDesignation.put("Prasanna", "QA Engineer");
		   employeeNameDesignation.put("Bindu", "Senior QA Engineer");
		   employeeNameDesignation.put("Veer", "QA Engineer");
		   employeeNameDesignation.put("Krishna", "Scrum Master");
		   employeeNameDesignation.put("prathap", null);
		   employeeNameDesignation.put(null, "QA Engineer");
		   employeeNameDesignation.put("Bindu", "Trainee");
		   employeeNameDesignation.put("Bindu", "Senior QA Engineer");
           return employeeNameDesignation;
	}

}
