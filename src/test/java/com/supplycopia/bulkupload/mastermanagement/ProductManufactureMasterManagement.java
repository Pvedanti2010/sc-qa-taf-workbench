package com.supplycopia.bulkupload.mastermanagement;
import org.testng.annotations.Test;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ProductManufactureMasterManagement extends BaseTest{

	@Test(groups = {"categoryMaster" ,"sanity"})
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
		bulkDeleteProductManufacture("3").		
		exportProductManufacture().
		updateProductManufacture();
		}		
	}

		

	

	

	


