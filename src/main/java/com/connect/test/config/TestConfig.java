package com.connect.test.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.datahandlers.GetDataFromProperties;



public class TestConfig {

	public static WebDriver getDriverInstance() {
		
		WebDriver driver=null;
		
		String browser=  GetDataFromProperties.getDataFromProperties("C:\\MyPersonalWork\\SeleniumWorkSpace\\TheWolverine\\test-config\\config.properties","browser");
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./browser-server/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./browser-server/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./browser-server/MicrosoftWebDriver.exe");
			driver= new EdgeDriver();
		}
		else
			System.out.println("Enter a valid browser option in the configuration/properties file");
		
		return driver;
	}
	
	
	public static String applicationURL() {
		String url=GetDataFromProperties.getDataFromProperties("C:\\MyPersonalWork\\SeleniumWorkSpace\\TheWolverine\\test-config\\config.properties","ApplicationURL");
		return url;
	}
	
	
	public static String getAPIEndPoint() {
	return	GetDataFromProperties.getDataFromProperties("./test-config/config.properties", "APIEndPoint");
	}

	
}
	

