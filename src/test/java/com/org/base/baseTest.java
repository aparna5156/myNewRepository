package com.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class baseTest {
	public static WebDriver driver;
	@Test
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		
	}

}
