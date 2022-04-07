package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductCategoryValidationErrorCurrectToFly extends BaseTest{

	@Test(groups = {"bulkupload" ,"Functional"})
	public void ValidationErrorCurrectToFlyTest() throws Throwable {

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
		uploadFromComputer("Product_Category_FlySheet.xlsx").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Product Reference No", "Product Reference No").
		dragHeaderWithName("Category", "Category").
		dragHeaderWithName("Sub Category", "Subcategory").
		proceedToReviewAndEdit().		
		checkValidationErrorsOnReviewAndEdit("2").
		checktotalRecordsOnReviewAndEdit("9").
		validateProductNumber("Prod RefAAnkit -001").
		validateProductNumber("Prod RefAAnkit -002").
		validateProductNumber("Prod RefAAnkit -003").
		validateProductNumber("Prod RefAAnkit -004").
		validateProductNumber("Prod RefAAnkit -005").
		validateProductNumber("Prod RefAAnkit -006").
		validateProductNumber("Prod RefAAnkit -007").
		insertValueinValidationErrorTable("cat kk","sub",0).
		checkValidationErrorsOnReviewAndEdit("0").
		checktotalRecordsOnReviewAndEdit("9").
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage("0").
		checktotalRecordsOnUpdatePage("9").
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
