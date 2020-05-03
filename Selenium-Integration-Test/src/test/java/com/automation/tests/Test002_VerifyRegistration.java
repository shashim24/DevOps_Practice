package com.automation.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.web.UIpages.PatientRegistration;
import com.web.testBase.TestBase;

public class Test002_VerifyRegistration extends TestBase{
	PatientRegistration register;
	
	@BeforeClass
	public void setup() throws Exception
	{
		setUp();	
	}
	
	@Test
	public void VerifyRegistration()
	{
		register = new PatientRegistration(driver);
		register.RegisterPatient(name);
	}
	@AfterClass
	public void endTest()
	{
		driver.quit();
	}
}
