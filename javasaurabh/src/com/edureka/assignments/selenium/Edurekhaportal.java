package com.edureka.assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edurekhaportal {
	
	
	WebDriver driver;
	public void InvokeBrowser(String browser)
	{if(browser.equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
		driver =new ChromeDriver();
			}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
		
		Dimension dim=new Dimension(800,700);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.edureka.co/");
	}
public void SearchTesting()  {
	
	
	WebElement ElementByID=driver.findElement(By.id("homeSearchBar"));
	if(ElementByID!=null)
		System.out.println("Element is found by id "+ElementByID);
	else
		System.out.println("Element is not found by id"+ElementByID);
	

	WebElement ElementByName=driver.findElement(By.name("user_v1[query]"));
	
	if(ElementByName!=null) 
		System.out.println("Element is found by Name "+ElementByName);
		else
		System.out.println("Element is not found by Name"+ElementByName);
	
	
	
	WebElement class1=driver.findElement(By.className("search_input"));
	if(class1!=null)
		System.out.println("Element is found by className "+class1);
	else 
		System.out.println("Element is notfound by className ");
	
	
	
	WebElement ElementByXpath=driver.findElement(By.xpath("//input[@id='homeSearchBar']"));
		if(ElementByXpath!=null)		
		System.out.println("Element is found by xpath"+ElementByXpath);
	else
		System.out.println("Element is not found by xpath"+ElementByXpath);
		
	
	WebElement ElementByCSS=driver.findElement(By.cssSelector("#homeSearchBar"));
		if(ElementByCSS!=null)
		System.out.println("Element is found by CSS"+ElementByCSS);
	else
		System.out.println("Element is not found by css"+ElementByCSS);
		
		
	
	
	
	WebElement ElementByLinktest=driver.findElement(By.linkText("Log In"));
	if(ElementByLinktest!=null)
		System.out.println("Element is found by Linktest"+ElementByLinktest);
	else
		System.out.println("Element is not found by Linktest"+ElementByLinktest);
	
	
	
	WebElement PartialLinktest=driver.findElement(By.partialLinkText("Log"));
	if(PartialLinktest!=null)
		System.out.println("Element is found by Linktest"+PartialLinktest);
	else
		System.out.println("Element is not found by Linktest"+PartialLinktest);
	
}

}
