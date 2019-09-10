package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement e = driver.findElement(By.name("coffee"));
		Select s=new Select(e);
		List<WebElement> w = s.getAllSelectedOptions();
		for (WebElement x : w) {
			System.out.println(x.getText());
			
		}
	}

}
