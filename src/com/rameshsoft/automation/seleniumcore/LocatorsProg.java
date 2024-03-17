package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocatorsProg {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\jan8ambatch2023\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.bing.com/");
	
	WebElement image = driver.findElement(By.linkText("Images"));
	
	image.click();
	
	
	
	
	
	
	
	
	
	
	
}
}
