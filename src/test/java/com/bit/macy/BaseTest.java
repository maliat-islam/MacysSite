package com.bit.macy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bit.pages.OpenBrowser;

public class BaseTest extends OpenBrowser {
	
	
	@BeforeMethod
	public void op() {
		
		open("Firefox");
		
	}
	
	
	@AfterMethod
	
	public void quit() {
		
		dr.quit();
	}

}
