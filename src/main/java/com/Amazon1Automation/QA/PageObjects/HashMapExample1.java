package com.Amazon1Automation.QA.PageObjects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample1 
{

	public static void main(String[] args)
	{
	
		HashMap h = new HashMap();
		h.put("abc@gmail.com", "fdsfs^^54");
		h.put("ravi@gmail.com", "ssddf");
		h.put("ram@gmail.com", "aasaas");
		h.put("kiran@gmail.com", "eress%");
		h.put("sujatha@gmail.com", "ffssaasa");
		h.put(null, "naveen");
		System.out.println(h.get(null));
	/*	Set allKeys  = h.keySet();
		Iterator it = allKeys.iterator();
		System.out.println("**************************");
		while(it.hasNext()) 
		{
		  System.out.println(it.next());
		}
		Collection c = h.values();
		Iterator it1 = c.iterator();
		System.out.println("**************************");
		while(it1.hasNext()) 
		{
		  System.out.println(it1.next());
		}
		Set st2 = h.entrySet();
		Iterator it2 = st2.iterator();
		System.out.println("**************************");
		while(it2.hasNext())
		{
		   System.out.println(it2.next());
		   
		}*/

	}

}