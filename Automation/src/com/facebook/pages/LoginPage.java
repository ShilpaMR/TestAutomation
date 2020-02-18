/**
 * 
 */
package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Shilpa
 *
 */
public class LoginPage {
	
	
WebDriver driver;

 By email=By.id("email");
 By password =By.xpath("//input[@name='pass']");
 By login =By.xpath("//input[@type='submit']");
 By post= By.xpath("//div[@ class='_1mf _1mj']");
 
 public LoginPage (WebDriver driver)
 {
 this.driver=driver;
 }
  
 public void typeemail()
 {
	driver.findElement(email).sendKeys("shilpamnilugal@gmail.com"); 
 }
 
 public void typepassword()
 {
 driver.findElement(password).sendKeys("Maheshr");
 }
 
 public void login()

 {
  driver.findElement(login).click();
  
 }
 public void post()
 {
	 driver.findElement(post).sendKeys("hello wprld");
 }
}
