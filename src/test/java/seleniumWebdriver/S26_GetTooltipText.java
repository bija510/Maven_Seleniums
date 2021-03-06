package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilites_library.Base;

public class S26_GetTooltipText extends Base {

	@Test
	public void tooltipText() {
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement agebox = driver.findElement(By.id("age"));
		String tooltiptext = agebox.getAttribute("title");
		if (tooltiptext.equals("We ask for your age only for statistical purposes.")) {
			System.out.println("Tooltip test passed");
		}else{
			System.out.println("Tooltip test failed");
		}
	}
}
