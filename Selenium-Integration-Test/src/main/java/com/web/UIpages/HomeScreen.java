package com.web.UIpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen 
{
	WebDriver driver;	
	
	WebElement username;
	
	WebElement password;
	
	WebElement login_button;
	
	public HomeScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LogintoApp(String user,String pass)
	{
		//Click on Employee Login link
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[5]/a")).click();
		username = driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/form/input[1]"));
		username.sendKeys(user);
		password = driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/form/input[2]"));
		password.sendKeys(pass);
		login_button = driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/form/input[3]"));				
		login_button.click();
	}
}
