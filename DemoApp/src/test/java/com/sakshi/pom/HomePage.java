package com.sakshi.pom;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id = "amount")
private WebElement amt;

@FindBys(@FindBy(xpath = "//tbody/tr/td[5]"))
private List<WebElement> vls;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAmt() {
	return amt;
}

public List<WebElement> getVls() {
	return vls;
}

}

