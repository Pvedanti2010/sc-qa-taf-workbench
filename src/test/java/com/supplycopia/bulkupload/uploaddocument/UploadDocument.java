package com.supplycopia.bulkupload.uploaddocument;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class UploadDocument extends BaseTest{

	@Test(groups = {"bulkupload" ,"sanity"})
	public void UploadDocumentTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Documents").
		selectCustomeSet("Product Documents").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("Product_Documents.xlsx").
		clickImportFile().
		uploadFromComputer("prod_document").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Filename", "Filename").
		dragHeaderWithName("Product Reference No.", "Product Ref No").
		proceedToReviewAndEdit().
		checkValidationErrorsOnReviewAndEdit("0").
		checktotalRecordsOnReviewAndEdit("17").
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage("0").
		checktotalRecordsOnUpdatePage("17").
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();
		
		
	

	}

}