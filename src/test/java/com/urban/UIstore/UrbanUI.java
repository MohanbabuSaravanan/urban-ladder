package com.urban.UIstore;

import org.openqa.selenium.By;

public class UrbanUI {

	public static By close=By.cssSelector("a[data-gaaction='popup.auth.close']");
	public static By email=By.id("spree_user_email");
	public static By password=By.cssSelector("input[type='password']");
	public static By signup=By.cssSelector("input[type='submit']");
	public static By login=By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > svg");
}
