package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//for (WebElement x:w)
		{
			//if(x.getAttribute("value").equals("checkbox1")||x.getAttribute("value").equals("checkbox2"))
			for(int i=0;i<=w.size();i++)
			{
				if(w.get(i).getAttribute("value").equals("checkbox1")||w.get(i).getAttribute("value").equals("checkbox2"))
				{
				w.get(i).click();
				}
			}
		}
				
		
			
		}
		
	}
	


