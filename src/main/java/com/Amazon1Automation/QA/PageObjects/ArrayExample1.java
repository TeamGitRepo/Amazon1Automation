package com.Amazon1Automation.QA.PageObjects;

public class ArrayExample1 
{

	public static void main(String[] args)
	{
	
		ArrayExample1 obj1 = new ArrayExample1();
		ArrayExample1 obj2 = new ArrayExample1();
		ArrayExample1 obj3 = new ArrayExample1();
		
		//int a = 10,20,30,40,50;
		int a = 40;
		int b = 20;
		int c = 30;
		int d = 50;
		int e = 10;
		
		String[] employeeNames = new String[6];
	//	employeeNames[0] = obj1;
	//	employeeNames[1] = obj2;
		employeeNames[2] = "Prasanna";
		employeeNames[3] = "Krishna";		
		
		int f[] = new int[7]; // Here total 5 memory locations are created
        f[0] = 40;
        f[1] = 30;
        f[2] = 20;
        f[3] = 50;
        f[4] = 10;
        
        int g[] = new int[3];
        g[0] = 98;
        g[1] = 87;
        g[2] = 67;
         
        for(int i=0;i<f.length;i=i+1)
        {
        	  System.out.println("Print value in f = "+f[i]); 	
        }
        
	}

}