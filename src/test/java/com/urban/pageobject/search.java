package com.urban.pageobject;

import org.openqa.selenium.WebDriver;

import com.urban.ReuseableComponents.Methods;
import com.urban.UIstore.SearchUI;



public class search {
		public void Searchbutton(WebDriver driver,String key) throws InterruptedException {
			Methods.searchclick(SearchUI.search,SearchUI.product, driver,key);
			Methods.tabCart(driver);
			Methods.Addingcard(SearchUI.addcart, driver);
			
		}
		

}
