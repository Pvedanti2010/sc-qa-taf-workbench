package com.supplycopia.template.bulkupload;
import org.testng.annotations.Test;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductManufacturerMasterManagement extends BaseTest{

	@Test(groups = {"categoryMaster" })
	public void ContractSupplierMasterManagementTest() throws Throwable {

		new 
		LoginPage().
		login().	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToMasterManagement().
		clickProductManufacturerMasterManagement();
		
		

	}

	

	}


