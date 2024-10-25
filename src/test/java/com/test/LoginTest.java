package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	
	@Test(priority = 0)
	public void verifyLoginTest() {
		
		Assert.assertEquals(login.verifyLoginButton(), true);
		
	}
	
	@Test(priority = 1)
	public void verifyError() {
		
		
		login.clickLoginButton();
		Assert.assertEquals(login.verifyErrorMessage(),"Epic sadface: Username is required");	
		
	}

}
