package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FlipKartModule {
	public static void selectGender(WebDriver driver, String input) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[text()='Gender']")));
		By by=By.xpath("(//div[text()='"+input+"']/../div)[1]");
		//driver.findElement(by).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(by) );
		// javascript executor used to simuate the process
		try {Thread.currentThread().sleep(5000);}catch(Exception e) {}
	}
}
