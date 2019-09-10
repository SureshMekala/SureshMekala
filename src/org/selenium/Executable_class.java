package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Executable_class extends Base_class {
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("https://www.facebook.com");
		WebElement e = driver.findElement(By.id("email"));
		type(e, "Sureshmekala");
		WebElement p = driver.findElement(By.id("pass"));
		type(p, "MS");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		btn.click();
		Thread.sleep(5000);
		closeBrowser();
		
		
	}

}
