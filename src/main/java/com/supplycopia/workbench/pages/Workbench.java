package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.supplycopia.report.Log;
import com.supplycopia.utils.Pause;

import com.supplycopia.workbench.base.BasePage;



public class Workbench extends BasePage {


	@FindBy(xpath = "//app-workbench-your-apps//div[text()='Your Workbench Apps']" )
	WebElement pageIdentifier_ele;
	@FindBy(xpath = "//app-pricing-table-view//div[text()=' Product Reference No ']" )
	WebElement PricingpageIdentifier_ele;
	
	@FindBy(xpath = "//div[text()='Item Master']/../..//div[@class='arrow arrow-right']" )
	WebElement itemMaster_lnk;
	@FindBy(xpath = "//div[text()='Bulk Upload']/../..//div[@class='arrow arrow-right']" )
	WebElement bulkUpload_lnk;
	@FindBy(xpath = "//div[text()='Master Management']/../..//div[@class='arrow arrow-right']" )
	WebElement masterManagement_lnk;
	
	@FindBy(xpath = "//div[text()='Pricing Database']/../..//div[@class='arrow arrow-right']" )
	WebElement pricingDatabase_lnk;
	
	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-190']")
	WebElement ChechkBox_btn;
	@FindBy(xpath = "//button[contains(.,' Export')]/span[@class='mat-button-wrapper']")
	WebElement export_btn;
	@FindBy(xpath = "//th//mat-checkbox[@class=\"mat-checkbox mat-accent\"]")	
	WebElement Master_checkbox;
	@FindBy(xpath = "//span[@class=\"mat-checkbox-label\" and contains(.,'Select This Page')]")	
	WebElement selectThis_checkbox;
	@FindBy(xpath = "//button[@id=\"exportCardsBtn\" and contains(.,'Export')]")
	WebElement exportButtomTray_btn;
	@FindBy(xpath = "//button//span[@id=\"exportText\"and contains(.,'Bulk Delete')]")
	WebElement bulkDeleteButtomTray_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Product Data')]")
	WebElement selectProductData_btn;
	@FindBy(xpath = "//button//span[@class='mat-button-wrapper'and contains(.,'Columns')]")
	WebElement Column_btn;
	@FindBy(xpath = "//span[@class='mat-checkbox-label'and contains(.,'Deselect All')]")
	WebElement DeselectAll_CheckBox;
	@FindBy(xpath = "//span[@class='mat-checkbox-label' and contains(.,'Select All')]")
	WebElement selectAll_CheckBox;
	@FindBy(xpath = "//td//div//span[@class=\"mat-tooltip-trigger action-edit-icon\"]")
	WebElement Edit_btn;
	@FindBy(xpath = "//span//input[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement productDesc_textBox;
	@FindBy(xpath = "//tbody/tr[1]/td[4]//input")
	WebElement category_textBox;
	@FindBy(xpath = "//select[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement subCategory_InputBox;
	@FindBy(xpath = "//span[@class=\"action-save-icon mr-2\" or contains(.,'Save')]")
	WebElement Save_btn;
	@FindBy(xpath = "//div[@class=\"suggest-box-b1 ng-star-inserted\"]")
	WebElement suggetion_DropDown;
	@FindBy(xpath = "//select[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement ClicksubSuggetion_btn;
	@FindBy(xpath = "//td//div//span[@class=\"mat-tooltip-trigger action-doc-management-icon\"]")
	WebElement documnetManage_btn;	
	@FindBy(xpath = "//img[@ngbtooltip=\"Download the file\"]")
	WebElement downloadSingleFile_btn;
	@FindBy(xpath = "//img[@ngbtooltip=\"Delete the uploaded file\"]")
	WebElement deleteSingleFile_btn;
	@FindBy(xpath = "//button//span[@class=\"deleteText\" and contains(.,'Delete All')]")
	WebElement deleteAll_btn;
	@FindBy(xpath = "//button//span[@class=\"downloadText\" and contains(.,'Download All')]")
	WebElement downloadAll_btn;
	@FindBy(xpath = "//button[@type=\"submit\" and contains(.,'Save')]")
	WebElement saveOnPop_btn;
	@FindBy(xpath = "//input[@id='file']" )
	WebElement importFile_btn;
	@FindBy(xpath = "//tbody//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	private List<WebElement> SubCheckboxes;
	@FindBy(xpath = "//div//button[class=\"btn\" or contains(.,'Mark as functionally equivalent ')]")
	WebElement markAsfunctionallyEquivalent_btn;
	@FindBy(xpath = "//div//button[class=\"btn\" or contains(.,'Bulk Update')]")
	WebElement  bulkUpdate_btn;
	@FindBy(xpath = "//div//button[class=\"btn\" or contains(.,'Bulk Delete ')]")
	WebElement  bulkDelete_btn;
	@FindBy(xpath = "//span[@class=\"mat-tooltip-trigger action-delete-icon\"]")
	WebElement  SignleDelete_btn;
	@FindBy(xpath = "//button[@Class=\"confirmButton\" and contains(.,'Yes')]")
	WebElement  deleteYes_btn;	
	@FindBy(xpath = "//span[@class=\"mat-tooltip-trigger action-functional-equ-icon\"]")
	WebElement  functionallyEquivalent_btn;
	@FindBy(xpath = "//button[@class=\"btn download-button ml-2 ng-star-inserted\" and contains(.,'Download All')]")
	WebElement  funDownloadAll_btn;
	@FindBy(xpath = "//button//span[@class=\"downloadBtnText\" and contains(.,'Delete All')]")
	WebElement  funDeleteAll_btn;
	@FindBy(xpath = "//button[@class=\"btn cancel-button rejectbutton\" and contains(.,'No')]")
	WebElement  funNo_btn;
	@FindBy(xpath = "//button[@class=\"btn save-button\" and contains(.,'Save')]")
	WebElement  funSave_btn;
	@FindBy(xpath = "//li//span[@id=\"next\" and contains(.,'Next')]")
	WebElement  paginationToNext_btn;
	@FindBy(xpath = "//input[@placeholder=\"Category\"]")
	WebElement bulkUpdatCategoryInputBox;
	@FindBy(xpath = "//input[@placeholder=\"Sub Category\"]")
	WebElement bulkUpdatSubCategoryInputBox;
	@FindBy(xpath = "//div//span[@id=\"span-0\"]")
	WebElement bulkUpdatDropdownOption;
	@FindBy(xpath = "//button//span[@class=\"saveText\" or contains(.,'Update')]")
	WebElement bulkUpdate_Btn;
			
	
	
	public Workbench(){	

	}

	public Workbench validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementDisplay(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM));
		ui_IsElementDisplay(ui_waitForElementToDisplay(bulkUpload_lnk,Pause.MEDIUM));
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}
	
	
	public BulkUpload navigateToBulkUpload() {
		// TODO Auto-generated method stub
		ui_click(bulkUpload_lnk, "Bulk Upload link");
		Log.info("Navigating to Preference card");
		return PageFactory.initElements(ui_getUIDriver(), BulkUpload.class);
	}
	public MasterManagement navigateToMasterManagement() {
		// TODO Auto-generated method stub
		ui_click(masterManagement_lnk, "Master Management link");
		Log.info("Navigating to Master Management");
		return PageFactory.initElements(ui_getUIDriver(), MasterManagement.class);
	}

	public ItemMaster navigateToItemMaster() {
		// TODO Auto-generated method stub
		ui_click(itemMaster_lnk, "ItemMasterLink");
		return PageFactory.initElements(ui_getUIDriver(), ItemMaster.class);
	}

	public PricingDatabase navigateToPricingDatabase() {
		// TODO Auto-generated method stub
		ui_click(pricingDatabase_lnk, "PricingDatabase_lnk");
		return PageFactory.initElements(ui_getUIDriver(), PricingDatabase.class);
	}	
}
	
	
		

	
		
		
				
				
		
		
		
	
	
