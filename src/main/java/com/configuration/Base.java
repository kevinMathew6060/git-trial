package com.configuration;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.utilities.Utilities;

public class Base {

	public static WebDriver driver;
	public static ChromeOptions chromeoptions;
	public static FirefoxOptions firefoxoptions;
	public static EdgeOptions edgeoptions;
	

	public static void intializationDriver() throws IOException {

		// String browser = System.getProperty("browsername", "chrome");
		String browser = System.getProperty("browsername", Utilities.getPropertiesFileValue("browser"));

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}
		
		else if (browser.equalsIgnoreCase("headlesschrome")) {
			
			chromeoptions =new ChromeOptions();
			chromeoptions.addArguments("--headless");
			driver = new ChromeDriver(chromeoptions);
			
			
		} else if (browser.equalsIgnoreCase("headlessfirefox")) {
			firefoxoptions =new FirefoxOptions();
			firefoxoptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxoptions);

		} else if (browser.equalsIgnoreCase("headlessedge")) {
			edgeoptions =new EdgeOptions();
			edgeoptions.addArguments("--headless");
			driver = new EdgeDriver(edgeoptions);

		}
		
		else {
			System.out.println("Invalid Option");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// driver.get("https://www.saucedemo.com/");
		driver.get(Utilities.getPropertiesFileValue("url"));

		
		driver.manage().window().maximize();
	}
}