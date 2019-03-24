package com.prime.suite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
		WebDriver driver;
		public LoginPage(WebDriver driver){// constructor should be public
			this.driver=driver;
			PageFactory.initElements(driver, this);		
		}
		
		
	@FindBy(id="float-input-username")
	WebElement loginTextField;

	@FindBy(id="float-input-password")
	WebElement passwordTextField;

	@FindBy(xpath="//*[text()='Sign In']")
	WebElement signInButton;



	public void userSignIn(String userName, String password) {
		loginTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);
		signInButton.click();	
	}

	}


