package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	public WebDriver dr;
	
	public void open(String s) {
	
		if (s.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anwar Hossain\\Desktop\\driver\\geckodriver.exe");
			dr = new FirefoxDriver();
			dr.get("https://www.macys.com");
			
			
			dr.navigate().refresh();
			
			}
			
			else if (s.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anwar Hossain\\Desktop\\driver\\chromedriver.exe");
				dr = new ChromeDriver();
				dr.manage().window().maximize();
				dr.get("https://www.macys.com");
				dr.navigate().refresh();
				
			}
			
		
	}

}
