package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
		WebElement e = driver.findElement(By.id("fldLoginUserId"));
		e.sendKeys("sureshmeka");
		WebElement g = driver.findElement(By.id("fldPassword"));
		g.sendKeys("suresh");
		WebElement btn = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
		btn.click();
		//1st step  get the parent window
		String pWind = driver.getWindowHandle();
		System.out.println(pWind);
		//2nd step get all the windows id
		Set<String> allWind = driver.getWindowHandles();
		System.out.println(allWind);
		//3rd iteration
		for (String cWind : allWind) {
			if (!(cWind.equals(pWind))) {
				driver.switchTo().window(cWind);
				
			}
			
		}
		WebElement cls = driver.findElement(By.name("fldSubmit"));
		cls.click();
		
		driver.quit();
		
	}

}
