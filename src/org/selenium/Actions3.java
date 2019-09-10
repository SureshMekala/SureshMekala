package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3 { //movetoelement()
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement cou = driver.findElement(By.xpath("//a[text()='COURSES']"));
		WebElement orc = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		WebElement dba = driver.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
		Actions a=new Actions(driver);
		a.moveToElement(cou).perform();
		a.moveToElement(orc).perform();
		dba.click();
		
	}

}
