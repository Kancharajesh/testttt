package base;
 
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.second;
//import org.openqa.selenium.support.ui.ExpectedConditions
//import org.openqa.selenium.support.ui.WebDriverWait

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static Properties loc = new Properties();
	public static FileReader lo;
	
	@BeforeTest
	public void setup() throws IOException {
	
		if (driver==null) {
			FileReader fr = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\spaarksmobile01\\src\\test\\java\\config.pro");
			prop.load(fr);
			
			FileReader lo = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\spaarksmobile01\\src\\test\\java\\Locators");
			loc.load(lo);
			
		} 
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); // base
			driver = new ChromeDriver(); // base
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("make"));
			
		}	
		
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("make"));
		}
	}

	@AfterTest
	public void close() {
		
//		driver.close();
		System.out.println("teardown successfull");
		
	}
	
}
