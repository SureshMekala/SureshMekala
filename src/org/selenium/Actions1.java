package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {  //contextclick() and doubleclick()
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement e = driver.findElement(By.id("email"));
e.sendKeys("sureshmekala142");
Actions a=new Actions(driver);
a.doubleClick(e).perform();
a.contextClick(e).perform();
driver.close();
}
}
