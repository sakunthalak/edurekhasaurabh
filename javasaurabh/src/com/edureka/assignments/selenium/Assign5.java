package com.edureka.assignments.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign5 {

	
	ChromeDriver chrome;
	
	public void InvokeBrowser() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
		chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.get("https://www.edureka.co/");
		
		
	}
	
	public void login() {
		
		chrome.findElementByXPath("//a[contains(text(),'Log In')]").click();
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		chrome.findElementById("inputName").sendKeys("sakkuuser@gmail.com");
		chrome.findElementByXPath("//input[@id='pwd1']").sendKeys("sakku@1234");
		chrome.findElementByXPath("//button[contains(text(),'LOG')]").click();
				
	}
	public void navigate() 
	{WebElement dropdown=chrome.findElementByLinkText("Sakku");
			dropdown.click();
		
		chrome.findElementByLinkText("My Profile").click();	
		chrome.findElementByXPath("//i[@class='icon-pr-edit']").click();
				}
public void updatepersonal() 
{
	

chrome.findElementByXPath("//input[@name='currentrole']").click();
	chrome.findElementByLinkText("Manual Tester").click();
	WebElement dropdown=chrome.findElementById("experience");
	Select select=new Select(dropdown);
	
	select.selectByValue("2-4 years");
	chrome.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	chrome.findElementByXPath("//button[@class='btn btn-default pull-right verify-continue-btn']").click();
	/*manual keying of otp is required*/
	

	
	
}
public void updateprofessional() {
	chrome.findElementByXPath("//li[@class='onboarding-tabs professional-details-tab']").click();
	/*
	
chrome.findElementByName("userSkill").sendKeys("Selenium");*/
	
	WebElement dropdownp=chrome.findElementByName("currentIndustry");
	Select select1=new Select(dropdownp);
	select1.selectByValue("IT-Software / Software Services");
	
	WebElement dropdownj=chrome.findElementByName("currentjob");
	
	Select select2=new Select(dropdownj);	
	select2.selectByValue("Senior Management");
	chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	chrome.findElementByXPath("//button[@type='submit']").click();
	String url=chrome.getCurrentUrl();
	System.out.println(url);
		
}
	public void update() {
		chrome.findElementByXPath("//label[@class='radio-inline'][2]").isSelected();
		chrome.findElementByXPath("//button[@type='submit']").click();
		String url1=chrome.getCurrentUrl();
		System.out.println(url1);
		
	/*hrome.findElementByXPath("//a[@class='back-arrow'][2]").click();*/
		chrome.findElementByXPath("//button[@class='btn pull-right onboarding-primary-button']").click();
		
	}
	public void logout() {
		chrome.findElementByXPath("//span[contains(text(),'sakku')]").click();
		chrome.findElementByLinkText("Log Out").click();

		
	}
	

}
