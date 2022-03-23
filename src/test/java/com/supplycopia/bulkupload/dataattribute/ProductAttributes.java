package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductAttributes extends BaseTest{

	@Test(groups = {"bulkupload","sanity" })
	public void ProductAttributeTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Data Attributes").
		ui_wait("3").                               // waiting for option to upload
		selectCustomeSet("Product Attributes").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("Product_Attributes.xlsx").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Product Reference No", "Product Reference No").
		dragHeaderWithName("Description", "Product Description").
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
