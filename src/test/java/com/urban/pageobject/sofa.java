package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.sofaUI;

public class sofa {
	public static void storetab(WebDriver driver,String key) throws InterruptedException {
		Methods.soafclick(sofaUI.input, driver,key);
		Methods.drag(sofaUI.material, driver);
		Methods.table(sofaUI.leather, driver);
		Methods.selectmaterial(sofaUI.verify, driver);
	}
}
