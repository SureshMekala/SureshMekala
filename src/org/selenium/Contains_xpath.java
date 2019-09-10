package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Contains_xpath extends Base_class {
public static void main(String[] args) throws InterruptedException {
	launchBrowser("https://www.facebook.com");
	WebElement e = driver.findElement(By.xpath("//i[contains(@class, 'fb_logo')]"));
	System.out.println(e);
	WebElement f = driver.findElement(By.xpath("//div[contains(text(), 'Facebook')]"));
	System.out.println(f);
	
	Thread.sleep(5000);
	closeBrowser();
}
}
