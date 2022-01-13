package com.supplycopia.template.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.supplycopia.tempate.base.BaseTest;
import com.supplycopia.template.pages.LaunchPad;
import com.supplycopia.template.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class UserLoginTests extends BaseTest{
	
	@Test(groups = {"group2" })
	public void UserLoginTest() throws Throwable {
		System.out.println("Test 2 Case One with Thread Id:- "
				+ Thread.currentThread().getId());
		LoginPage loginPage = new LoginPage();
		LaunchPad launchpad = loginPage.login(_session.get_dataValue("UserName"),_session.get_dataValue("Password"));
		launchpad.validatePageLoad();
        Reporter.log("Test case finihed",true);
	
	}

}
