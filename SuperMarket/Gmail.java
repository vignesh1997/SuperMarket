import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		
		c.get("https://accounts.google.com/");
		c.findElement(By.className("whsOnd")).sendKeys("vignesh@hcl.com");
		c.findElement(By.className("zQJV3")).click();
	}

}
