package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_for {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	for(int i=0; i<rows.size(); i++) {
List<WebElement> cells = driver.findElements(By.tagName("td"));
for(int j=0; j<cells.size(); i++) {
	String t = cells.get(j).getText();
	System.out.println(t);
	
}
	}
	}

}
