package com.Amazon1Automation.QA.PageObjects;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 
{

	public static void main(String[] args)
	{
	
		List listOfEmployees = new LinkedList();
		listOfEmployees.add(0, "Zamer");
		listOfEmployees.add(1, "Yamer");
		listOfEmployees.add(2, 20);
		listOfEmployees.add(3, "wamsi");
		listOfEmployees.add(4, "wamsi");
		listOfEmployees.add(5, "vamsi");
		//System.out.println(listOfEmployees.get(2));
	    System.out.println("****Before Add****");
		System.out.println(listOfEmployees);
		System.out.println("****After Add****");
		listOfEmployees.add(2, 30);
		System.out.println(listOfEmployees);
		listOfEmployees.add(5, null);
		System.out.println("****After adding null****");
		System.out.println(listOfEmployees);
		

	}

}