package com.supplycopia.workbench.pages;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.supplycopia.report.Log;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;



public class ItemMaster extends BasePage {

	String rowelement_editIcon="(//td/div//span[contains(@class,'edit-icon')])[%s]";
	String rowelement_editHistory="//tbody/tr[%s]//span[contains(@class,'action-info-icon')]";
	String rowelement_deleteIcon="//tbody/tr[%s]//span[contains(@class,'action-delete-icon')]";
	
	
	@FindBy(xpath = "//div[text()='Item Master']/../..//div[@class='arrow arrow-right']" )
	WebElement itemMaster_lnk;
	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-190']")
	WebElement ChechkBox_btn;
	@FindBy(xpath = "//button[contains(.,' Export')]")
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
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div/span[1][contains(@class,'action-edit-icon')]")
	WebElement edit_btn;
	@FindBy(xpath = "//input[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement productDesc_textBox;
	@FindBy(xpath = "//tbody/tr[1]/td[4]//input")
	WebElement category_textBox;
	@FindBy(xpath = "//select[@class=\"form-control description-field ng-star-inserted\"]")
	WebElement subCategory_InputBox;
	@FindBy(xpath = "//span[@class=\"action-save-icon mr-2\" or contains(.,'Save')]")
	WebElement save_btn;
	@FindBy(xpath = "//select[@name=\"category\"]")
	WebElement selectCategoryDropDown;
	@FindBy(xpath = "//span//select[@name=\"subcategory\"]")
	WebElement selectSubCategoryDropdown;
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
	@FindBy(xpath = "//tbody//span[contains(@class,'mat-checkbox-inner')]")
	private List<WebElement> SubCheckboxes;
	@FindBy(xpath = "//button[contains(.,'Mark as functionally equivalent ')]")
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
	@FindBy(xpath = "//button[contains(.,'Download All')]")
	WebElement  funDownloadAll_btn;
	@FindBy(xpath = "//button//span[contains(.,'Delete All')]")
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
	@FindBy(xpath = "//app-table-view[contains(.,'Product Reference No')]" )
	WebElement ItemMasterpageIdentifier_ele;
	@FindBy(xpath = "//table/tbody/tr/td/span[contains(span,text())]")
	WebElement productPricetableIdentifier;
	@FindBy(xpath = "//th[text()=' Product Description ']")
	WebElement productDescHeader;
	@FindBy(xpath = "//span[contains(.,'Columns')]//mat-icon[contains(.,'keyboard_arrow_down')]")
	WebElement ColumnDropDown;
	
	@FindBy(xpath = "//div[@role='menu']//span[contains(.,' Product Description ') and @class='mat-checkbox-label']/../span[@class='mat-checkbox-inner-container']")
	WebElement productDescOption;
	@FindBy(xpath = "//mat-dialog-container[@role='dialog']")
	WebElement changeHistoryDialog;


	public ItemMaster(){	

	}

	/**
	 * This method will select all check boxes in Item master
	 * @return
	 */
	public ItemMaster clickSelectAllProductCheckBox() {

		ui_click(Master_checkbox, "Masterchechkbox");
		return this;
	}
	/**
	 * This method will click the export button in Item master
	 * @return
	 */
	public ItemMaster clickExportBtn() {
		ui_waitForElementToDisplay(export_btn,Pause.MEDIUM);
		ui_click(export_btn, "ExportButton");
		return this;
	}	
	/**
	 * This method will select this check box on the bottom tray in Item master
	 * @return
	 */
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
		ui_waitForElementToDisplay(column_btn,Pause.MEDIUM);
		ui_click(column_btn, "ClickColumnButton");	
		return this;
	}	
	public ItemMaster deselectAllCheckBox() {
		ui_click(deSelectAll_CheckBox, "DeselectAllCheckbox");	
		return this;
	}		
	public ItemMaster selectAllCheckBox() {
		ui_wait(5);
		ui_waitForElementToDisplay(selectAll_CheckBox,Pause.MEDIUM);
		ui_click(selectAll_CheckBox, "SelectAllchechkbox");	
		return this;
	}	
	public ItemMaster SelectCheckBox() {
		ui_click(ChechkBox_btn, "Chechkbox");
		return this;
	}		
	public ItemMaster clickFirstItemEditBtn() {
		ui_IsElementDisplay(ui_waitForElementToDisplay(edit_btn,Pause.MEDIUM));		
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
	public ItemMaster selectCategoryFromDropDown(String str) {
		ui_waitForElementToDisplay(selectCategoryDropDown, Pause.MEDIUM);
		ui_selectValueFromDropDownByText(selectCategoryDropDown, str);		
		ui_click(selectCategoryDropDown,"selectCategoryDropDownValue");
		return this;
	}
	public ItemMaster selectSubCategoryDropDown(String str) {
		ui_waitForElementToDisplay(selectSubCategoryDropdown,Pause.MEDIUM);
		ui_selectValueFromDropDownByText(selectSubCategoryDropdown, str);			
	 
		
		return this;
	}
	public ItemMaster clickOnSaveBtn() {
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
		ui_waitForElementToDisplay(functionallyEquivalent_btn,Pause.LOW);
		ui_click(functionallyEquivalent_btn,"FunctionallyEquivalent");
		return this;
	}	
	public ItemMaster clickMarkAsfunctionallyEquivalent() {
		ui_waitForElementToDisplay(markAsfunctionallyEquivalent_btn,Pause.LOW);
		ui_click(markAsfunctionallyEquivalent_btn,"FunctionallyEquivalent");
		return this;
	}	
	public ItemMaster clickBulkUpdate() {
		ui_waitForElementToDisplay(bulkUpdate_btn,Pause.MEDIUM);
		ui_click(bulkUpdate_btn,"FunctionallyEquivalent");
		return this;
	}
	public ItemMaster clickBulkDelete() {
		ui_waitForElementToDisplay(bulkDelete_btn,Pause.MEDIUM);
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
		ui_waitForElementToDisplay(bulkUpdatDropdownOption,Pause.MEDIUM);
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
	public ItemMaster validateItemMasPageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementDisplay(ui_waitForElementToDisplay(ItemMasterpageIdentifier_ele,Pause.MEDIUM));		
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}




	
	/**
	 * This method will validate the export Functionally in Item master
	 * This method will export the Item Master data
	 * @return
	 */
	public ItemMaster exportProductEntries() {

		clickSelectAllProductCheckBox();
		clickExportBtn();
		clickSelectThisPage();
		clickExportButtonOnBottomTray();
		selectProductdataExport();
		return this;
	}

	/**
	 * This method will check and un-check column in the Item Master data
	 * @return
	 */
	public ItemMaster selectAllColumns() {
		// TODO Auto-generated method stub
		clickColumnDropDown();
		deselectAllCheckBox();
		clickColumnDropDown();
		selectAllCheckBox();
		return this;
	}
	/**
	 * This method edit the product entries the Item Master data
	 * @param prodDesc
	 * @param categoryToSearch
	 * @return
	 */
	public ItemMaster editProductEntry(String prodDesc, String categoryToSearch) {
		// TODO Auto-generated method stub
		ui_wait(10);		
		clickFirstItemEditBtn();
		clearProductInputBox();
		enterProductDesc(prodDesc);		
		return this;
	}
	/**
	 * This method validate the Functionally Equivalent in Item Master data
	 * @return
	 */
	public ItemMaster validateFunctionallyEquivalent() {
		// TODO Auto-generated method stub
		clickfunctionallyEquivalentButton();
		clickFunDownloadAll();
		clickFunDeleteAll();
		clickDeleteAll_No();
		clickFunEquivalentSavePopUp();		
		return this;
	}
	/**
	 * 
	 * @return
	 */
	public ItemMaster deleteSingleProduct() {
		// TODO Auto-generated method stub
		clickSinleDelete();
		clickDeletYes();
		return this;
	}
	/**
	 * This method upload the document in the Document Management in Item Master data
	 * @param file
	 * @return
	 */
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
	/**
	 * This method will marks as Functional Equivalent Functionally in Item master
	 * @return
	 */
	public ItemMaster markAsFunctionalEquivalentFunctionallty() {
		// TODO Auto-generated method stub
		ui_wait(10);
		clickProductCheckbox();		
		clickMarkAsfunctionallyEquivalent();
		return this;
	}
	/**
	 * This method will validate the bulk update Functionally in Item master
	 * @return
	 */
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

	/**
	 * This method will validate the bulk delete Functionally in Item master
	 * @return
	 */
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

	public void validateItemMasterPageLoad() {
		// TODO Auto-generated method stub
		
	}

	public ItemMaster validateColumnPresent(String choice,boolean value) {
		ui_waitForElementToDisplay(productPricetableIdentifier, Pause.HIGH);
		switch(choice) {
		case " Product Description ":Assert.assertEquals(ui_IsElementPresent(productDescHeader,"10"), value);
		break;
		default:
			Assert.assertTrue(value);
		
		}
		return this;	
	}
	public ItemMaster clickColumns() {
		// TODO Auto-generated method stub
		ui_click(ColumnDropDown, "");
		return this;
	}
	public ItemMaster selectColumnAccount() {
		// TODO Auto-generated method stub
		ui_click(productDescOption, "");
		return this;
	}
	

}














