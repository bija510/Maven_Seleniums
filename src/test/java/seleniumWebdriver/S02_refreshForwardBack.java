package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_refreshForwardBack {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bijaya Chhetri\\eclipse-workspace\\Maven_Seleniums\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        WebElement forgetPassword =driver.findElement(By.linkText("Sign Up"));
        forgetPassword.click();
        
        WebElement games =driver.findElement(By.linkText("Games"));
        games.click();
        
        Thread.sleep(2000);
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();
        
   
	}

}
