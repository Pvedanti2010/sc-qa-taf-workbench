package com.supplycopia.bulkupload.pricingdatabase;

import org.testng.annotations.Test;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class PricingDatabase extends BaseTest{


	
	@Test(groups = {"bulkupload" ,"Regression"})
	//@RetryCountIfFailed(2)
	public void PricingDataBaseTest() throws Throwable {


		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToPricingDatabase().
		bulkSelectReferenceNumbers(_session.get_data().get("NumberOfMapping")).
		clickExport().
		clickExportButtomTray().
		validateColumnPresent(_session.get_data().get("ColumnName"), true).
		clickColumns().
		selectColumnAccount().
		clickColumns().
		validateColumnPresent(_session.get_data().get("ColumnName"), false).
		clickColumns().
		selectColumnAccount().
		clickColumns().
		validateColumnPresent(_session.get_data().get("ColumnName"), true).
		scrollRight("2").
		selectRowfor("Edit","1").
		setPackSize("23", "1").
		scrollRight("3").
		clickSaveProductPrices("saveButton", "1").
		selectRowfor("changeHistory", "1").
		verifyChangeHistoryPopUp().
		closeChangeHistoryPopUp().
		selectRowfor("Delete","4").
		confirmDeleteMapping().
		bulkSelectReferenceNumbers(_session.get_data().get("NumberOfMapping")).
		//clickBulkDelete().
		//confirmBulkDeleteMapping().
		clickFilter().
		expendProductRef().
		selectProdRefOption("1").
		clickBackFilter().
		clearFilter().
		clickAddNewButton().
		selectproductRefNoFromDropDownValue("20").
		selectCountryFromDropDown(_session.get_data().get("CountryDropDown")).
		addselectAccountFromDropDown(_session.get_data().get("AccountDropDown")).
		selectSupplierfromDropDownValue(_session.get_data().get("SupplierDropDown")).
		selectContractIdFromDropDownValue().
		enterValuePackSizeInputBox().
		selectCurrencyDropDownValue(_session.get_data().get("CurrencyDropDown")).
		enterValuePricePerEaOriginalCurrenyInputBox(_session.get_data().get("PricePerEaOriginal")).
		enterValuePricePerEaUsdInputBox(_session.get_data().get("PricePerEaUsd")).
		enterValuePackPriceOriginalCurrencyInputBox(_session.get_data().get("PackPriceOriginal")).
		enterValuepackPriceUsdInputBox(_session.get_data().get("packPriceUsd")).
		clickSaveBtn();
		

	}

}
