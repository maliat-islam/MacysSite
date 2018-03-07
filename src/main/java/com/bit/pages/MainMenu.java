package com.bit.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainMenu  {
	
	private WebDriver dr;
	
		
	public MainMenu(WebDriver dr) {
		super();
		this.dr = dr;
		//PageFactory.initElements(dr, this);
		
	}
	
	public ArrayList<Object> actualValue() {
		
		ArrayList<Object> arAcc = new ArrayList<Object>();
		List<WebElement> element = dr.findElements(By.xpath("//ul[@id='mainNavigationFobs']/li//span"));
		for(WebElement ele:element) {
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Object o = ele.getText();
			arAcc.add(o);
			
			
		}
		
		return arAcc;
	}
	
	public ArrayList<Object> expectedValue() {
		ArrayList<Object> arEx = new ArrayList<Object>();
		String[] expec = { "WOMEN", "MEN", "HOME", "BED & BATH", "SHOES", "HANDBAGS", "BEAUTY", "KIDS", "JUNIORS", "JEWELRY", "WATCHES", "ACTIVE", "BRANDS"};
		for(String expV: expec) {
			
			arEx.add((Object)expV);
			
		}
		
	
	return arEx;
			
	}
	

	
}
