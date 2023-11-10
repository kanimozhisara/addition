package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		System.out.println("Edge Drvier Logics added");
		System.out.println("safari Drvier Logics added");

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void printUrl() {
		driver.getCurrentUrl();

	}
}
