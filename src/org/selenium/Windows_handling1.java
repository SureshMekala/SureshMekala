package org.selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
		WebElement e = driver.findElement(By.id("fldLoginUserId"));
		e.sendKeys("Sureshmekala");
WebElement f = driver.findElement(By.id("fldPassword"));
f.sendKeys("suresh");
WebElement btn = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
btn.click();
//1st step get parent window
String pWind = driver.getWindowHandle();
System.out.println(pWind);
//2nd step get all the windows ID
Set<String> allWind = driver.getWindowHandles();
System.out.println(allWind);
//3rd iteration
int c=0;
for (String cWind : allWind) {
	//4th step check the id
	if (c==1) {
		driver.switchTo().window(cWind);
	}
	c++;	
	}
ArrayList<String> list=new ArrayList<>();
list.addAll(allWind);
System.out.println("List: " +list);
driver.switchTo().window(list.get(1));

WebElement clo = driver.findElement(By.name("fldSubmit"));
clo.click();
Thread.sleep(5000);
driver.quit();
}

	

}
