package com.supplycopia.template.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.supplycopia.tempate.base.BaseTest;
import com.supplycopia.template.pages.LaunchPad;
import com.supplycopia.template.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class APIUserAccessCheck2 extends BaseTest{
	
	@Test(groups = { "group1" },retryAnalyzer = com.supplycopia.retrylistener.RetryListener.class)
	public void UserAccessTest() throws Throwable {
		System.out.println("Test 1 Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	    Assert.assertEquals(true, true);
	}

}
