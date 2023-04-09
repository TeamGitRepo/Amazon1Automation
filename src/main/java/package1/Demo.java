package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersDemo.class)
public class Demo extends BaseClass
{
  
  @Test
  public void Test1()
  {
	  driver.get("https://www.amazon.in/");
	  String actualTitle = driver.getTitle();
	  System.out.println("Title is "+actualTitle);
	  String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  Assert.assertEquals(actualTitle, expectedTitle);   
  }

}
