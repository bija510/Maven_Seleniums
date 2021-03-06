package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S31_MethodChaining_01 {

	WebDriver driver;
	
	public S31_MethodChaining_01 openUrl() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		return this;
	}
	
	public S31_MethodChaining_01 enterUserName() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		return this;
	}
	
	public S31_MethodChaining_01 enterPassword() {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		return this;
		
	}
	
	public S31_MethodChaining_01 clickLoginBtn() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		return this;
	}
	
}


