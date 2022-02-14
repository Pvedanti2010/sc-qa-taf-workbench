package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductCategoryMapping extends BaseTest{

	@Test(groups = {"bulkupload" ,"sanity"})
	public void ProductCategoryMappingTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Data Attributes").
		selectCustomeSet("Product Category Mapping").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("Product_Category_Mapping.xlsx").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Product Reference No", "Product Reference No").
		dragHeaderWithName("Category", "Category").
		dragHeaderWithName("Sub Category", "Subcategory").
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
