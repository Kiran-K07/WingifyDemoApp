package com.sakshi.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class handlingGenericDrpDwn{
//{
//	public static WebElement getLocator(By locator,WebDriver driver) {
//		return 
//	
//	}
//	public static void selectDropDown(WebElement s, String type, String value) {
//		Select s1 = new Select(s);
//		switch(type){
//			case "index":{
//				s1.selectByIndex(Integer.parseInt(value));
//			}
//			case "value" :{
//				s1.selectByValue(value);
//			}
//			case "visibletext" :{
//				s1.selectByVisibleText(value);
//			}
//		}
//	}
	public static void selectDropDown(WebElement s, int index) {
		Select s1 = new Select(s);
				s1.selectByIndex(index);
			}
	public static void selectDropDown2(WebElement s, String value) {
		Select s1 = new Select(s);
				s1.selectByValue(value);
			}
	public static void selectDropDown1(WebElement s, String value) {
		Select s1 = new Select(s);
				s1.selectByVisibleText(value);
			}
	public void selectDropDown(WebElement s, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
