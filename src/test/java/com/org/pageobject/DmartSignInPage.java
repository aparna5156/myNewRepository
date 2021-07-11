package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.org.base.baseTest;

public class DmartSignInPage extends baseTest{
	private WebDriver driver;
	private WebElement signInBtn;
	private WebElement signInmobnumField;
	private WebElement signInpassField;
	private WebElement temppage;
	private WebElement paymentpage;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignInBtn() {
		signInBtn = driver.findElement(By.xpath("//button[@title='SignIn']"));
		return signInBtn;
	}
	public WebElement getSignInmobnumField() {
		signInmobnumField = driver.findElement(By.xpath("//input[@name='mobileNumber']"));
		return signInmobnumField;
	}
	public WebElement getSignInpassField() {
		signInpassField = driver.findElement(By.xpath("//input[@name='password']"));
		return signInpassField;
	}
	
	
}
