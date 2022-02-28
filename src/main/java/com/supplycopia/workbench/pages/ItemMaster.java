package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.supplycopia.report.Log;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Pause;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.workbench.base.BasePage;



public class ItemMaster extends BasePage {


	@FindBy(xpath = "//div[text()='Item Master']/../..//div[@class='arrow arrow-right']" )
	WebElement itemMaster_lnk;
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
	WebElement column_btn;
	@FindBy(xpath = "//span[@class='mat-checkbox-label'and contains(.,'Deselect All')]")
	WebElement deSelectAll_CheckBox;
	@FindBy(xpath = "//span[@class='mat-checkbox-label' and contains(.,'Select All')]")
	WebElement selectAll_CheckBox;
	@FindBy(xpath = "(//td//div//span[@class=\"mat-tooltip-trigger action-edit-icon\"])[1]")
	WebElement edit_btn;
	@FindBy(xpath = "//span//input[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement productDesc_textBox;
	@FindBy(xpath = "//tbody/tr[1]/td[4]//input")
	WebElement category_textBox;
	@FindBy(xpath = "//select[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement subCategory_InputBox;
	@FindBy(xpath = "//span[@class=\"action-save-icon mr-2\" or contains(.,'Save')]")
	WebElement save_btn;
	@FindBy(xpath = "//div[@class='suggest-box-b1 ng-star-inserted']/div[1]//span")
	WebElement suggetion_DropDownEle_1;
	@FindBy(xpath = "//select[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement clickSubSuggetion_btn;
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
	WebElement  signleDelete_btn;
	@FindBy(xpath = "//button[@Class=\"confirmButton\" and contains(.,'Yes')]")
	WebElement  deleteYes_btn;	
	@FindBy(xpath = "//span[@class=\"mat-tooltip-trigger action-functional-equ-icon\"]")
	WebElement  functionallyEquivalent_btn;
	@FindBy(xpath = "//button[@class=\"btn download-button ml-2 ng-star-inserted\" and contains(.,'Download All')]")
	WebElement  funDownloadAll_btn;
	@FindBy(xpath = "//button//span[@class=\"downloadBtnText\" and contains(.,'Delete All')]")
	WebElement  funDeleteAll_btn;
	@FindBy(xpath = "//button[@class=\"btn cancel-button rejectbutton\" and contains(.,'No')]")
	WebElement  deleteAllEntryNo_btn;
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



	public ItemMaster(){	

	}

	public ItemMaster clickSelectAllProductCheckBox() {

		ui_click(Master_checkbox, "Masterchechkbox");
		return this;
	}
	public ItemMaster clickExportBtn() {
		ui_waitForElementToDisplay(export_btn,10);
		ui_click(export_btn, "ExportButton");
		return this;
	}	
	public ItemMaster clickSelectThisPage() {
		ui_click(selectThis_checkbox, "SelectThisPage");
		return this;
	}	
	public ItemMaster clickExportButtonOnBottomTray() {
		ui_click(exportButtomTray_btn,"ExportButtonOnButtomTray");
		return this;
	}
	public ItemMaster selectProductdataExport() {
		ui_click(selectProductData_btn, "SelectProductdataOnBottomTray");
		return this;
	}	

	public ItemMaster clickColumnDropDown() {		
		ui_waitForElementToDisplay(column_btn,10);
		ui_click(column_btn, "ClickColumnButton");	
		return this;
	}	
	public ItemMaster deselectAllCheckBox() {
		ui_click(deSelectAll_CheckBox, "DeselectAllCheckbox");	
		return this;
	}		
	public ItemMaster selectAllCheckBox() {
		ui_wait(5);
		ui_waitForElementToDisplay(selectAll_CheckBox,10);
		ui_click(selectAll_CheckBox, "SelectAllchechkbox");	
		return this;
	}	
	public ItemMaster SelectCheckBox() {
		ui_click(ChechkBox_btn, "Chechkbox");
		return this;
	}		
	public ItemMaster clickFirstItemEditBtn() {
		ui_waitForElementToDisplay(edit_btn,5);
		ui_ActionClick(edit_btn,"Edit button");		
		return this;
	}
	public ItemMaster clearProductInputBox() {
		ui_clearUsingJavaScript(productDesc_textBox, "productDesc");
		return this;
	}
	public ItemMaster enterProductDesc(String productDesc) {
		ui_setvalue(productDesc_textBox, "ProductDiscriopnTextBox",productDesc);
		return this;
	}	
	public ItemMaster clearCategory() {
		ui_clearUsingJavaScript(category_textBox, "categoryInput");
		return this;
	}	
	public ItemMaster enterCategoryToSearch(String inputs) {
		category_textBox.sendKeys(inputs);
		ui_wait(3);
		return this;
	}		
	public ItemMaster selectCategoryFromDropDown() {
		ui_waitForElementToDisplay(suggetion_DropDownEle_1,10);
		ui_click(suggetion_DropDownEle_1, "Suggetion pop-up");
		return this;
	}
	public ItemMaster clickSubCategoryInputBox() {
		ui_click(subCategory_InputBox,"SubcategoryInputbox");
		return this;
	}
	public ItemMaster selectSubCategoryDropDown() {
		ui_selectValueFromDropDownByIndex(clickSubSuggetion_btn, 1);

		return this;
	}
	public ItemMaster saveBtn() {
		ui_click(save_btn, "ClickOnSaveInActionItemBtn");	
		return this;
	}
	public ItemMaster clickDocumentManagebtn() {
		ui_wait(5);
		ui_click(documnetManage_btn, "DocumentManagementInActionItemBtn");	
		return this;
	}	
	public ItemMaster clickImportFile(String file) {
		ui_wait(2);
		String completeFile = System.getProperty("user.dir")+"/"+Configuration.get("uploadFilePath")+"//"+file;
		//ui_waitForElementToDisplay(fileUploadPopUp_btn, Pause.MEDIUM);
		importFile_btn.sendKeys(completeFile);
		return this;

	}
	public ItemMaster clickDeleteSingleFile() {
		ui_click(deleteSingleFile_btn, "DeleteSingleFileButton");	
		return this;
	}
	public ItemMaster clickDeletYes() {
		ui_click(deleteYes_btn, "DeleteYesButton");	
		return this;
	}	

	public ItemMaster clickDownloadSingleFile() {
		ui_click(downloadSingleFile_btn,"DownloadSigleFileButton");	
		return this;
	}		
	public ItemMaster clickDownloadAll() {
		ui_click(downloadAll_btn, "DownloadAllFileBtn");
		return this;
	}		
	public ItemMaster deleteAllBtn() {
		ui_click(deleteAll_btn, "DeleteAllFileBtn");
		return this;
	}		
	public ItemMaster clickSavePopUp() {
		ui_click(saveOnPop_btn,"SaveOnPopupBtn");
		return this;
	}
	public ItemMaster clickProductCheckbox() {
		// TODO Auto-generated method stub
		int subcheckboxesSize=SubCheckboxes.size();
		for (int i=subcheckboxesSize-1; i>subcheckboxesSize-3;i--) {
			SubCheckboxes.get(i).click();}
		return this;
	}
	public ItemMaster clickfunctionallyEquivalentButton() {
		ui_waitForElementToDisplay(functionallyEquivalent_btn,10);
		ui_click(functionallyEquivalent_btn,"FunctionallyEquivalent");
		return this;
	}	
	public ItemMaster clickMarkAsfunctionallyEquivalent() {
		ui_waitForElementToDisplay(markAsfunctionallyEquivalent_btn,4);
		ui_click(markAsfunctionallyEquivalent_btn,"FunctionallyEquivalent");
		return this;
	}	
	public ItemMaster clickBulkUpdate() {
		ui_waitForElementToDisplay(bulkUpdate_btn,4);
		ui_click(bulkUpdate_btn,"FunctionallyEquivalent");
		return this;
	}
	public ItemMaster clickBulkDelete() {
		ui_waitForElementToDisplay(bulkDelete_btn,4);
		ui_click(bulkDelete_btn,"FunctionallyEquivalent");
		return this;
	}
	public ItemMaster clickSinleDelete() {
		ui_click(signleDelete_btn,"FunctionallyEquivalent");
		return this;
	}
	public ItemMaster clickFunDownloadAll() {		
		ui_click(funDownloadAll_btn,"FunctionallyEquivalentDownloadAll");
		return this;
	}
	public ItemMaster clickFunDeleteAll() {		
		ui_click(funDeleteAll_btn,"FunctionallyEquivalentDeleteAll");
		return this;
	}
	public ItemMaster clickDeleteAll_No() {		
		ui_click(deleteAllEntryNo_btn,"ClickNoButton ");
		return this;
	}
	public ItemMaster clickFunEquivalentSavePopUp() {		
		ui_click(funSave_btn,"FunctionallyEquivalentSaveBtn");
		return this;
	}	
	public ItemMaster clickPaginationNext() {		
		ui_click(paginationToNext_btn,"NextButtonOnPagination");
		return this;
	}
	public ItemMaster clickBulkDeleteButtomTray() {		
		ui_click(bulkDeleteButtomTray_btn,"bulkDeleteButtomTraybtn");
		return this;
	}
	public ItemMaster clickbulkUpdatCategoryInputBox() {		
		ui_click(bulkUpdatCategoryInputBox,"bulkUpdatCategoryInputBox");
		return this;
	}
	public ItemMaster clickbulkUpdatSubCategoryInputBox() {		
		ui_click(bulkUpdatSubCategoryInputBox,"bulkUpdatSubCategoryInputBox");
		return this;
	}
	public ItemMaster selectBulkUpdatDropdown() {
		ui_waitForElementToDisplay(bulkUpdatDropdownOption,4);
		ui_click(bulkUpdatDropdownOption,"bulkUpdatDropdownOption");
		return this;
	}	
	public ItemMaster clickbulkUpdate_Btn() {		
		ui_click(bulkUpdate_Btn,"bulkUpdateBtn");
		return this;
	}
	public ItemMaster bulkUpdatCategorySendKeys() {
		bulkUpdatCategoryInputBox.sendKeys("cat");
		return this;
	}
	public ItemMaster bulkUpdatSubCategorySendKeys() {
		bulkUpdatSubCategoryInputBox.sendKeys("Sub");
		return this;
	}





	public ItemMaster exportProductEntries() {

		clickSelectAllProductCheckBox();
		clickExportBtn();
		clickSelectThisPage();
		clickExportButtonOnBottomTray();
		selectProductdataExport();
		return this;
	}

	public ItemMaster selectAllColumns() {
		// TODO Auto-generated method stub
		clickColumnDropDown();
		deselectAllCheckBox();
		clickColumnDropDown();
		selectAllCheckBox();
		return this;
	}
	public ItemMaster editProductEntry(String prodDesc, String categoryToSearch) {
		// TODO Auto-generated method stub
		ui_wait(10);
		//SelectCheckBox();
		clickFirstItemEditBtn();
		clearProductInputBox();
		enterProductDesc(prodDesc);
		clearCategory();
		enterCategoryToSearch(categoryToSearch);
		selectCategoryFromDropDown();
		clickSubCategoryInputBox();		
		selectSubCategoryDropDown();
		saveBtn();
		return this;
	}
	public ItemMaster validateFunctionallyEquivalent() {
		// TODO Auto-generated method stub
		clickfunctionallyEquivalentButton();
		clickFunDownloadAll();
		clickFunDeleteAll();
		clickDeleteAll_No();
		clickFunEquivalentSavePopUp();		
		return this;
	}
	public ItemMaster deleteSingleProduct() {
		// TODO Auto-generated method stub
		clickSinleDelete();
		clickDeletYes();
		return this;
	}
	public ItemMaster validateDocumentManagement(String file) {
		// TODO Auto-generated method stub
		clickDocumentManagebtn();
		clickImportFile(file);		
		clickDeleteSingleFile();
		clickDownloadSingleFile();
		clickDownloadAll();
		deleteAllBtn();
		clickSavePopUp();
		return this;
	}
	public ItemMaster markAsFunctionalEquivalentFunctionallty() {
		// TODO Auto-generated method stub
		ui_wait(10);
		clickProductCheckbox();		
		clickMarkAsfunctionallyEquivalent();
		return this;
	}
	public ItemMaster validateBulkUpdateFunctionality() {
		// TODO Auto-generated method stub
		clickPaginationNext();
		ui_wait(10);
		clickProductCheckbox();		
		clickBulkUpdate();
		clickbulkUpdatCategoryInputBox();
		bulkUpdatCategorySendKeys();
		selectBulkUpdatDropdown();
		clickbulkUpdatSubCategoryInputBox();
		bulkUpdatSubCategorySendKeys();
		selectBulkUpdatDropdown();
		clickbulkUpdate_Btn();		
		return this;
	}

	public ItemMaster validateBulkdeleteFunctionality() {
		// TODO Auto-generated method stub
		ui_wait(10);
		clickPaginationNext();
		clickSelectAllProductCheckBox();
		clickBulkDelete();
		clickSelectThisPage();
		clickBulkDeleteButtomTray();
		clickDeletYes();
		return this;
	}


}














