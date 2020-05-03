package com.automation.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.web.UIpages.HomeScreen;
import com.web.testBase.TestBase;

public class Test001_VerifyLogin extends TestBase
{
	HomeScreen home;
	
	@BeforeClass
	public void setup() throws Exception
	{
		setUp();	
	}
	
	@Test
	public void VerifyLogin()
	{
		home = new HomeScreen(driver);
		home.LogintoApp(username,password);
	}
	@AfterClass
	public void endTest()
	{
		driver.quit();
	}

}
