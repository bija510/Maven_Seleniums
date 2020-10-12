package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S03_CrossBrowserTest {
	/***************************************************************
	 * Cross or multi Browser Testing ie:-Firefox, Chrome, IE & Edge
	 ***************************************************************/
	
	public static void main(String[] args) throws InterruptedException {
	/********************************************************************************************	
	System.setProperty("webdriver.chrome.driver", "../Maven_Seleniums/Driver/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	System.setProperty("webdriver.gecko.driver", "../Maven_Seleniums/Driver/geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
	
    System.setProperty("webdriver.IE.driver", "../Maven_Seleniums/Driver/IEDriverServer.exe");
    WebDriverManager.iedriver().setup();
	WebDriver driver = new InternetExplorerDriver();
	**********************************************************************************************/
		
	System.setProperty("webdriver.edge.driver", "../Maven_Seleniums/Driver/msedgedriver.exe"); //Local(present in PC)
	//WebDriverManager.edgedriver().setup(); //Remote(Present in cloud)
	WebDriver driver = new EdgeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	driver.close();	
				
	}
}
