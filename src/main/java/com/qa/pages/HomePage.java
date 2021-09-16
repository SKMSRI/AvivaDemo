package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.libs.Testbase;

public class HomePage extends Testbase {

	public static void main(String[] args) {

		@FindBy(className= "About Us")
		@CacheLookup // is used to improve performance
		WebElement About Us;

		@FindBy(xpath= "//a[normalize-space()='Aviva Edge']")
		WebElement Aviva Edge;
		
		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}	
		//Actions--validations
		public String validatepagetitle(){
			return driver.pagetitle();
		}
		
		public boolean ValidateAvivalogo(){
			return Aviva Edge.isDisplayed();
		}
		}
}


