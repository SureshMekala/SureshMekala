package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLaunch {
	public static void main(String[] args) throws InterruptedException {
		//Set path for driver
System.setProperty("webdriver.gecko.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\geckodriver.exe");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		// create object for driver
		 WebDriver driver = new FirefoxDriver();
		 WebDriver driver1=new ChromeDriver();
		 
		//Launch the URL
		driver.get("https://www.facebook.com/");
		driver1.get("https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		driver1.manage().window().maximize();
		//Get URL
		String currentUrl = driver.getCurrentUrl();
		String currentUrl2 = driver1.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(currentUrl2);
		//Get title
		String title = driver.getTitle();
		String title1 = driver1.getTitle();
		
		System.out.println(title);
		System.out.println(title1);
		
		Thread.sleep(1000);
		//quit
		driver.quit();
		driver1.quit();
		
		
	}
	

}
