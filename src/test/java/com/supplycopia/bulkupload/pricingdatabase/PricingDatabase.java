package com.supplycopia.bulkupload.pricingdatabase;

import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class PricingDatabase extends BaseTest{

	@Test(groups = {"bulkupload" ,"sanity"})
	@RetryCountIfFailed(2)
	public void PricingDataBaseTest() throws Throwable {

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
		scrollRight("2").
		selectRowfor("Edit","1").
		setPackSize("23", "1").
		scrollRight("3").
		clickSaveProductPrices("saveButton", "1").
		selectRowfor("changeHistory", "1").
		verifyChangeHistoryPopUp().
		closeChangeHistoryPopUp().
		selectRowfor("Delete","4").
		confirmDeleteMapping().
		bulkSelectReferenceNumbers("3").
		clickBulkDelete().
		confirmBulkDeleteMapping().
		clickFilter().
		expendProductRef().
		selectProdRefOption("1").
		clickBackFilter().
		clearFilter();
	}

}
