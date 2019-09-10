package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown8 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	WebElement e = driver.findElement(By.name("coffee2"));
	Select s=new Select(e);
	List<WebElement> b = s.getOptions();
	s.selectByValue("cream");
	s.selectByValue("sugar");
	Thread.sleep(3000);
	s.deselectByValue("cream");
	s.deselectByValue("sugar");
	Thread.sleep(3000);
	s.selectByVisibleText("Skim Milk");
	s.selectByVisibleText("Cream");
	Thread.sleep(3000);
	s.deselectByVisibleText("Skim Milk");
	s.deselectByVisibleText("Cream");
	driver.close();



}
}
