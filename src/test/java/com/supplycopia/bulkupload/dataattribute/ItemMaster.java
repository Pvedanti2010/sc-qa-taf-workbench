package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;

import com.supplycopia.utils.StringUtility;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ItemMaster extends BaseTest{

	@Test(groups = {"categoryMaster" })
	public void CategoryMasterManagementTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToItemMaster().
		exportProductEntries().		
		selectAllColumns().
		editProductEntry("productDesc_"+StringUtility.randomGenarotor("number", 4),"cat").		
		validateDocumentManagement("Category_Master.xlsx").
		validateFunctionallyEquivalent().
		deleteSingleProduct().
		markAsFunctionalEquivalentFunctionallty().
		validateBulkUpdateFunctionality().
		validateBulkdeleteFunctionality();
		}
	
	}

	

	


