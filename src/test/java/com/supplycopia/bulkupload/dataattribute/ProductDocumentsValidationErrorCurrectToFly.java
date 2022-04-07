package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductDocumentsValidationErrorCurrectToFly extends BaseTest{

	@Test(groups = {"bulkupload" ,"Functional"})
	public void ProductsDocumentValidationErrorCurrectToFlyTest() throws Throwable {

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
		uploadFromComputer("Product_Documents_Fly.xlsx").
		clickImportFile().		
		uploadFromComputer("prod_document").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Product Reference No.", "Product Ref No").
		dragHeaderWithName("Filename", "Filename").
		proceedToReviewAndEdit().
		checkValidationErrorsOnReviewAndEdit("3").
		checktotalRecordsOnReviewAndEdit("17").
//		deleteValidationErrorFileToCrossIcon().
//		validatedeleteMessage().
//		dragHeaderWithIndexOnreviewEditScreen("1","1").
//		deleteValidationErrorFileToCrossIcon().
//		validatedeleteMessage().
//		dragHeaderWithIndexOnreviewEditScreen("2","1").
//		deleteValidationErrorFileToCrossIcon().
//		validatedeleteMessage().
//		dragHeaderWithIndexOnreviewEditScreen("3","1").
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage("0").
		checktotalRecordsOnUpdatePage("17").
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
