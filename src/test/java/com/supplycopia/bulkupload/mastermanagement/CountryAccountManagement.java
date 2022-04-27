package com.supplycopia.bulkupload.mastermanagement;
import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CountryAccountManagement extends BaseTest{

	@Test(groups = {"categoryMaster","Regression" })
	@RetryCountIfFailed(2)
	public void CountryAccountManagementTest() throws Throwable {
		
		String country="AutoCnt_"+StringUtility.randomGenarotor("number", 7);
		String account="AutoAct_"+StringUtility.randomGenarotor("number", 7);
		String updatedCountry="AutoSubCategory_"+StringUtility.randomGenarotor("number", 7);
		String updatedAccount="AutoMainCategory_"+StringUtility.randomGenarotor("number", 7);
		String updatedCountry2="AutoCnt_"+StringUtility.randomGenarotor("number", 7);
		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().	
		navigateToMasterManagement().
		addNewCountryAccount(country,account).
		editNewCountryAccount(updatedCountry,updatedAccount).
		deleteCountryAccountItem().
		bulkDeleteCountryAccount(_session.get_data().get("NumberOfMapping")).
		exportCountryAccount().
		updateCountryAccount(updatedCountry2);
		}		
	}

		

	

	

	


