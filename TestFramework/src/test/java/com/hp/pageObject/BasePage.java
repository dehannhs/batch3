package com.hp.pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public BasePage() {
		
		prop=new Properties();
		try {
			FileInputStream file=new FileInputStream("config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
	
	
	
	
	
	
	
	public static WebDriver initBrowser() {
		
		String Browser=prop.getProperty("Browser");
		
		if((Browser.equalsIgnoreCase("chrome"))||(Browser.equalsIgnoreCase("ch"))) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		    driver=new ChromeDriver();
		
		
		}else if((Browser.equalsIgnoreCase("firefox"))||(Browser.equalsIgnoreCase("ff"))) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		    driver=new FirefoxDriver();
		
		
		}else if((Browser.equalsIgnoreCase("internetExplorer"))||(Browser.equalsIgnoreCase("ie"))) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
		    driver=new FirefoxDriver();
		
		
		}else {
			System.out.println("Sorry browser name doesn't exist");
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		
		return driver;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
