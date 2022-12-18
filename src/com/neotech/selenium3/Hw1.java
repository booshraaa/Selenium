package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	public final static String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser, go to guru99
		// click on register and fill out info
		// click submit

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		// click on register link
		driver.findElement(By.partialLinkText("REGIS")).click();

		Thread.sleep(2000);

		// 2nd way to do this;
//		WebElement register = driver.findElement(By.partialLinkText("REGIS"));
//		register.click();

		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("smith");
		driver.findElement(By.name("phone")).sendKeys("333-333");
		driver.findElement(By.name("userName")).sendKeys("bk@gmail.com");

		driver.findElement(By.name("address1")).sendKeys("5th ave");
		driver.findElement(By.name("city")).sendKeys("nyc");
		driver.findElement(By.name("state")).sendKeys("ny");
		driver.findElement(By.name("postalCode")).sendKeys("18023");

		driver.findElement(By.id("email")).sendKeys("john123");
		driver.findElement(By.name("password")).sendKeys("jh123");
		driver.findElement(By.name("confirmPassword")).sendKeys("jh123");

		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);

		String expectedUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";

		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

		driver.quit();

	}

}
