package com.rameshsoft.automation.seleniumcore;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\jan8ambatch2023\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	
	//1. identify the element
	WebElement userName = driver.findElement(By.id("identifierId"));
	
	//2. perform the action
	userName.clear();
	userName.sendKeys("rameshsoft.9177791456@gmail.com");
	
	
	//1. identify the element
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	
	//2. perform the action
	nxt.click();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
}
}
