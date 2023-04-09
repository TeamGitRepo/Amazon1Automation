package com.Amazon1Automation.QA.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class provideDataForSearch
{
	
	@DataProvider(name="productList")
	public Object[] listOfProductsToSearch()
	{
		Object[] products = new Object[5];
		products[0] = "Pen";
		products[1] = "Papper";
		products[2] = "ink pen";
		products[3] = "toys";
		products[4] = "selenium books";
		return products;	
	}
	
}
