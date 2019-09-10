package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert { //In this method either we have to click ok or cancel then it will confirm
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		

	}

}
