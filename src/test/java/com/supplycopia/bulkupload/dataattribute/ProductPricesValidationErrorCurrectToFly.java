package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;

import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductPricesValidationErrorCurrectToFly extends BaseTest{

	@Test(groups = {"bulkupload" ,"Functional"})
	public void ProductPriceValidationErrorCurrectToFlyTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Data Attributes").
		selectCustomeSet("Products Prices").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("Product_Prices_Fly.xlsx").
		clickImportFile().
		validateUploadSuccessMessage().
		dragHeaderWithName("Product Reference No", "Product Ref No").
		dragHeaderWithName("Account", "Account").
		dragHeaderWithName("Country", "Country").
		dragHeaderWithName("Supplier", "Supplier").
		dragHeaderWithName("Contract id", "Contract Id").
		dragHeaderWithName("Pack Size", "Pack Size").   
		dragHeaderWithName("Currency", "Currency").
		dragHeaderWithName("Price per EA", "Price per EA").
		dragHeaderWithName("Price per EA USD", "Price per EA USD").
		dragHeaderWithName("Pack Price", "Pack Price").
		dragHeaderWithName("Pack Price USD", "Pack Price USD").
		proceedToReviewAndEdit().
		checktotalRecordsOnReviewAndEdit("50").
		validateProductNumber("Prod RefAAnkit -001").
		insertValueinValidationErrorPriceTable("Co","ind","Acc","Sup",0).
		checkValidationErrorsOnReviewAndEdit("23").
		checktotalRecordsOnReviewAndEdit("50").
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage("23").
		checktotalRecordsOnUpdatePage("50").
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
