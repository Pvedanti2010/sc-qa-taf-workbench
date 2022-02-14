package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CategoryMaster extends BaseTest{

	@Test(groups = {"bulkupload" ,"sanity"})
	public void CategoryMasterTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Data Attributes").
		selectCustomeSet("Category Master").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("Category_Master.xlsx").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithIndex("2", "2").
		dragHeaderWithIndex("1", "1").
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
