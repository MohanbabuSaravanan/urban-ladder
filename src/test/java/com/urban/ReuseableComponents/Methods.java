package com.urban.ReuseableComponents;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.urban.Utilities.PropertyFileReader;



public class Methods {
	public static void loadURL(WebDriver driver) throws IOException {
		driver.get(PropertyFileReader.loadfile().getProperty("url"));
		timelapse(driver);
	}
	
	public static void timelapse(WebDriver driver) throws NumberFormatException, IOException {
		int wait = Integer.parseInt(PropertyFileReader.loadfile().getProperty("implicitWait"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	public static void Getemail(By selector,WebDriver driver,String keys) throws InterruptedException {
		driver.findElement(selector).click();
		driver.findElement(selector).sendKeys(keys);
	Thread.sleep(1000L);	
	}
	public static void Getpassword(By selector,WebDriver driver,String keys) throws InterruptedException {
		driver.findElement(selector).click();
		driver.findElement(selector).sendKeys(keys);
		Thread.sleep(1000L);		
	}
	public static void clicksignin(By selector,WebDriver driver) {
		driver.findElement(selector).click();
		
	}
	public static void clickclose(By selector,WebDriver driver) {
		driver.findElement(selector).click();
	}
	public static void clickLogin(By selector,WebDriver driver) {
		driver.findElement(selector).click();
	}
	public static boolean drag(By selector,WebDriver driver) {
		Actions a=new Actions(driver);
		try {
			a.moveToElement(driver.findElement(selector)).build().perform();
			Thread.sleep(1000L);
			return true;
		}
		catch(Exception e) {
			System.out.println(String.format("Element %s Doesn't Exit", selector));
			return false;
		}
		
	}
	public static boolean table(By selector,WebDriver driver) {
		Actions a=new Actions(driver);
		try {
			a.moveToElement(driver.findElement(selector)).click().build().perform();
			return true;
		}
		catch(Exception e) {
			System.out.println(String.format("Element %s Doesn't Exit", selector));
			return false;
		}
		
	}
	public static void product(By selector,WebDriver driver) {
		driver.findElement(selector).click();
	}
	public static void Add(By selector,WebDriver driver) {
		driver.findElement(selector).click();
	}
	public static void searchclick(By selector1,By selector2,WebDriver driver,String key) throws InterruptedException {
		driver.findElement(selector1).click();
		driver.findElement(selector1).sendKeys(key);
		Thread.sleep(1000L);
		driver.findElement(selector1).sendKeys(Keys.ENTER);
		Thread.sleep(1000L);
		driver.findElement(selector2).click();
		Thread.sleep(1000L);
	}
	public static void tabCart(WebDriver driver) {
		 try {
			 Set<String> s=driver.getWindowHandles();
			 Iterator<String> i=s.iterator(); 
			 String parent=i.next();
			 String child=i.next();
			 driver.switchTo().window(child);
		 }
		 catch(Exception e) {
			 System.out.println("Cannot switch tabs");
		 }
	 }
	
	public static void Addingcard(By selector,WebDriver driver) throws InterruptedException {
		Thread.sleep(1000L);
        driver.findElement(selector).click();
	}
	public static void compare(By selector1,By selector2,WebDriver driver) {
		Actions a=new Actions(driver);
		try {
			a.moveToElement(driver.findElement(selector1)).build().perform();
			a.moveToElement(driver.findElement(selector2)).click().build().perform();
			
		}
		catch(Exception e) {
			System.out.println(String.format("Element %s Doesn't Exit", selector1));
			
		}
		
	}
	public static void clickcompare(By selector,WebDriver driver) {
		driver.findElement(selector).click();
	}

	public static void search(By selector,WebDriver driver,String key) throws InterruptedException {
		driver.findElement(selector).click();
		driver.findElement(selector).sendKeys(key);
		Thread.sleep(1000L);
		driver.findElement(selector).sendKeys(Keys.ENTER);
		Thread.sleep(1000L);
	}
	public static void stores(By selector1,By selector2,WebDriver driver) {
		driver.findElement(selector1).click();
		List<WebElement> list=driver.findElements(selector2);
		 for(int i=0;i<driver.findElements(selector2).size();i++) {
	        System.out.println("Total stores available in cities: " +list.get(i).getText());
		 }
	}
	public static void prices(By selector1,By selector2,WebDriver driver,String key) throws InterruptedException {
		driver.findElement(selector1).click();
		driver.findElement(selector1).sendKeys(key);
		Thread.sleep(1000L);
		driver.findElement(selector1).sendKeys(Keys.ENTER);
		Thread.sleep(1000L);
		driver.findElement(selector2).click();
	}
	public static void getprice(By selector,WebDriver driver) {
		System.out.println("Price of the product: " +driver.findElement(selector).getText());
	}
	public static void soafclick(By selector,WebDriver driver,String key) throws InterruptedException {
		driver.findElement(selector).click();
		driver.findElement(selector).sendKeys(key);
		Thread.sleep(1000L);
		driver.findElement(selector).sendKeys(Keys.ENTER);
		Thread.sleep(1000L);
	}
	public static void selectmaterial(By selector,WebDriver driver) {
		 String button=driver.findElement(selector).getText();
		 Assert.assertEquals(button,"Leather");
		 System.out.println("leathers are verified");
	 }
	public static void sorting(By selector,WebDriver driver,String key) throws InterruptedException {
		driver.findElement(selector).click();
		driver.findElement(selector).sendKeys(key);
		Thread.sleep(1000L);
		driver.findElement(selector).sendKeys(Keys.ENTER);
        Thread.sleep(1000L);
	}
	
	
	public static void instock(By selector,WebDriver driver) throws InterruptedException {
		driver.findElement(selector).click();
	}
	public static void gettotal(By selector,WebDriver driver) {
		System.out.println("number of the product: " +driver.findElements(selector).size());
	}
	public static void getlinks(By selector1,By selector2,By selector3,By selector4,WebDriver driver) {
		 String verify=driver.findElement(selector1).getText();
	        Assert.assertEquals(verify,"All New Arrivals");
	        System.out.println("Verify the landing page title: "+driver.findElement(selector1).getText());
	        System.out.println("No Of Links Present in this page: "+driver.findElements(selector2).size());
	        System.out.println("No Of image Present in this page: "+driver.findElements(selector3).size());
	System.out.println("No Of image Present in this page: "+driver.findElement(selector4).getText());
    }
	public static void productDetails(By selector,WebDriver driver) {
		 try {
			 List<WebElement> list=driver.findElements(selector);
			 
			      System.out.println("Product Details : "+list.get(0).getText());
			  
		 }
		 catch(Exception e) {
			 System.out.println(String.format("Element %s doesnt exist", selector));
       }
	}
	public static void otherWebsites(By selector,WebDriver driver) {
		 List<WebElement> list=driver.findElements(selector);
		 for(int i=0;i<list.size();i++) {
		      System.out.println("Other Websites presents in About Us page: "+list.get(i).getText());
		     }
	 }
}


