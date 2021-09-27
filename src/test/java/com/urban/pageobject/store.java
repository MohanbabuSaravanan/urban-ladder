package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.storeUI;

public class store {
	public static void storetab(WebDriver driver) {
		Methods.stores(storeUI.store,storeUI.place,driver);
	}

}
