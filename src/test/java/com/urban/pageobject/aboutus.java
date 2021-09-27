package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.aboutusUI;

public class aboutus {
	public static void week(WebDriver driver) throws InterruptedException {
		Methods.clickclose(aboutusUI.about, driver);
		Methods.otherWebsites(aboutusUI.details, driver);
	}

}
