package com.edureka.assignments.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2wait {
	
		private static final TimeUnit SECONDS = null;
		ChromeDriver chrome;
		
		public void InvokeBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
			chrome =new ChromeDriver();
			
			chrome.manage().window().maximize();
			chrome.manage().deleteAllCookies();
			chrome.manage().timeouts().pageLoadTimeout(6,SECONDS);
			chrome.get("https://www.edureka.co/");
	/*
			chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			chrome.manage().timeouts().setScriptTimeout(20, SECONDS);*/
			
		}
		
		public void testing() throws Throwable {
			WebElement  id=chrome.findElement(By.id("homeSearchBar"));
			id.sendKeys("Selenium");
			id.sendKeys(Keys.ENTER);
			
			/*
			WebElement myelement =wait.until(ExpectedConditions.presenceOfElementLocated(By.id("homeSearchBarIcon")));
			System.out.println(myelement);		
			myelement.sendKeys(Keys.ENTER);*/
			
			String Title=chrome.getCurrentUrl();
			System.out.println(Title);
			if(Title=="https://www.edureka.co/search/Selenium")
				System.out.println("ok");
			else
				System.out.println("no");
			chrome.navigate().back();
			chrome.wait(10);
			chrome.findElementById("dLabel").click();
			
			
			
		}
		
	

}
