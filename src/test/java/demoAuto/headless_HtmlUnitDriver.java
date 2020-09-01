package demoAuto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headless_HtmlUnitDriver {
	/******************************************************************************
	 * This is byDefault headless browser & Num #1 fastest browser Only in selenium
	 * Completely implemented using java just need dependency in pom.XML
	 ******************************************************************************/
	@Test
	public void headlessBrowserExecution()   {
	HtmlUnitDriver driver = new HtmlUnitDriver();

	driver.get("https://www.google.com/");
	WebElement googlePageLebel = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(googlePageLebel.getText());	
		
		
	}
}
