package testcase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.TableRowSorter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class amazon  extends BaseTest{
	
	@Test (priority = 1,enabled = false)
	public static void amazon() throws InterruptedException 
	{
		
		WebElement drp = driver.findElement(By.id("searchDropdownBox"));
		
		drp.click();
		
		Select ab = new Select(drp);
//		System.out.println(ab.isMultiple());
//		ab.selectByIndex(4);
		List<WebElement> a = ab.getOptions();
		for(WebElement b:a)  
		{
			System.out.println(b.getText());
		} 
	} 
	
   
	
		@Test
		public static void ama()throws IOException, InterruptedException
		{
			
			
			
			driver.findElement(By.linkText("Mobiles")).click();
			driver.findElement(By.linkText("Mobiles & Accessories")).click();
			Thread.sleep(3200);
			driver.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[2]/ul/li[5]/a")).click();
			
			
			
			//Alerts Handle
//			Alert alert = driver.switchTo().alert(); // switch to alert
//			String alertmsg = driver.switchTo().alert().getText(); // alert msg		
//			alert.accept(); // alert accept
			
			
			// srolldown and up
//			JavascriptExecutor js = ((JavascriptExecutor)driver);
//			js.executeScript("window.scrollby (0,document.body.scrollheight)");
			
			// window handle
//			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs.get(1));
			
			
//			TakesScreenshot screenshot = (TakesScreenshot)driver;
//			//Saving the screenshot in desired location
//			File source = screenshot.getScreenshotAs(OutputType.FILE);
//			//Path to the location to save screenshot
//			FileUtils.copyFile(source, new File("C://tmp//1.png"));
//			System.out.println("Screenshot is captured");
		}
		
}