package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("sureshmekala142@gmail.com");
		WebElement f = driver.findElement(By.name("pass"));
		f.sendKeys("suresh");
		WebElement g = driver.findElement(By.id("loginbutton"));
		g.click();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
