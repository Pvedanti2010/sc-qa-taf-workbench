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

public class CategoryMasterManagement extends BaseTest{

	@Test(groups = {"categoryMaster","sanity" })
	@RetryCountIfFailed(2)
	public void CategoryMasterManagementTest() throws Throwable {

		String category="AutoMainCategory_"+StringUtility.randomGenarotor("number", 4);
		String subCategory="AutoSubCategory_"+StringUtility.randomGenarotor("number", 5);
		String updatedSubCategory="AutoSubCategory_"+StringUtility.randomGenarotor("number", 5);
		String updatedCategory="AutoMainCategory_"+StringUtility.randomGenarotor("number", 4);
	
		
		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().	
		navigateToMasterManagement().
		addNewCategory(category,subCategory).
		editNewCategorySubcategory(updatedCategory,updatedSubCategory).
		deleteMapping().
		bulkDeleteMapping("3").
		exportCategoryItem().
		updateCategory();
		}		
	}

	

	


