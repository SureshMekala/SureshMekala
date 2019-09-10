package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadurl(String url)
	{
	driver.get(url);
	}
public static void type(WebElement element, String name)
{
	element.sendKeys(name);
}
public static void btnclick(WebElement element)
{
	element.click();
}
public static void closeBrowser()
{
	driver.close();
}
	

}
