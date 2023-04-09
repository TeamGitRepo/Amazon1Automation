package com.Amazon1Automation.QA.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProviderExample1
{
	
	@DataProvider(name="loginDetails")
	public Object[][] giveAndProvideData()
	{
		Object[][] usersInfo = new Object[6][2];
		usersInfo[0][0] = "User1";
		usersInfo[0][1] = "Password1";
		usersInfo[1][0] = "User2";
		usersInfo[1][1] = "Password2";
		usersInfo[2][0] = "User3";
		usersInfo[2][1] = "Password3";
		usersInfo[3][0] = "User4";
		usersInfo[3][1] = "Password4";
		usersInfo[4][0] = "User5";
		usersInfo[4][1] = "Password5";
		usersInfo[5][0] = "User6";
		usersInfo[5][1] = "Password6";
		return usersInfo;
	}
	
	
}