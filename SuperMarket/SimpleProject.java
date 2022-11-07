import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleProject {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		
		
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.className("register-btn")).click();
		driver.findElement(By.id("email")).sendKeys("vehwar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vignesh");
		driver.findElement(By.className("p-h-5-xs")).click();
		System.out.println(driver.findElement(By.cssSelector("div.auth-flash-error")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
	}
}
