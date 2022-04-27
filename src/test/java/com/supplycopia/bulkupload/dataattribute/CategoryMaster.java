package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CategoryMaster extends BaseTest{
	@Test(groups = {"bulkupload" ,"Sanity","Regression"})
	@RetryCountIfFailed(2)

	public void CategoryMasterTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType(_session.get_data().get("DataType")).
		selectCustomeSet(_session.get_data().get("CustomeSet")).
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer(_session.get_data().get("ImportSheetName")).
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithIndex("2", "2").
		dragHeaderWithIndex("1", "1").
		proceedToReviewAndEdit().
		checkValidationErrorsOnReviewAndEdit(_session.get_data().get("ValidationErrors")).
		checktotalRecordsOnReviewAndEdit(_session.get_data().get("TotalRecords")).
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage(_session.get_data().get("ValidationErrors")).
		checktotalRecordsOnUpdatePage(_session.get_data().get("TotalRecords")).
		saveAndUpdate().
		confirmUpdate().
		validateSuccessMessage();
		
		
	

	}

}
