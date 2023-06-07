package seleniumlearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test15 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Seleniumlearning\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com");
	
//	driver.findElement(By.xpath("//sjaskdhjasdkshadfjkhds"));
	//By searchR=By.xpath("//title[@id=\"container\"]");
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchR));
//	Actions action  = new Actions(driver);
//	action.moveToElement(null).click(null).build().perform();
	//staleElementException  - what is and how?
	
//	WebElement searchRes=driver.findElement(searchR);
//	searchRes.sendKeys("abc",Keys.ENTER);
	
	driver.findElement(By.xpath("//span[text()='Login']/../../../../../button")).click(); // xpath axes
//	
	driver.findElement(By.xpath("//div[contains(text(),'Fashion')]")).click();
	driver.findElement(By.linkText("Ethnic Wear")).click();
	
	FlipKartModule.selectGender(driver, "Women");
	FlipKartModule.selectGender(driver, "Men");
	FlipKartModule.selectGender(driver, "Boys");
	FlipKartModule.selectGender(driver, "Girls");
	
	// Waits in Selenium
	
	// Implicit wait
		// is a driver. element searh , Exception 
	// Explicit wait
		// element level

}



}
