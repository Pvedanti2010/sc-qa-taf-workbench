package com.supplycopia.bulkupload.mastermanagement;
import org.testng.annotations.Test;

import com.supplycopia.listeners.RetryCountIfFailed;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductManufactureMasterManagement extends BaseTest{
	@Test(groups = {"categoryMaster" ,"Regression"})
	@RetryCountIfFailed(2)
	public void ProductManufactureMasterManagementTest() throws Throwable {
		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().	
		navigateToMasterManagement().
		clickProductManufacture().
		addNewProductManufacture().
		editNewProductManufacture().
		deleteProductManufactureItem().
		bulkDeleteProductManufacture(_session.get_data().get("NumberOfMapping")).	
		exportProductManufacture().
		updateProductManufacture();
		}		
	}

		

	

	

	


