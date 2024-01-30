package testcase;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseTest;

public class second extends BaseTest{

	
	public static void local() throws InterruptedException{
		
		driver.findElement(By.cssSelector(loc.getProperty("Mobiles")));
		
	}
	
	public static void closer() {
		
		
		driver.quit();
	}
}
