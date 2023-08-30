package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() throws InterruptedException {
		
	
	
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	
	
	Thread.sleep(2000);

	WebElement frm=driver.findElement(By.id("gdpr-consent-notice"));
	driver.switchTo().frame(frm);
	
	driver.findElement(By.xpath("//span[text()='Accept All']")).click();
	
	lp.clickSubmit();
	
	String expectedText="Guru99 Bank";
	String actualText=driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
	
	if(actualText.equals(expectedText)) {
		
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
		
	}
	
}
	
	

}
