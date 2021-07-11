package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.org.base.baseTest;

public class DmartRegisterPage extends baseTest{
	WebDriver driver;
private WebElement rgstrbtn;
private WebElement mobnumfield;
private WebElement passfield;
private WebElement firstNamefield;
private WebElement lastNamefield;
private WebElement checkBoxfield;
// = driver.findElement(By.xpath("//button[@title='Register']"))
//= driver.findElement(By.xpath("//div[contains(@class,'adornedStart')]"))


public WebElement getRgstrbtn() {
	rgstrbtn = driver.findElement(By.xpath("//button[@title='Register']"));
	return rgstrbtn;
}
public WebElement getMobnumfield() {
	mobnumfield = driver.findElement(By.xpath("//div[contains(@class,'adornedStart')]"));
	return mobnumfield;
}
public WebElement getPassfield() {
	passfield = driver.findElement(By.xpath("//input[@type='password']"));
	return passfield;
}
public WebElement getFirstNamefield() {
	firstNamefield = driver.findElement(By.xpath("//input[@name='firstName']"));
	return firstNamefield;
}
public WebElement getLastNamefield() {
	lastNamefield = driver.findElement(By.xpath("//input[@name='lastName']"));
	return lastNamefield;
}
public WebElement getCheckBoxfield() {
	checkBoxfield = driver.findElement(By.xpath("//input[@type='checkbox']"));
	return checkBoxfield;
}
}
