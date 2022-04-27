package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ItemMaster extends BaseTest{
	@Test(groups = {"categoryMaster","Regression" })
	@RetryCountIfFailed(2)
	public void ItemMasterTest() throws Throwable {
		
		

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToItemMaster().
		exportProductEntries().			
		validateColumnPresent(_session.get_data().get("ColumnName"),true).
		clickColumns().
		selectColumnAccount().
		clickColumns().
		validateColumnPresent(_session.get_data().get("ColumnName"),false).
		clickColumns().
		selectColumnAccount().
		clickColumns().
		validateColumnPresent(_session.get_data().get("ColumnName"),true).
		editProductEntry("productDesc_"+StringUtility.randomGenarotor("number", 4),"cat").
		selectCategoryFromDropDown(_session.get_data().get("CatDropDown")).
		selectSubCategoryDropDown(_session.get_data().get("SubCatDropDown")).
		clickOnSaveBtn().		
		validateDocumentManagement(_session.get_data().get("ImportSheetName")).
		validateFunctionallyEquivalent().
		deleteSingleProduct().
		markAsFunctionalEquivalentFunctionallty().
		validateBulkUpdateFunctionality();
		//validateBulkdeleteFunctionality();
		
		
		
		}
	
	}

	

	


