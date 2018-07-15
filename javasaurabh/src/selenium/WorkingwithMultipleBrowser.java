package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithMultipleBrowser {
WebDriver driver;

public void invokebrowser(String browserType ) {
	if(browserType.equalsIgnoreCase("chrome")) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browserType.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	Dimension dim=new Dimension(600, 400);
	driver.manage().window().setSize(dim);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://qatechhub.com/");
	
}
public void navigatecommands()
{
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
public String gettitle() {
	String title=driver.getTitle();
	return title;
}

public String geturl() {
	String url=driver.getCurrentUrl();
	return url;
}
public void closebrowser() {
	driver.close();
}
	
	
}
