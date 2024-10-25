package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilities;

public class HomePage {

	WebDriver driver;

	By SwagLabsHeading = By.xpath("//div[text()='Swag Labs']");

	By ProductHeading = By.xpath("//span[text()='Products']");

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public String verifySwagHeading() {

		//  driver.findElement(SwagLabsHeading).getText();
		return Utilities.getTextValue(driver,SwagLabsHeading);

	}

	public String verifyProductHeading() {

		// return driver.findElement(ProductHeading).getText();
		
		return Utilities.getTextValue(driver, ProductHeading);

	}

}
