package com.prime.suite.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.prime.suite.pages.LoginPage;

public class login {

WebDriver driver;
LoginPage lp;

@BeforeTest
public void testDataSetup() {
	 driver = new FirefoxDriver();
	 System.setProperty("webdriver.gecko.driver", "./browser-server/geckodriver.exe");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	 driver.get("http://localhost/login.do");
	 lp = new LoginPage(driver);
}

@AfterMethod
public void postTestMethod() {
	
}

@Test	
public void enteringValidLoginCredentials() {
		lp.userSignIn("admin", "admin");
		
		
		
	}

@Test
public void enterInvalidPassword() {
	
}

}
