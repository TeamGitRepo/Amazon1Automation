package package1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;
import com.Amazon1Automation.QA.Util.CaptureScreenShot;


@Listeners(ListenersDemo.class)
public class ValidateAmazonHomePage extends BaseClass
{
 
	
	@Test(priority=1)
	public void validateTitle()
	{
		driver.get("https://www.amazon.in/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		//String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, and More - Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle, "Here Actual Result Did not match Expected result");
		
	}
	
	@Test(priority=2)
	public void validateMobilesLink() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Mobiles' and @data-csa-c-slot-id='nav_cs_3']")).click();
        Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle, "Here Actual Result Did not match Expected result");
		
	}
		
}