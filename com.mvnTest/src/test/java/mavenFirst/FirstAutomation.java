package mavenFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
static WebDriver driver;
	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\imama\\eclipse-workspace 1\\com.mvnTest\\driverOne\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		

		
	}

}
