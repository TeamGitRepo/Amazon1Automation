package com.Amazon1Automation.QA.PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListExample2 
{

	public static void main(String[] args)
	{
		int a[] = new int[5];
		String b[] = new String[3]; 
		
		CustomerServicePageObjects  obj1 = new CustomerServicePageObjects();
		CustomerServicePageObjects  obj2 = new CustomerServicePageObjects();
		CustomerServicePageObjects  obj3 = new CustomerServicePageObjects();
		CustomerServicePageObjects  obj4 = new CustomerServicePageObjects();
		CustomerServicePageObjects  obj5 = new CustomerServicePageObjects();
		
	     List listOfEmployees = new LinkedList();
	     listOfEmployees.add(0, obj1);
	     listOfEmployees.add(1, "Krishna");
	     listOfEmployees.add(2, obj3);
	     listOfEmployees.add(3, obj4);
	     listOfEmployees.add(4, obj5);
	     
	     
	     
	     System.out.println("Value at index 1 is "+listOfEmployees.get(1));
	     
	    // listOfEmployees.add(5, "Nitya");
	     //listOfEmployees.add(6, "Anusha");
	     
	    ListIterator li = listOfEmployees.listIterator();
	     while(li.hasNext())
	     {
	    	 System.out.println("The employee in list is "+li.next());
	     }
	     System.out.println("*****************************************************");
         while(li.hasPrevious())
         {
        	 System.out.println("The employee in list is "+li.previous());
         }
         
         System.out.println("Is Pallavi still working in our project : "+listOfEmployees.contains("Pallavi"));
         System.out.println("Is Pallavi still working in our project : "+listOfEmployees.contains("Ravi"));
         
         //listOfEmployees.add(3, "Ravi");
         System.out.println("*********After Adding a new employee*********");
         ListIterator afterAddingLI = listOfEmployees.listIterator();
         while(afterAddingLI.hasNext())
	     {
	    	 System.out.println("The employee in list is "+afterAddingLI.next());
	     }
         
      //   listOfEmployees.set(7, "Anusha Rani");
         System.out.println("*********After updating Anusha to Anusha Rani***************");
         ListIterator updateExistingData = listOfEmployees.listIterator();
         while(updateExistingData.hasNext())
	     {
	    	 System.out.println("The employee in list is "+updateExistingData.next());
	     }
         System.out.println("Element in index 5 is "+listOfEmployees.get(5));
        // listOfEmployees.add(8, "Nitya");
	     listOfEmployees.add(9, null);
	     System.out.println("*********After adding/inserting duplicates*********");
	     Iterator afterAddingDuplicates = listOfEmployees.iterator();
         while(afterAddingDuplicates.hasNext())
	     {
	    	 System.out.println("The employee in list is "+afterAddingDuplicates.next());
	     }
        	
	}

}