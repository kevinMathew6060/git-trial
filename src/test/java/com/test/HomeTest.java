package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

	
	
	@Test(priority = 0)
	public void verifyHeading() throws FileNotFoundException, IOException, ParseException {
		
		
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
		Assert.assertEquals(home.verifySwagHeading(), "Swag Labs");
		
	}
	
	@Test(priority = 1)
	public void verifyProduct() throws FileNotFoundException, IOException, ParseException {
		
		
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
		Assert.assertEquals(home.verifyProductHeading(), "Products");	
		
	}

}
