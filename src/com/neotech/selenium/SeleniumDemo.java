package com.neotech.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.neotechacademy.com/");

		String url = driver.getCurrentUrl();
		System.out.println("url--> " + url);

		String title = driver.getTitle();
		System.out.println("title--> " + title);

		Thread.sleep(5000); // 5 seconds
		driver.close();

		// (for firefox)

//		String actualURL = driver.getCurrentUrl();
//		String expectedURL = "https://www.neotechacademy.com/";

//		if (actualURL.equalsIgnoreCase(expectedURL)) {
//			System.out.println("Title: " + driver.getTitle());
//		} else {
//			System.out.println("URL is wrong");
//		}

	}

}
