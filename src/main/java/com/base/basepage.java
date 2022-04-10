package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.page_layer.login;

public class basepage {

	
			public static WebDriver driver;
			public login login;
			@BeforeMethod
			public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sachin kumar singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://opensourcedemo.orangehrmlive.com/index.php/auth/validateCredentials");
			 //loginPage=new LoginPage1();
			}
			@AfterMethod
			public void tearDown() {
			 driver.close();
			}
			

	}


