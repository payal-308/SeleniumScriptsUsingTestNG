package com.orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.out.println("Opening the browser");
		System.setProperty("webdriver.chrome.driver", "E:\\CDAC_Online\\ASDM\\PRACTICAL\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	/*@BeforeClass
	public void enterURL() {
		System.out.println("Entering the URL");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
	}*/
	
	@BeforeMethod
	public void login() {
		System.out.println("Logging In");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();	
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void adminTest() 
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Admin")).click();
	}
	
	@Test
	public void leaveTest() 
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	}
	
	@Test
	public void timeTest() 
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("TIME")).click();
	}
		
	@AfterMethod
	public void logout() {
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("welcome")).click();	
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	}
	
	
	
	
	
	
}
