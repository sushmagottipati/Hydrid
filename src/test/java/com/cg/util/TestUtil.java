package com.cg.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import com.cg.base.TestBase;

public class TestUtil extends TestBase{

	public static void takeScreenShot()
	{
		TakesScreenshot ss=(TakesScreenshot) driver;	
		File f=ss.getScreenshotAs(OutputType.FILE);
		try {
			Date date=new Date();
			System.out.println(date.getDate());
			FileUtils.copyFile(f, new File("target//ss"+date.getDate()+date.getHours()+date.getMinutes()+date.getSeconds()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void  screenShot(String testmethod) throws IOException {

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date=new Date();
		System.out.println(date.getDate());

		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\target\\"+testmethod+"_"+date.getDate()+"-"+date.getHours()+date.getMinutes()+date.getSeconds()+".png"));


	}



}


