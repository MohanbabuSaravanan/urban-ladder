package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.sortUI;

public class sort {
       public void mirror(WebDriver driver,String key) throws InterruptedException {
	   Methods.sorting(sortUI.search, driver,key);
	   Methods.drag(sortUI.sort, driver);
	   Methods.table(sortUI.newarraival, driver);
       Methods.instock(sortUI.stock, driver);
       Methods.gettotal(sortUI.total, driver);
       
       }
    }
	 