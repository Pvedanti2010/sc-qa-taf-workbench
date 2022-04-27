package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductPrices extends BaseTest{
	@Test(groups = {"bulkupload" ,"Regression"})
	@RetryCountIfFailed(2)

	public void ProductPriceTest() throws Throwable {

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
		checkValidationErrorsOnReviewAndEdit(_session.get_data().get("ValidationErrors")).
		checktotalRecordsOnReviewAndEdit(_session.get_data().get("TotalRecords")).
		proceedToUpdate().
		checkValidationErrorsOnReviewAndEdit(_session.get_data().get("ValidationErrors")).
		checktotalRecordsOnReviewAndEdit(_session.get_data().get("TotalRecords")).
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
