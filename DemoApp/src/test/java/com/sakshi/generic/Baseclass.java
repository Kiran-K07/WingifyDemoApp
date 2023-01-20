package com.sakshi.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	public WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	@AfterClass
	public void closebrowse() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		driver.get("https://sakshingp.github.io/assignment/login.html");
	   
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		
	}
}