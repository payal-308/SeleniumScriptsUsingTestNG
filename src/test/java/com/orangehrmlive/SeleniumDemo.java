package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	WebDriver driver;
	void openBrowser() 
	{
		//open browser window
		System.setProperty("webdriver.chrome.driver", "E:\\CDAC_Online\\ASDM\\PRACTICAL\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	void enterURL() 
	{
		//passes the URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");		
	}

	void login()
	{
		//locate the Username and pass test data into it
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("submit")).click();		
	}
	public static void main(String[] args) {
		SeleniumDemo sd=new SeleniumDemo();
		sd.openBrowser();
		sd.enterURL();
		sd.login();	
	}

}
