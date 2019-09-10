package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value', 'Suresh')", e);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=(String)o;
		System.out.println(s);
		WebElement f = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', 'Suresh')", f);
		WebElement g = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()", g);
		driver.quit();
			
		
		
		
		
	}

}
