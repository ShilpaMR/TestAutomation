package com.facebook.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

public class Verifyfacebook {

	
	@Test
	public void verifyValidLogin()
	{
		String path="C:\\Users\\Dell\\Downloads\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",path);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		LoginPage login=new LoginPage(driver);
		login.typeemail();
		login.typepassword();
		login.login();
		login.post();
		
		driver.quit();
	}
	
	
	
	
}
