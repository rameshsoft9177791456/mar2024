package com.rameshsoft.automation.seleniumcore;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\jan8ambatch2023\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	
	//driver.navigate().to("https://www.gmail.com");
	//Navigation navigation = driver.navigate();
	//navigation.to("https://www.gmail.com");
	
	//driver.navigate().to(new URL("https://www.gmail.com"));
	//Navigation navigation = driver.navigate();
	//URL url = new URL("https://www.gmail.com");
	//navigation.to(url);
	
	//Using JavaScriptExecutor also
	
	WebElement un = driver.findElement(By.id("identifierId"));
	//un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	Actions actions = new Actions(driver);
	//actions.sendKeys(un, "rameshsoft.9177791456@gmail.com").build().perform();
	actions.click(un).sendKeys("rameshsoft.9177791456@gmail.com").build().perform();
	/*Actions actions2 = actions.click(un);
	Actions actions3 = actions2.sendKeys("rameshsoft.9177791456@gmail.com");
	Action action = actions3.build();
	action.perform();*/
	
	//Robot class
	//Using JavaScriptExecutor also
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	//nxt.click();
	//actions.click(nxt).build().perform();
	//actions.click(nxt).perform();
	//actions.doubleClick(nxt).build().perform();
	actions.sendKeys(nxt, Keys.ENTER).build().perform();
	
	driver.get("https://www.amazon.in/");
	
	WebElement country = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']/following-sibling::div"));
	actions.moveToElement(country).build().perform();
	
	String txt = country.getText();
	System.out.println("Country text is: "+txt);
	
	//ctrl + a
	//ctrl + s
	actions.sendKeys(Keys.chord(Keys.CONTROL),"a").build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL),"s").build().perform();
	
	actions.sendKeys(Keys.chord(Keys.CONTROL)).sendKeys(Keys.SHIFT,"s").build().perform();
	
	actions.clickAndHold(country).pause(Duration.ofSeconds(5)).release(country).build().perform();
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("rameshsoft");
	actions.sendKeys(Keys.ENTER).build().perform();
	
	
	WebElement inst = driver.findElement(By.xpath("//h3[contains(text(),' No.1 JAVA Automation Training Institute')]"));
	actions.contextClick(inst).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
	
	
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
