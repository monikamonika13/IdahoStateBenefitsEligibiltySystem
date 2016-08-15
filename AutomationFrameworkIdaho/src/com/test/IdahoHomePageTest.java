package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.IdahoHomePage;

public class IdahoHomePageTest extends BaseTest {
   IdahoHomePage hp;
	
	@BeforeClass
	public void beforeclass(){
		hp= new IdahoHomePage(driver);
	}
	@Test
	public void isLogoAvailableTest()
	{
		assertTrue(hp.isLogoAvailable());
	}
	
	@Test
	public void getNavBarTest()
	{
		String actual  = hp.getNavBar();
		assertEquals(actual,"Home");
	}
	@Test
	public void applyForAssistance()
	{
		String actual  = hp.getNavBar();
assertEquals(actual," http://www.healthandwelfare.idaho.gov/FoodCashAssistance/tabid/59/Default.aspx");

	}

}
