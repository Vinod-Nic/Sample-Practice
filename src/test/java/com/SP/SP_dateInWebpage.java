package com.SP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SP_dateInWebpage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("onward_cal")).click();
		String month_year = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(month_year);
		
		String month = month_year.split(" ")[0].trim();
		String year = month_year.split(" ")[1].trim();
		
		while (!(month.equals("Dec") && year.equals("2022"))) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			
			month_year = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(month_year);
			
			month = month_year.split(" ")[0].trim();
			year = month_year.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//td[text()='15']")).click();
	}
}
