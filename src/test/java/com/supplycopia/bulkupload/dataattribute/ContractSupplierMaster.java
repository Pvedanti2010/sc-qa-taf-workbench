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
	@Test(groups = {"dataattribute" ,"Regression"})
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
		selectDataType(_session.get_data().get("DataType")).
		ui_wait("8").
		selectCustomeSet(_session.get_data().get("CustomeSet")).
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer(_session.get_data().get("ImportSheetName")).
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Contract id", "Contract Id").
		dragHeaderWithName("Supplier", "Supplier").
		proceedToReviewAndEdit().
		checkValidationErrorsOnReviewAndEdit(_session.get_data().get("ValidationErrors")).
		checktotalRecordsOnReviewAndEdit(_session.get_data().get("TotalRecords")).
		proceedToUpdate().
		checkValidationErrorsOnReviewAndEdit(_session.get_data().get("ValidationErrors")).
		checktotalRecordsOnReviewAndEdit(_session.get_data().get("TotalRecords")).
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
