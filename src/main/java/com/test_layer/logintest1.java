package com.test_layer;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.basepage1;
import com.page_layer.login1;



	

	@Test
	public class logintest1 extends basepage1 {
		public void init() throws Exception {
	  
	        
	        login1 login1 = PageFactory.initElements(driver,login1.class);	          
	        login1.setEmail("abc@gmail.com");
	        login1.clickOnNextButton();
	        login1.setPassword("23456@qwe");
	        login1.clickOnNextButton();
	    }
	}
	    
	              
	    	

