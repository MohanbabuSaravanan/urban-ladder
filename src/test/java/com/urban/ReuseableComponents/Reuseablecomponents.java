package com.urban.ReuseableComponents;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import com.urban.Utilities.PropertyFileReader;

public class Reuseablecomponents {
	public static WebDriver driver;
	public static WebDriver initializer()throws IOException {
    String browser=PropertyFileReader.loadfile().getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver",".//Drivers//msedgedriver.exe");
			driver=new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void getScreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File(".\\Screenshots\\" + name + ".png");
		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Screenshot taken");
		}
}

