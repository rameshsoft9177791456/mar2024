package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationProg {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\jan8ambatch2023\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
	
	/*Options options = driver.manage();
	Timeouts timeouts = options.timeouts();
	timeouts.implicitlyWait(45, TimeUnit.SECONDS);*/
	
	driver.get("https://www.gmail.com");
	
	driver.findElement(By.id("identifierId")).sendKeys("rameshsoft.9177791456");
	Thread.sleep(5000);
	driver.findElement(By.id("identifierNext")).click();
	
	WebElement pwd = driver.findElement(By.name("Passwd"));
	
	WebDriverWait wait = new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.attributeContains(By.id("identifierId"), "name", "identifier"));
	wait.until(ExpectedConditions.attributeContains(pwd, "id", "Password"));
	wait.until(ExpectedConditions.visibilityOf(pwd));
	pwd.clear();
	pwd.sendKeys("dopractice");
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
