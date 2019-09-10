package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("yes");
		Thread.sleep(3000);
		a.dismiss();
		driver.quit();
	}

}
