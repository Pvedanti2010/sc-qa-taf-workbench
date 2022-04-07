package com.supplycopia.bulkupload.pricingdatabase;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class PricingDatabaseSanity extends BaseTest{

	@Test(groups = {"bulkupload" ,"sanity"})
	public void PricingDatabaseSanityTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToPricingDatabase().
		validatePricingBasePageLoad();
	}

}
