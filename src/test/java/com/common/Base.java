package com.common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		
		
	
		
	 driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.getPageSource();
	}
	
	
	
	
}
