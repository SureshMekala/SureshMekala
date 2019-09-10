package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement e = driver.findElement(By.id("email"));
	e.sendKeys("sureshmekala142");
	WebElement f = driver.findElement(By.id("pass"));
	f.sendKeys("mekala");
	WebElement g = driver.findElement(By.id("loginbutton"));
	g.click();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("D:\\ss\\suresh.jpeg");
	FileUtils.copyFile(src, des);
}
}
