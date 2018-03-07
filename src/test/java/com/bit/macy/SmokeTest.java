package com.bit.macy;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bit.pages.MainMenu;

public class SmokeTest extends BaseTest {
	
	
	
	@Test
	public void test1() {
		
		MainMenu mn = new MainMenu(dr);
		ArrayList<Object> accValue = mn.actualValue();
		ArrayList<Object> exValue = mn.expectedValue();
		Iterator<Object> i1 = accValue.iterator();
		Iterator<Object> i2 = exValue.iterator();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		while(i1.hasNext() && i2.hasNext()) {
			//Assert.assertEquals(i1.next(), i2.next());
			System.out.println(i1.next()+" matched with "+i2.next());
			
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		Assert.assertEquals(i1,i2);
		
		
	}
	
	
	
	
}
