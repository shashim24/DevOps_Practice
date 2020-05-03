package com.web.testBase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase extends Constants
{
	public WebDriver driver;
	
	public void setUp() throws MalformedURLException
	{
		
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");    
		System.setProperty("webdriver.chrome.driver", "C:\\Shashi\\DevOps\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}





