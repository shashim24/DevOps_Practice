package com.web.UIpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientRegistration {
	WebDriver driver;	
	
	WebElement fullname;
	
	WebElement gender;
	
	WebElement register_button;
	
	public PatientRegistration(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void RegisterPatient(String name)
	{
		//Click on Patient Registration
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[6]/a")).click();
		
		//Enter full name
		fullname = driver.findElement(By.xpath("//*[@id=\"signupform\"]/input[1]"));
		fullname.sendKeys(name);
		
		//Select gender
		gender = driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/label[1]/input"));
		gender.click();
		
		//Click on Register button
		register_button = driver.findElement(By.xpath("//*[@id=\"signupform\"]/input[3]"));
		register_button.click();
		
	}
}
