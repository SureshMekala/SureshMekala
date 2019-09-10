package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<=e.size();i++)
		{
			if(e.get(i).getAttribute("value").equals("checkbox1")||e.get(i).getAttribute("value").equals("checkbox2"))
			{
				e.get(i).click();
			}
			/*if(e.get(i).isSelected())
			{
			System.out.println(e.get(i).getAttribute("value"));
			}*/
			if(!e.get(i).isSelected())
			{
				e.get(i).click();
			}
		}
		
	}

}
