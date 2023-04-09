package com.Amazon1Automation.QA.PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample1 
{

	public static void main(String[] args)
	{
	
		List<String> listOfEmployees = new ArrayList();
		listOfEmployees.add(0, "Zamer");
		listOfEmployees.add(1, "Yamer");
		listOfEmployees.add(2, "20");
		listOfEmployees.add(3, "wamsi");
		listOfEmployees.add(4, "wamsi");
		listOfEmployees.add(5, "vamsi");
		
		
		System.out.println("**************************");
		/*System.out.println(listOfEmployees.get(0));
		System.out.println(listOfEmployees.get(1));
		System.out.println(listOfEmployees.get(2));
		System.out.println(listOfEmployees.get(3));
		System.out.println(listOfEmployees.get(4));
		System.out.println("**************************");*/
		System.out.println("*********************Before Sort******************");
		System.out.println(listOfEmployees);
		Collections.sort(listOfEmployees);
		System.out.println("*********************After Sort******************");
		System.out.println(listOfEmployees);
        Collections.sort(listOfEmployees, Collections.reverseOrder());
        System.out.println("********************After Reverse Sort***************");
        System.out.println(listOfEmployees);
        listOfEmployees.add(3, "Ram");
        System.out.println(listOfEmployees);
        
        System.out.println("******************Iterate here****************************");
        Iterator it = listOfEmployees.iterator();
        while(it.hasNext())
        {
          System.out.println(it.next());	
        }
        System.out.println("****List Iterator Forward****");
        ListIterator lit = listOfEmployees.listIterator();
        while(lit.hasNext())
        {
           System.out.println(lit.next());	
        }
        System.out.println("****List Iterator Backward****");
        while(lit.hasPrevious())
        {
           System.out.println(lit.previous());	
        }
        listOfEmployees.add(3, null);
        System.out.println("****After adding null****");
        System.out.println(listOfEmployees);
        
        
	}

}