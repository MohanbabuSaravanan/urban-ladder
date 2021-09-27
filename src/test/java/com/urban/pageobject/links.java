package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.linksUI;

public class links {
public static void linksandproduct(WebDriver driver) {
	Methods.drag(linksUI.collections, driver);
	Methods.table(linksUI.clicknew, driver);
	Methods.getlinks(linksUI.title, linksUI.links, linksUI.image, linksUI.products, driver);
}
}
