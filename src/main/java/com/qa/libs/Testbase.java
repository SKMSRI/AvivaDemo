package com.qa.libs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static WebDriver driver;
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();// lauchchrome
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://www.avivaindia.com");
	String title = driver.getTitle();// Get Title
	System.out.println(title);
	// Validation point
	if (title.equals("Life Insurance Company | Best Life Insurance Plans India - Aviva Life Insurance")) {
		System.out.println("correct Title");
	} else {
		System.out.println("Incorrect title");
	}
	System.out.println(driver.getCurrentUrl());// for print current url
	//driver.quit();// for quit bowser

}
	
}
