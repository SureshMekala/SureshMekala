package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4{ //Drag and drop
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
		driver.manage().window().maximize();
		
		
		
		
				
	}

}
