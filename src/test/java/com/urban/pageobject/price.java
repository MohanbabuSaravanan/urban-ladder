package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.priceUI;

public class price {
public static void priceamount(WebDriver driver,String key) throws InterruptedException {
	Methods.prices(priceUI.input,priceUI.search, driver,key);
	Methods.tabCart(driver);
	Methods.getprice(priceUI.price, driver);
}
}
