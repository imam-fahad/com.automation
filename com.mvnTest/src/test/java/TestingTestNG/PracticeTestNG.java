package TestingTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	 WebDriver driver;
	 
	@BeforeTest
	public void presetup() 
	{System.setProperty("webdriver.chrome.driver", "C:\\Users\\imama\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();}
	@Test
	public void baselogin()
	{driver.get("https://www.automationpractice.com/");
	driver.manage().window().maximize();}
	@AfterTest
	public void closeout()
	{driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.close();}
	
}
