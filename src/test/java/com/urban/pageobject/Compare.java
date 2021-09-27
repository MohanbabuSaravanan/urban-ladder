package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.SearchUI;
import com.urban.UIstore.compareUI;

public class Compare {
	public void comparebutton(WebDriver driver,String key) throws InterruptedException {
				Methods.search(compareUI.search,driver,key);
				Methods.compare(compareUI.black, compareUI.compare1, driver);
				Methods.compare(compareUI.white,compareUI.compare2,driver);
				Methods.clickcompare(compareUI.compare, driver);
		
	}
}

