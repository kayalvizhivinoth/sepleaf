package org.testleaf.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
}


	//public HomePage locateElement(String id, String decorativeSubmit) {
		//driver.findElementByClassName(decorativeSubmit);
		//return new HomePage();
		


	
	
	//public WebElement locateElement(String id, String decorativeSubmit) {
	
	
	











