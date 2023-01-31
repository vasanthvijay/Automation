package Admin;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {
	
public static WebDriver driver;
	
	@BeforeSuite
	public  void launch_browser() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://admin.kscollege408.examly.io/");
		
	}
	@AfterSuite
	public void Close_browser() throws InterruptedException {
	    Thread.sleep(3000);
		driver.close();
	}

}
