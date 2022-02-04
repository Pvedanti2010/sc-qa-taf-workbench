package com.supplycopia.template.mastermanagement;
import org.testng.annotations.Test;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CategoryMasterManagement extends BaseTest{

	@Test(groups = {"categoryMaster" })
	public void CategoryMasterManagementTest() throws Throwable {

		new 
		LoginPage().
		login().	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().	
		navigateToMasterManagement().
		addNewCategorySubcategory().
		editNewCategorySubcategory().
		deleteCategory().
		bulkDeleteCategory().
		exportCategoryItem().
		updateCategory();
		}		
	}

	

	


