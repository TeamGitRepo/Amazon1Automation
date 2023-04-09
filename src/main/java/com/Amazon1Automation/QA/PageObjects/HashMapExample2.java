package com.Amazon1Automation.QA.PageObjects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HashMapExample2 
{

	public static void main(String[] args)
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
	   
	   if(employeeNameDesignation.isEmpty())
	   {
		   System.out.println("isEmpty returns true if the HashMap is empty");
	   }
	   else
	   {
		   System.out.println("isEmpty returns false if the HashMap is carrying any entries or key-value pair");
	   }
	   
	   System.out.println("containsKey="+employeeNameDesignation.containsKey("Bindu"));
	   System.out.println("containsValue="+employeeNameDesignation.containsValue("Trainee"));
	   
	 
	  Set<String> allMyKeys = employeeNameDesignation.keySet();
      Iterator<String> it = allMyKeys.iterator();
      System.out.println("***********Key Set***********************");
      while(it.hasNext())
      {
    	System.out.println("Key is "+it.next());  
      }
      System.out.println("**********************************");
	   
	  System.out.println("***********Value Set*************************");
	  
	  Collection <String>allMyValues = employeeNameDesignation.values();
	  
	  Iterator<String> it1 = allMyValues.iterator();
	  while(it1.hasNext())
	  {
		System.out.println("Value is "+it1.next());
	  }
	  System.out.println("**********************************");
	  
	  System.out.println("***************Dsiplay as a EntrySet******************");
	 
	  Set allMyEntries = employeeNameDesignation.entrySet();
	  
	  Iterator it2 = allMyEntries.iterator();
	  while(it2.hasNext())
	  {
		Entry myEntry = (Entry) it2.next();
        System.out.println(myEntry.getKey());
        System.out.println(myEntry.getValue());
        System.out.println("*********************************************");
	  }	   
	  
	}

}