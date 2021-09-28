package com.urban.Runner;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.urban.ReuseableComponents.Reuseablecomponents;
import com.urban.Utilities.DataDriven;
import com.urban.Utilities.PropertyFileReader;
import com.urban.pageobject.Compare;
import com.urban.pageobject.Urban;
import com.urban.pageobject.aboutus;
import com.urban.pageobject.emi;
import com.urban.pageobject.links;
import com.urban.pageobject.price;
import com.urban.pageobject.search;
import com.urban.pageobject.sofa;
import com.urban.pageobject.sort;
import com.urban.pageobject.store;


public class testRunner {
public static WebDriver driver;
public static Logger log=LogManager.getLogger(Reuseablecomponents.class.getName());
@BeforeMethod
public static void openbrowser() throws IOException {
	driver =Reuseablecomponents.initializer();
	driver.get(PropertyFileReader.loadfile().getProperty("url"));
	Urban u=new Urban();
	u.Close(driver);
}
	@Test(priority=0,dataProvider="getdata1")
	public static void test(String key) throws IOException, InterruptedException {//String username,String password
	Urban u=new Urban();
	try {
		
	u.email(driver,key);
	u.password(driver,key);
	u.signup(driver);
	Reuseablecomponents.getScreenshot("picture");
	log.info("please Enter valid Details");
	}
		catch(Exception e) {
			System.out.println("Screenshot has Taken");
		
		}
	}
	@DataProvider
	public Object[][] getdata1()
	{
		Object[][] data=null;
		try
		{
			data=DataDriven.getexceldata();
		}
		catch(Exception e)
		{
			System.out.println("cannot reach excel");
		}
		return data;
	}
	//u.Close(driver);
	@Test(priority=1,dataProvider="getdata")
	public static void testsearch(String key) throws InterruptedException {
	search S=new search();
	S.Searchbutton(driver,key);
	log.info("Searching sucessfully passed");
	}
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		Object[][] data=new Object[1][1];
		data[0][0]=PropertyFileReader.loadfile().getProperty("c");;
		return data;
	}
	@Test(priority=2,dataProvider="getdata")
	public static void testcampare(String key) throws InterruptedException {
	Compare c=new Compare();
	c.comparebutton(driver,key);
	log.info("Comparing products sucessful");
	}
	@Test(priority=3)
	public static void teststore() {
		store s=new store();
		s.storetab(driver);
		log.info(" locations has printed sucessfully");
	}
	@Test(priority=4,dataProvider="getdata2")
	public static void testprice(String key) throws InterruptedException {
		price p=new price();
		p.priceamount(driver,key);
		log.info("Product price printed sucessfully");
	}
	@DataProvider
	public Object[][] getdata2() throws IOException
	{
		Object[][] data=new Object[1][1];
		data[0][0]=PropertyFileReader.loadfile().getProperty("b");;
		return data;
	}
	@Test(priority=5,dataProvider="getdata3")
	public static void testsofa(String key) throws InterruptedException {
		sofa s=new sofa();
		s.storetab(driver,key);
		log.info("Selected Material successfully");
	}
	@DataProvider
	public Object[][] getdata3() throws IOException
	{
		Object[][] data=new Object[1][1];
		data[0][0]=PropertyFileReader.loadfile().getProperty("s");;
		return data;
	}
	@Test(priority=6,dataProvider="getdata4")
	public static void sortresult(String key) throws InterruptedException {
	sort r=new sort();
	r.mirror(driver,key);
	log.info("InStock Products printed sucessfully");
	}
	@DataProvider
	public Object[][] getdata4() throws IOException
	{
		Object[][] data=new Object[1][1];
		data[0][0]=PropertyFileReader.loadfile().getProperty("w");;
		return data;
	}
	
	
	@Test(priority=7)
	public static void testlinks() {
		links l=new links();
		l.linksandproduct(driver);
		log.info("Number of links and products counted sucessfully");
	}
	@Test(priority=8)
	public static void testemi() {
		emi e=new emi();
		e.emidetails(driver);
		log.info("EMI details printed sucessfully");
	}
	@Test(priority=9)
	public static void testDeals() throws InterruptedException {
		aboutus d=new aboutus();
		d.week(driver);
		log.info("Website links printed Sucessfully");
	}
	@AfterMethod
	public static void closebrowser() {
		driver.quit();
		driver=null;
	}
}
