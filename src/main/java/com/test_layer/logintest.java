package com.test_layer;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.page_layer.login;

@Test
public class logintest {

	

		public void verifyLogo() {
		System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\sachin kumar singh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver= new ChromeDriver();
		 login login = new login(driver);
		 driver.manage().window().maximize();
		 driver.get("https://opensourcedemo.orangehrmlive.com/index.php/auth/validateCredentials");
		 boolean flag=login.validateLogo();
		 Assert.assertTrue(flag);
		}

		public void verifyLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sachin kumar singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 

		 WebDriver driver= new ChromeDriver();
		 login login = new login(driver);
		 driver.manage().window().maximize();
		 driver.get("https://opensourcedemo.orangehrmlive.com/index.php/auth/validateCredentials");
		 login.login();

		 String actualURL= driver.getCurrentUrl();
		 
		 String expectedURL= "https://opensourcedemo.orangehrmlive.com/index.php/dashboard";
		 Assert.assertEquals(actualURL, expectedURL);
		}
		// @AfterMethod
		// public void tearDown() {
		// driver.close();
		}


	
