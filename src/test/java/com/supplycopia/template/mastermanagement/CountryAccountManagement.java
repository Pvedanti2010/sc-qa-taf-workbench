package com.supplycopia.template.mastermanagement;
import org.testng.annotations.Test;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CountryAccountManagement extends BaseTest{

	@Test(groups = {"categoryMaster" })
	public void ContractSupplierMasteTest() throws Throwable {
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

		

	

	

	


