package package2;

import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class WorkingWithKeyBoard extends BaseClass
{
  
	@Test
	public void workingWithKeyboard() throws InterruptedException
	{	
		driver.get("https://www.amazon.in/");
		Actions obj = new Actions(driver);
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys("m").build().perform();
		obj.keyDown(Keys.SHIFT).build().perform();
		obj.sendKeys("o").build().perform();
		obj.sendKeys("b").build().perform();
		obj.keyUp(Keys.SHIFT).build().perform();
		obj.sendKeys("ile").build().perform();
		obj.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		obj.sendKeys(Keys.TAB).build().perform();		
		obj.keyDown(Keys.CONTROL).build().perform();
		obj.sendKeys("x").build().perform();
		obj.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		obj.keyDown(Keys.CONTROL).build().perform();
		obj.sendKeys("v").build().perform();
		obj.keyUp(Keys.CONTROL).build().perform();
		
	}
	
	
}