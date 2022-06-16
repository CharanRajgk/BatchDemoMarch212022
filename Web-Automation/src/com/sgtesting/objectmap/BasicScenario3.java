package com.sgtesting.objectmap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario3 {
	public static WebDriver browser=null;
	public static String filename = null;
	public static ObjectMap objectmap=null;

	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
	public static void launchBrowser() 
	{
		try {
			filename="G:\\Selenium\\Web-Automation\\Library\\Objectmap\\objectMap.properties";
			System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			browser=new ChromeDriver();
			objectmap=new ObjectMap(filename);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	private static void navigate()
	{
		try
		{
			browser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	private static void login()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			browser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
		browser.findElement(objectmap.getLocator("taskheaderlink")).click();
		Thread.sleep(2000);
		browser.findElement(objectmap.getLocator("addnewclick")).click();
		Thread.sleep(2000);
		browser.findElement(objectmap.getLocator("newcustomerclick")).click();
		Thread.sleep(2000);
		browser.findElement(objectmap.getLocator("customernamefield")).sendKeys("customer2");
		browser.findElement(objectmap.getLocator("customerdescriptionfield")).sendKeys("Welcome to Project");
		browser.findElement(objectmap.getLocator("createcustomerclick")).click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			browser.findElement(objectmap.getLocator("customereditclick")).click();
			Thread.sleep(2000);
			browser.findElement(objectmap.getLocator("customeractionbuttonclick")).click();
			Thread.sleep(2000);
			browser.findElement(objectmap.getLocator("customerdelete")).click();
			Thread.sleep(2000);
			browser.findElement(objectmap.getLocator("customerconfirmdeleteclick")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			browser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			browser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
