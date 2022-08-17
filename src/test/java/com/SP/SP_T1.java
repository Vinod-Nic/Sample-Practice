package com.SP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SP_T1 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinodarokiara_v\\Test\\eclipse-workspace\\Maven_Project\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_SHIFT);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_N);
		
		driver.get("https://www.scribd.com/");
	}

}
