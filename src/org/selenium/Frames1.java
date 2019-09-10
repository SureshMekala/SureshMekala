package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 { // switching frames by using all methods
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//switching frames by using ID
		//driver.switchTo().frame("a077aa5e");
		//switching frames using name
		//driver.switchTo().frame("a077aa5e");
		//switching frames using webelement
		//WebElement f = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
		//driver.switchTo().frame(f);
		//driver.switchTo().frame(0);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		
	}	
		
	}


