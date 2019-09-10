package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bvrice.edu.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//a[text()='Machine Learning']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(5000);
		WebElement up = driver.findElement(By.xpath("//h3[text()='Sri K V Vishnu Raju']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		driver.manage().window().maximize();
		
		
		


		
		
		
		
}

}
