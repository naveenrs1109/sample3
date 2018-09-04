package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
	@BeforeMethod
	public void beforelaunch()
	{
	System.out.println("before test");	
	}
	@Test
	public void launchfirefox()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v.ramiya.surendran\\Downloads\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
				
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after execution");
	}

}
