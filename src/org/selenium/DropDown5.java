package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	WebElement e = driver.findElement(By.name("coffee2"));
	Select s=new Select(e);
	List<WebElement> a = s.getOptions();
	for(int i=0;i<=a.size();i++)
	{
		s.selectByIndex(i);

	}
	
	
}
}
