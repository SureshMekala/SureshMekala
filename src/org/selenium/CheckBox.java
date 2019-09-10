package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/CCLogin.html");
	driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	driver.manage().window().maximize();
	driver.quit();


	


}
}
