package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.page_layer.login1;

public class basepage1 {

	
			public static WebDriver driver;
			public login1 login1;
			@BeforeMethod
			public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sachin kumar singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.get("https://www.flipkart.com");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 }
			 @AfterMethod
			 public void tearDown() {
			 driver.close();
			 }
			 }
			

	


