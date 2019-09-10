package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/challenge/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin&TL=APDPHBA7EGiBFpdv-VdiVxdtbPACG2TQk-bJip9-7P-j2fS5D376YLeKUqLsgQpr&cid=3&navigationDirection=forward");
		WebElement e = driver.findElement(By.id("identifierId"));
		WebDriverWait w=new WebDriverWait(driver, 100);
		WebElement email = w.until(ExpectedConditions.elementToBeClickable(e));
		email.sendKeys("Suresh");
		driver.quit();
		
		
	}

}
