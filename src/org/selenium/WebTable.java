package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
List<WebElement> rows = driver.findElements(By.tagName("tr"));
for (WebElement r : rows) {
	List<WebElement> cells = r.findElements(By.tagName("td"));
	for (WebElement c : cells) {
		String t = c.getText();
		System.out.println(t);
		
		
	}
}
	driver.quit();		


		}
		
		
	}


