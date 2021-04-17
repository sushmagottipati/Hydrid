package com.cg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class LoginPage extends TestBase{
	
	//@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	//@FindBy(xpath = "//button[@type='submit'])[2]")
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]/span[1]")
	public WebElement submit;
	
	public LoginPage() {
		
		init();
		PageFactory.initElements(driver, this);
	}
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	public void enterUn(String un) {
		
		username.sendKeys(un);
	}
	public void enterpwd(String pwd) {
		
		password.sendKeys(pwd);
	}
	public void clickSubmit() {
		
		submit.click();
	}


}
