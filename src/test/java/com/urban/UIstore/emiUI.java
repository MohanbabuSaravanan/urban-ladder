package com.urban.UIstore;

import org.openqa.selenium.By;

public class emiUI {
	public static By study=By.cssSelector("li[class='topnav_item studyunit']");
	public static By chair=By.xpath("//a[@href='/study-chair?src=g_topnav_study_study-chairs_study-chairs']");
	public static By filter=By.cssSelector("div[data-group='sorting']");
	public static By range =By.cssSelector("li[data-key='price_desc']");	
	public static By title=By.cssSelector("a[class='product-title-block']");

}
