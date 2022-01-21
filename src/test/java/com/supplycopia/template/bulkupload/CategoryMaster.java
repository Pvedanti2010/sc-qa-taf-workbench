package com.supplycopia.template.bulkupload;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class CategoryMaster extends BaseTest{

	@Test(groups = {"categoryMaster" })
	public void CategoryMasterTest() throws Throwable {

		new 
		LoginPage().
		login().	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToBulkUpload().
		validatePageLoad().
		selectDataType("Upload Data Attributes").
		selectCustomeSet("Category Master").
		clickUpload().
		clickProceedToUpload().
		uploadFromComputer("C:\\Users\\smehta\\eclipse-workspace\\sc-qa-taf-workbench\\src\\test\\resources\\testfiles\\upload\\Category_Master.xlsx").
		clickImportFile().
		dragHeader("2", "2").
		dragHeader("1", "1").
		proceedToReviewAndEdit().
		checkValidationErrorsOnReviewAndEdit("0").
		checktotalRecordsOnReviewAndEdit("4").
		proceedToUpdate().
		checkValidationErrorsOnUpdatePage("0").
		checktotalRecordsOnUpdatePage("4").
		saveAndUpdate().
		confirmUpdate().validateSuccessMessage();

	}

}
