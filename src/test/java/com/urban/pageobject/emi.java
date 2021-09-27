package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.emiUI;

public class emi {
public static void emidetails(WebDriver driver) {
	Methods.drag(emiUI.study, driver);
	Methods.table(emiUI.chair, driver);
	Methods.drag(emiUI.filter, driver);
	Methods.table(emiUI.range, driver);
	Methods.productDetails(emiUI.title, driver);
}
}
