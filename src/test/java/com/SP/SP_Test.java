package com.SP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SP_Test {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinodarokiara_v\\Test\\eclipse-workspace\\Maven_Project\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.scribd.com/");
		driver.findElement(By.xpath("(//span[@class='SvgIcon-module_wrapper__1fPqw'])[1]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("data science");

		Thread.sleep(5000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='R1CNrY'])[6]")));				
		
			WebElement element = driver
					.findElement(By.xpath("(//a[@class='R1CNrY'])[6]"));
			element.click();
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='_7a1igU']"))
				.getText();
		text = text.split(" ")[4].trim();
		System.out.println(text);

	}

}
