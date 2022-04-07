package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ItemMaster extends BaseTest{
	@Test(groups = {"categoryMaster","Regresion" })
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
		selectAllColumns().		
		//editProductEntry("productDesc_"+StringUtility.randomGenarotor("number", 4),"cat").
		//selectCategoryFromDropDown("Category-3").
		//selectSubCategoryDropDown().
		//clickOnSaveBtn().
		validateDocumentManagement("Category_Master.xlsx").
		validateFunctionallyEquivalent().
		deleteSingleProduct().
		markAsFunctionalEquivalentFunctionallty().
		validateBulkUpdateFunctionality().
		validateBulkdeleteFunctionality();
		}
	
	}

	

	


