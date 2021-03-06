package com.supplycopia.bulkupload.mastermanagement;
import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class MasterManagement extends BaseTest{


	@Test(groups = {"masterManagement","Sanity"})
	@RetryCountIfFailed(2)
	public void MasterManagementSanityTest() throws Throwable {		
		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().	
		navigateToMasterManagement().
		validateMasterPageLoad().
		clickContractSupplierMaster().
		validateMasterPageLoad().
		clickCountryAccountMaster().
		validateMasterPageLoad().
		clickProductManufacture().
		validateMasterPageLoad();
		
		}

	
		
	}		
	

	

	


