package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithChrome {
ChromeDriver chrome;
public void invokebrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
	
	chrome=new ChromeDriver();
	
	Dimension dim=new Dimension(600, 400);
	chrome.manage().window().setSize(dim);
	chrome.manage().window().maximize();
	chrome.manage().deleteAllCookies();
	chrome.get("https://www.edureka.co/");
	
}


public void navigate() {
	WebElement class1=chrome.findElementByClassName("search_input");
	System.out.println(class1);
	
	
}
/*public void navigatecommands()
{
	chrome.navigate().to("https://www.facebook.com/");
	chrome.navigate().back();
	chrome.navigate().forward();
	chrome.navigate().refresh();
	
}
public String gettitle() {
	String title=chrome.getTitle();
	return title;
}

public String geturl() {
	String url=chrome.getCurrentUrl();
	return url;
}
public void closebrowser() {
	chrome.close();
}
	
*/	
}
