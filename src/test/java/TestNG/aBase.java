package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites_library.CommonUtil;

public class aBase {
WebDriver driver = null;
	/***********************************************************************************
	 * FRAMEWORK STANDARD:- Each Class should only have one page all Methods.
	 * ClassName always start or end with Test so we can run from maven ==CMD== mvn test
	 ***********************************************************************************/
	@BeforeTest()
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@AfterTest()
	public void tearDown(){
		driver.quit();
		driver =null;
	}

	@AfterMethod
    public void closeLast(ITestResult result) throws IOException, InterruptedException {
		String monthAndDate = CommonUtil.getMonthAndDate();
		String digit6TimeStamp = CommonUtil.get6DigitTimeStamp();
			
		if(ITestResult.FAILURE == result.getStatus()) {
			String failScreenShotName = result.getMethod().getMethodName() + monthAndDate + "_Failed_" + digit6TimeStamp;
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("../Maven_Seleniums/Screenshot/"+ failScreenShotName +".png"));//result+result.getName()		
		}
	}
}
