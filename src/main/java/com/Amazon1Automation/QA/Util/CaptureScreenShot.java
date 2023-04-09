package com.Amazon1Automation.QA.Util;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.BaseClass.BaseClass;

public class CaptureScreenShot extends BaseClass
{

	
	public static void CaptureScreenShot()
	{
		 //Convert web driver object to TakeScreenshot
		
		// creating an object of Random class   
		Random random = new Random();   
	    int x = random.nextInt(10000); // this will generate a number between 1 to 10000
	    
	    String dynamicFilePath = "C:\\Users\\Prathap\\OneDrive\\Desktop\\Batch\\SPG4\\SPG4Maven\\Amazon1Automation\\src\\main\\java\\ScreenShots\\"+"file"+x+".png";
	    
	    String imageFileName = "File"+x;
		
	    TakesScreenshot  obj1 = ((TakesScreenshot)driver);
	    File photoIsTaken = obj1.getScreenshotAs(OutputType.FILE);
	    
	    File destinationPath = new File(dynamicFilePath);
	    try {
			FileUtils.copyFile(photoIsTaken, destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	               
	}
	
}