package com.sakshi.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
 @FindBy(id = "username")
 private WebElement usn;
 
 @FindBy(id = "password")
 private WebElement pwd;
 
 @FindBy(id = "log-in")
 private WebElement lgin;
 
 @FindBy(xpath = "//div[text()=\"Password must be present\"]")
 private WebElement pwder;
 
 @FindBy(xpath = "//div[text()=\"Username must be present\"]")
 private WebElement usner;
 
 @FindBy(xpath = "//input[@placeholder=\"Enter your username\"]")
 private WebElement usnph;

 @FindBy(xpath = "//input[@placeholder=\"Enter your password\"]")
 private WebElement pwdph;
 
 @FindBy(xpath = "//div[text()=\"Both Username and Password must be present \"]")
 private WebElement emtlgin;
 
 @FindBy(xpath = "//input[@type= \"checkbox\"]")
 private WebElement chkbx;


 
 public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }

public WebElement getUsn() {
	return usn;
}

public WebElement getPwd() {
	return pwd;
}
public WebElement getLgin() {
	return lgin;
}

public WebElement getPwder() {
	return pwder;
}

public WebElement getUsner() {
	return usner;
}

public WebElement getUsnph() {
	return usnph;
}

public WebElement getPwdph() {
	return pwdph;
}

public WebElement getEmtlgin() {
	return emtlgin;
}

public WebElement getChkbx() {
	return chkbx;
}

 
}

