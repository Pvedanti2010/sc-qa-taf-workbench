package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ContractSupplierMaster extends BaseTest{
	@Test(groups = {"dataattribute" ,"Regresion"})
	@RetryCountIfFailed(2)
	public void ContractSupplierMasterTest() throws Throwable {
		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Data Attributes").
		ui_wait("8").
		selectCustomeSet("Contract Supplier Master").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("Contract_Supplier_Master.xlsx").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Contract id", "Contract Id").
		dragHeaderWithName("Supplier", "Supplier").
		proceedToReviewAndEdit().
		checkValidationErrorsOnReviewAndEdit("0").
		checktotalRecordsOnReviewAndEdit("9").
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage("0").
		checktotalRecordsOnUpdatePage("9").
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
