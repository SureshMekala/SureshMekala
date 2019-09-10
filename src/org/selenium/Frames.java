package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//count of frames
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int len = frames.size();
		System.out.println("frame size is:" +len);
		//count of images
		List<WebElement> img = driver.findElements(By.tagName("img"));
		int images = img.size();
		System.out.println("no of images:" +images);
		//count of links
		List<WebElement> lk = driver.findElements(By.tagName("a"));
		int links = lk.size();
		System.out.println("number of links:" +links);
		
	}
	

}
