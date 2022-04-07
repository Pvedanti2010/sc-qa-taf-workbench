package com.supplycopia.bulkupload.mastermanagement;
import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CountryAccountManagement extends BaseTest{

	@Test(groups = {"categoryMaster","Regresion" })
	@RetryCountIfFailed(2)
	public void CountryAccountManagementTest() throws Throwable {
		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().	
		navigateToMasterManagement().
		addNewCountryAccount().
		editNewCountryAccount().
		deleteCountryAccountItem().
		bulkDeleteCountryAccount("3").		
		exportCountryAccount().
		updateCountryAccount();
		}		
	}

		

	

	

	


