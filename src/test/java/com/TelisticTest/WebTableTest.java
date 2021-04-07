package com.TelisticTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebTableTest {
	
    
	public static  WebDriver   driver;
	public static String url="https://www.bankofbaroda.in/";
		public static void main(String[] args) {
			// Step 1 WebDriverManager
		WebDriverManager.chromedriver().setup();
				//WebDriverManager.chromedriver().setup();
				//  Step 2   open firefox browser
				driver= new ChromeDriver();
				//Step 3 get website url
				driver.get(url);
				driver.manage().window().maximize();
			
				//Step 1 use Set to id 
	
		
		}
	

}
