package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	static WebDriver driver;
public static void launchBrowser(String url)
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);

}
public static void type(WebElement loc, String input)
{
	loc.sendKeys(input);
}
public static void click(WebElement loc)
{
loc.click();

}
public static void closeBrowser()
{
	driver.quit();
}
}

