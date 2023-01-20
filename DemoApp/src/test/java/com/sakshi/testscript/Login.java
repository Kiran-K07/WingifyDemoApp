package com.sakshi.testscript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sakshi.generic.Baseclass;
import com.sakshi.generic.FileLib;
import com.sakshi.pom.HomePage;
import com.sakshi.pom.LoginPage;

import junit.framework.Assert;

public class Login extends Baseclass {
	
	FileLib f = new FileLib();
	SoftAssert s = new SoftAssert();

	@Test
	public void isSelected() throws InterruptedException, IOException {
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);
		boolean rs = l.getLgin().isEnabled();
		s.assertEquals(true, rs);
		s.assertAll();
	}

	@Test
	public void ischecked() throws InterruptedException, IOException {
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);
		l.getChkbx().click();
		boolean rs1 = l.getChkbx().isSelected();
		s.assertEquals(true, rs1);
		s.assertAll();
	}
	@Test
	public void emptypwdCheck() throws InterruptedException, IOException {
		String usn = f.getPropertyData("Username");
		Reporter.log(usn);
		String pwd = f.getPropertyData("Password");
		Reporter.log(pwd);
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);

		l.getUsn().sendKeys(usn);
		l.getLgin().click();
		String Exp = l.getPwder().getText();
		s.assertEquals(Exp, "Password must be present");
		s.assertAll();

	}

	@Test
	public void emptyUsnCheck() throws InterruptedException, IOException {
		String pwd = f.getPropertyData("Password");
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);
		l.getPwd().sendKeys(pwd);
		l.getLgin().click();
		String exp = l.getUsner().getText();
		s.assertEquals(exp, "Username must be present");
		s.assertAll();
	}

	@Test
	public void emptyUsnPwdCheck() throws InterruptedException, IOException {
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);
		l.getLgin().click();
		String exp1 = l.getEmtlgin().getText();
		s.assertEquals(exp1, "Both Username and Password must be present");
		s.assertAll();
	}
	@Test
	public void placeHolderCheck() throws InterruptedException, IOException {
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);
		String text = l.getUsnph().getAttribute("placeholder");
		String text1 = l.getPwdph().getAttribute("placeholder");
		
		s.assertEquals(text, "Enter your username");
		s.assertEquals(text1, "Enter your password");
		s.assertAll();
	}

	@Test
	public void isSorted() throws InterruptedException, IOException {
		String usn = f.getPropertyData("Username");
		String pwd = f.getPropertyData("Password");
		com.sakshi.pom.LoginPage l = new com.sakshi.pom.LoginPage(driver);
		HomePage h = new HomePage(driver);

		l.getUsn().sendKeys(usn);
		l.getPwd().sendKeys(pwd);
		l.getLgin().click();
		Thread.sleep(4000);

		h.getAmt().click();
		Thread.sleep(300);
		List<WebElement> list = h.getVls();

		ArrayList<Object> a = new ArrayList<Object>();

		for(WebElement s1 : list) {
			Object opt = s1.getText();
			a.add(opt);
		}

		ArrayList<String> b = new ArrayList<String>();
		for(WebElement s1 : list) {
			String opt = s1.getText();
			b.add(opt);
		}
		for(Object i : a) {
			System.out.println(i);
		}

		for(String i : b) {
			System.out.println(i);
		}
		Object d[] = a.toArray();
		Object e[] = b.toArray();

		boolean rs2 = Arrays.equals(d, e);
		if(rs2) {
			Reporter.log("Sorted", true);
		}
		else {
			Reporter.log("not Sorted", true);
		}
		s.assertAll();
	}

}


