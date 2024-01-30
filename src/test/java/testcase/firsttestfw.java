package testcase;

import static org.testng.Assert.fail;

import java.awt.Window;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;
import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.reporters.AbstractXmlReporter.Count;

import com.google.gson.annotations.Until;

import base.BaseTest;

public class firsttestfw extends BaseTest{
	
	@Test (enabled =false)
	public static void logintest() throws InterruptedException {
		
//		System.out.println(loc.getProperty("Grocery"));
//		Thread.sleep(5000);
		driver.findElement(By.cssSelector(loc.getProperty("Mobiles"))).click();
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();
		
		Thread.sleep(3000); 
		
		driver.findElement(By.linkText("Apple")).click();
		
		Thread.sleep(2000); 		
		driver.findElement(By.cssSelector(loc.getProperty("a1"))).click();
		
		
		
		//switching other tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector(loc.getProperty("Buynow"))).click();
	    Thread.sleep(2000);
	    	    
		driver.findElement(By.cssSelector(loc.getProperty("pincode"))).click();
	    
	    driver.switchTo().window(tabs.get(0));
	     
	    Thread.sleep(2000);
	      
	    driver.findElement(By.xpath(loc.getProperty("change"))).click();
	    Thread.sleep(2000);
	    driver.switchTo().window(tabs.get(1));
	    
	    driver.findElement(By.cssSelector(loc.getProperty("enterpincode"))).sendKeys("500034");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(loc.getProperty("pincodesumbit"))).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(loc.getProperty("placeorder"))).click();
	    
	    driver.findElement(By.cssSelector(loc.getProperty("Mobilenumber"))).sendKeys("6281674691");
		
	    driver.findElement(By.cssSelector(loc.getProperty("Mobilenumbersubmit"))).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(loc.getProperty("otp"))).sendKeys("123456");
	    
	    
	    driver.findElement(By.cssSelector(loc.getProperty("login"))).click();
	    
	    
	
//		driver.close();

		    
	}
	
	@Test(priority = 2)
	public static void test() throws Exception 
	{
		
		driver.findElement(By.cssSelector(loc.getProperty("Mobiles"))).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(loc.getProperty("find"))).click();
				
		
		System.out.println(By.xpath(loc.getProperty("find")));
		
	}

}
