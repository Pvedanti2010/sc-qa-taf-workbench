package com.supplycopia.bulkupload.pricingdatabase;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class PricingDatabase extends BaseTest{

	@Test(groups = {"bulkupload" ,"regresion"})
	public void PricingDatabaseTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToPricingDatabase().
		bulkSelectReferenceNumbers("5").
		clickExport().
		clickExportButtomTray().
		validateColumnPresent("Account", true).
		clickColumns().
		selectColumnAccount().
		clickColumns().
		validateColumnPresent("Account", false).
		clickColumns().
		selectColumnAccount().
		clickColumns().
		validateColumnPresent("Account", true).
		selectRowfor("Edit","1");
		
		
		
		
		
		
	

	}

}
