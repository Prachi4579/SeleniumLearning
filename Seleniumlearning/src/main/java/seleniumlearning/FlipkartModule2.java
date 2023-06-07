package seleniumlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartModule2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Seleniumlearning\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click(); 
		driver.findElement(By.xpath("//div[contains(text(),'Fashion')]")).sendKeys("Women Ethnic");
		//driver.findElement(By.linkText("Ethnic Wear")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[2]")).click();
		
		
		
		
	}

}
