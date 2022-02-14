package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;
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
		exportFunctionallty().		
		columnsSelectorFunctionallty().
		//actionItemToEditFunctionallty().		
		actionItemToDocumnetManagementFunctionallty().
		actionItemToFunctionallyEquivalent().
		actionItemToSingledeleteFunctionallty().
		markAsFunctionalEquivalentFunctionallty().
		bulkUpdateFunctionallty().
		bulkdeleteFunctionallty();
		}
	
	}

	

	


