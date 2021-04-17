package com.cg.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	Properties property;
	
	public TestBase() {
		
		property = new Properties();

		try {
			property.load(new FileInputStream(new File("config//config.properties")));
			String browser = property.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver = new ChromeDriver();
			}else
				if(browser.equalsIgnoreCase("firefox")) {
					
					System.setProperty("webdriver.gecko.driver", "driver//firefoxdriver.exe");
					driver = new FirefoxDriver();
				}else {
					
					throw new BrowserNotComptiableException("Browser is not copatible with application");
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotComptiableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void init() {
		
		driver.manage().deleteAllCookies();
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}

	

}
