package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.ExcelUTIL;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BaseTest {
	public PageDriver driver;
	public ExcelUTIL excelutil;
	public static final Configuration config;
	static{
		config = new Configuration();
	}

  @BeforeSuite
public void beforeSuite(){
	this.driver= new PageDriver(config);
	Locators.readlocators();
	excelutil = new ExcelUTIL();
	
}
  @AfterSuite
public void afterSuite(){
	driver.quit();
	
}
}
