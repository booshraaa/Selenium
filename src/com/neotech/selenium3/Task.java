package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//input[@id'email']")).sendKeys("john@mail");
		driver.findElement(By.xpath("//input[@id'pass']")).sendKeys("john123");

		driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();

		Thread.sleep(2000);

		driver.quit();
	}

}
