package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing2 {
	 WebDriver driver;
	@BeforeClass
	private void check() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Test
	private void m1() {
		driver.findElement(By.id("email")).sendKeys("kutty.1428");
		driver.findElement(By.id("pass")).sendKeys("kishoreMS");
		driver.findElement(By.name("login")).click();
	}
}
