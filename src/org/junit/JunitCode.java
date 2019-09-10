package org.junit;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitCode {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mekal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

	}
	@AfterClass
	public static void afterclass()
	{
		driver.quit();
	}
	@Before
	public void before()
	{
		java.util.Date d=new java.util.Date();
		System.out.println(d);
	}
	@After
	public void after()
	{
		java.util.Date e=new java.util.Date();
		System.out.println(e);
	}
	@Test
	public void atest()
	{
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("sureshmekala");
		Assert.assertEquals("sureshmekala", e.getAttribute("value"));
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("Suresh");
		Assert.assertEquals("Suresh", p.getAttribute("value"));
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}
	
	

}
