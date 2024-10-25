package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilities;

public class LoginPage {

	WebDriver driver;

	By loginButton = By.id("login-button");

	By errorMessage = By.xpath("//h3[text()='Epic sadface: Username is required']");

	By userName = By.id("user-name");

	By password = By.id("password");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public boolean verifyLoginButton() {

		//  driver.findElement(loginButton).isDisplayed();
		
		
		return Utilities.isElementDisplyed(driver,loginButton);

	}

	public String verifyErrorMessage() {

		//  driver.findElement(errorMessage).getText();
		return Utilities.getTextValue(driver, errorMessage);

	}

	public void clickLoginButton() {

		// driver.findElement(loginButton).click();
		
		Utilities.clickElement(driver, loginButton);
	}

	public void enterUserName() throws FileNotFoundException, IOException, ParseException {

		// driver.findElement(userName).sendKeys(user);
		
		Utilities.enterTextValue(driver, userName, Utilities.readJsonFile("username", "./src/main/resources/login.json"));
	}

	public void enterPassword() throws FileNotFoundException, IOException, ParseException {

		// driver.findElement(password).sendKeys(pass);
		Utilities.enterTextValue(driver, password, Utilities.readJsonFile("password", "./src/main/resources/login.json"));
	}
}
