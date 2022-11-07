import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FstProject {

	public static void main(String [] args) {
		
		
		//CHROME DRIVER
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		 //WebDriver driver=new ChromeDriver();
		 
		//FIREFOX DRIVER
		 //System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		// WebDriver driver1=new FirefoxDriver();
		 
		 //EDGE DRIVER
		 System.setProperty("webdriver.edge.driver","C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("http://irctc.com");  
		 System.out.println(driver.getTitle());
		 
		 
	}
	
}
