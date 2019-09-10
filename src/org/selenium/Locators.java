package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		//find the locator element
		WebElement e = d.findElement(By.id("email"));


		e.sendKeys("sureshmekala142@gmail.com");
		WebElement f = d.findElement(By.id("pass"));


		f.sendKeys("Suresh12345");
		WebElement g = d.findElement(By.id("loginbutton"));


		g.click();
		d.close();
		
	

		
	}

}
