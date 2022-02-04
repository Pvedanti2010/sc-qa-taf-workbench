package com.supplycopia.template.bulkupload;
import org.testng.annotations.Test;
import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ItemMaster extends BaseTest{

	@Test(groups = {"categoryMaster" })
	public void CategoryMasterManagementTest() throws Throwable {

		new 
		LoginPage().
		login().	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToItemMaster();
		//uploadFromComputer("C:\\Users\\praveen\\Downloads\\IM_Product_Data_2022_1_31 9_20_28.xlsx");
		
	
//		clickProceedToUpload().
//		uploadFromComputer("C:\\Users\\smehta\\eclipse-workspace\\sc-qa-taf-workbench\\src\\test\\resources\\testfiles\\upload\\Category_Master.xlsx").
//		clickImportFile().
//		dragHeader("2", "2").
//		dragHeader("1", "1").
//		proceedToReviewAndEdit().
//		checkValidationErrorsOnReviewAndEdit("0").
//		checktotalRecordsOnReviewAndEdit("4").
//		proceedToUpdate().
//		checkValidationErrorsOnUpdatePage("0").
//		checktotalRecordsOnUpdatePage("4").
//		saveAndUpdate().
//		confirmUpdate().validateSuccessMessage();

	}

		
	}

	

	


