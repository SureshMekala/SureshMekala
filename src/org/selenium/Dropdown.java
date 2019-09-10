package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		List<WebElement> e = s.getOptions();
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i).getAttribute("value"));
		}
driver.quit();





	}

}
