import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Rahulshetty {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		
		s.get("https://rahulshettyacademy.com/");
		s.findElement(By.className("register-btn")).click();
		s.findElement(By.id("email")).sendKeys("vignesh@gmail.com");
		s.findElement(By.id("password")).sendKeys("vignesh");
		s.findElement(By.className("btn-primary")).click();
		
	}

}

//refer nxt pg...
