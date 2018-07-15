package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithFirefox {
FirefoxDriver firefox;
public void invokebrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\geckodriver.exe");
	
	firefox=new FirefoxDriver();
	
	Dimension dim=new Dimension(600, 400);
	firefox.manage().window().setSize(dim);
	firefox.manage().window().maximize();
	firefox.manage().deleteAllCookies();
	firefox.get("http://qatechhub.com/");
	
}
public void navigatecommands()
{
	firefox.navigate().to("https://www.facebook.com/");
	firefox.navigate().back();
	firefox.navigate().forward();
	firefox.navigate().refresh();
	
}
public String gettitle() {
	String title=firefox.getTitle();
	return title;
}

public String geturl() {
	String url=firefox.getCurrentUrl();
	return url;
}
public void closebrowser() {
	firefox.close();
}
	
	
}
