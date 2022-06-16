package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {
	public static WebDriver oBrowser=null;
	public static String filename = null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		logout();
		loginasuser1();
		logout();
		loginasuser2();
		logout();
		loginasuser3();
		logout();
		login();
		modifyPassword();
		logout();
		user1login();
		logout();
		user2login();
		logout();
		user3login();
		logout();
		login();
		deleteUser();
		logout();
		closeApplication();
		
	}
	public static void launchBrowser() 
	{
		try {
			filename="G:\\Selenium\\Web-Automation\\Library\\Objectmap\\objectMap.properties";
			System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userheaderlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("adduserlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userfirstnamelink")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userlastnamelink")).sendKeys("1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("useremaillink")).sendKeys("b@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("Usernamelink")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusercommitlink")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("adduserlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userfirstnamelink")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userlastnamelink")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("useremaillink")).sendKeys("a@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("Usernamelink")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("234");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("234");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusercommitlink")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("adduserlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userfirstnamelink")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userlastnamelink")).sendKeys("3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("useremaillink")).sendKeys("c@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("Usernamelink")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("456");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("456");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusercommitlink")).click();
			Thread.sleep(2000);
	
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("loginavatar")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("234");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("loginavatar")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser3()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("loginavatar")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPassword()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userheaderlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user1click")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("987");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("987");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usersavechanges")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user2click")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("521");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("521");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usersavechanges")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user3click")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("564");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("564");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usersavechanges")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user1login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("987");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user2login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("521");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user3login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("564");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userheaderlink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user1click")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deleteusercommit")).click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("user2click")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deleteusercommit")).click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert1.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("user3click")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deleteusercommit")).click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert1.accept();
			Thread.sleep(2000);
			}catch(Exception e)
			{
			e.printStackTrace();
			}
		}

	}
