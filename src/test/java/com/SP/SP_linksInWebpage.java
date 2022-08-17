package com.SP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SP_linksInWebpage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> all_tags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are: "+all_tags.size());
		
		for (int i = 0; i < all_tags.size(); i++) {
			System.out.println("Links on page are: "+all_tags.get(i).getAttribute("href"));
			System.out.print("Links on page are: "+all_tags.get(i).getText());
		}
	}
}
