package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.Basepage;
import com.util.PageDriver;

public class IdahoHomePage extends Basepage {

	public IdahoHomePage(PageDriver driver)
	{
		super(driver);
	}
	/*
	 * check logo on Idaho department of Health and Welfare
	 */
public boolean isLogoAvailable()
	{       
		boolean isPresent = false;
	    	WebElement logo= driver.findElement(By.xpath("id-logo"));
	    	if(logo != null){
				isPresent = true;}
	    	return isPresent;}
/*
 * navbar element
 */
	public String getNavBar()
	 {
      return (driver.findElement(By.xpath("Home")).getText());
    		  }
	/*
	 * complete reevaluation and coming to same page using bread crumbs
	 */
	
	
public String applyForAssistance(){
	
driver.findElement(By.xpath("xpath-ApplyForAssistance=")).click();
System.out.println(driver.getCurrentUrl());
Actions action = new Actions((WebDriver) driver);
WebElement RenewYourBenefits= driver.findElement(By.xpath("xpath_services"));
action.moveToElement(RenewYourBenefits).build().perform();
WebElement CompleteReevaluation= driver.findElement(By.xpath("xpath_eligibilty"));
action.moveToElement(CompleteReevaluation).click().perform();
//example of breadcrumbs
driver.findElement(By.xpath("xpath_breadcrumbhomepage")).click();;
 return (driver.getCurrentUrl());
 //http://www.healthandwelfare.idaho.gov/FoodCashAssistance/tabid/59/Default.aspx
}
/*
 *  
 */

public String idahoServiceOnlineClick(){

driver.get("http://www.healthandwelfare.idaho.gov/FoodCashAssistance/tabid/59/Default.aspx");
driver.findElement(By.xpath("#dnn_ctr14117_HtmlModule_lblContent>a>img")).click();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 return driver.getCurrentUrl();

}
/*
 * Application for Wic program 
 */
	
public String tellAboutYourself(){
	
	
driver.get("http://www.healthandwelfare.idaho.gov/FoodCashAssistance/tabid/59/Default.aspx");
driver.findElement(By.xpath(".//*[@id='dnn_ctr803_HtmlModule_lblContent']/table/tbody/tr/td[2]/ul/li[6]/a")).click();
System.out.println(driver.getCurrentUrl());
Actions action = new Actions((WebDriver) driver);
WebElement Apply = driver.findElement(By.xpath(".//*[@id='dnn_ctr13532_HtmlModule_lblContent']/div/ul/li[3]/a"));
action.click(Apply).build().perform();
WebElement Application =driver.findElement(By.xpath(".//*[@id='dnn_ctr13532_HtmlModule_lblContent']/div/ul/li[3]/div/ul/li[3]/a"));
action.click(Application).click().perform();
return driver.getCurrentUrl();
//(http://www.healthandwelfare.idaho.gov/Portals/0/FoodCashAssistance/WomenInfantsandChildren/Application_Solicitud%20de%20Idaho%20Programa%20WIC.pdf?ver=2016-06-10-151529-737
}
/*
 * Eligibilty Tool 
 */
public String eligibiltyTool(){
 	
driver.get("http://www.healthandwelfare.idaho.gov/FoodCashAssistance/tabid/59/Default.aspx");
driver.findElement(By.xpath(".//*[@id='dnn_ctr803_HtmlModule_lblContent']/table/tbody/tr/td[2]/ul/li[6]/a")).click();
System.out.println(driver.getCurrentUrl());
Actions action = new Actions((WebDriver) driver);
WebElement Apply = driver.findElement(By.xpath(".//*[@id='dnn_ctr13532_HtmlModule_lblContent']/div/ul/li[3]/a"));
action.click(Apply).build().perform();
WebElement Eligibility = driver.findElement(By.xpath(".//*[@id='dnn_ctr13532_HtmlModule_lblContent']/div/ul/li[3]/div/ul/li[2]/a"));
Eligibility.click();
return driver.getCurrentUrl();
//(http://wic.fns.usda.gov/wps/pages/start.jsf)


}

}







