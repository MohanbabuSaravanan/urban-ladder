package com.urban.UIstore;

import org.openqa.selenium.By;

public class linksUI {
	public static By collections=By.cssSelector("li[class='topnav_item collectionsunit']");
	public static By clicknew=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[10]/div/div/ul/li[1]/ul/li[6]/a");
	public static By title=By.cssSelector(".withsubtext");
	public static By links=By.tagName("a");
	public static By image=By.tagName("img");
	public static By products=By.cssSelector("div[class='results-count']");
	

}