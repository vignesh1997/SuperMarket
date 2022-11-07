import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hakkerrank {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		
		c.get("https://www.hackerrank.com/");
		c.findElement(By.className("hr__button")).click();  
		c.findElement(By.cssSelector("div.fl-button-wrap")).click();
		c.findElement(By.cssSelector("input#input-1")).sendKeys("vignesh@hcl.com");
		c.findElement(By.className("ui-btn")).click();
	}

}
