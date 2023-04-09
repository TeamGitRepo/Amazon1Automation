package package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Package1Class2
{
	
	 @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("***I am from beforeMethod and Class Package1Class1***");
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("***I am from afterMethod and Class Package1Class1***");
		  
	  }

  @Test
  public void Method1Package1Class2() 
  {
	  System.out.println("***I am from Method1Package1Class2***");
  }
  
  @Test
  public void Method2Package1Class2() 
  {
	  System.out.println("***I am from Method2Package1Class2***");
  }
  
  @Test
  public void Method3Package1Class2() 
  {
	  System.out.println("***I am from Method3Package1Class2***");
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("***I am from beforeClass and Class Package1Class2***");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("***I am from afterClass and Class Package1Class2***");
  }

  
}