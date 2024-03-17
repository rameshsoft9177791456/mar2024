package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsProg {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\jan8ambatch2023\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com");
	
	WebElement dayDD = driver.findElement(By.id("day"));
	String tagName = dayDD.getTagName();
	if (tagName.equalsIgnoreCase("select")) {
		Select select = new Select(dayDD);
		select.selectByIndex(1);
		select.selectByValue("9");
		select.selectByVisibleText("26");
		WebElement firstEl = select.getFirstSelectedOption();
		String txt = firstEl.getText();
		System.out.println(txt);
		List<WebElement> selectedEls = select.getAllSelectedOptions();
		System.out.println("Selected elements are: "+selectedEls);
		List<WebElement> eles = select.getOptions();
		System.out.println("Total noof drop down eles are: "+eles);
	}
	else {
		WebElement ele = driver.findElement(By.xpath("//*[@id='day']/option[5]"));
		ele.click();
		List<WebElement> eles = driver.findElements(By.xpath("//*[@id='day']/option"));
		System.out.println("Total noof drop down eles are: "+eles);
	}
	
	
	
	
	
	
	
	
	
}
}




