package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.UrbanUI;

public class Urban {

	public void email(WebDriver driver,String email) throws InterruptedException {
		Methods.Getemail(UrbanUI.email, driver, email);
	}
	public void password(WebDriver driver,String password) throws InterruptedException {
		Methods.Getpassword(UrbanUI.password, driver, password);
	}
	public void signup(WebDriver driver) {
		Methods.clicksignin(UrbanUI.signup, driver);
	}

	public void Close(WebDriver driver) {
		Methods.clickclose(UrbanUI.close, driver);
	}

}
