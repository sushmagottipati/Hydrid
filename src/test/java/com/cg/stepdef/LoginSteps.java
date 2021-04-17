package com.cg.stepdef;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.cg.pages.LoginPage;
import com.cg.util.TestUtil;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	LoginPage login;
	Logger log = Logger.getLogger(LoginSteps.class);
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		
		login = new LoginPage();
		log.info("url is opened");
	    
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		
		login.enterUn(string);		
		log.info("username entered");
		login.enterpwd(string2);
		log.info("password entered");

	    
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() throws IOException {
		
		login.clickSubmit();
		TestUtil.screenShot("login");
		log.info("user clicked on submit button");
	    
	}
	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		
		System.out.println(login.getTitle());
		log.info("test pass");
	    
	}
	@Then("user is in samepage unsuccessfull login")
	public void user_is_in_samepage_unsuccessfull_login() {
		
		System.out.println(login.getTitle());
		log.info("test pass");


		
	}
}
