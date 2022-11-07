import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProject {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://careers.infosys.com/placementportal/");
		driver.findElement(By.id("txtUserName")).sendKeys("vignesh@gmail.com");
		driver.findElement(By.id("txtPassword")).sendKeys("vignesh");
		driver.findElement(By.id("txtLoginCaptcha")).sendKeys("bZMho");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.cssSelector("div.alert")).getText();
		System.out.println(driver.getTitle());
	}
}
