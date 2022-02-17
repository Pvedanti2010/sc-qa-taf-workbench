package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.supplycopia.report.Log;
import com.supplycopia.utils.Pause;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.workbench.base.BasePage;



public class Workbench extends BasePage {


	@FindBy(xpath = "//app-workbench-your-apps//div[text()='Your Workbench Apps']" )
	WebElement pageIdentifier_ele;
	@FindBy(xpath = "//div[text()='Bulk Upload']/../..//div[@class='arrow arrow-right']" )
	WebElement bulkUpload_lnk;
	@FindBy(xpath = "//div[text()='Master Management']/../..//div[@class='arrow arrow-right']" )
	WebElement masterManagement_lnk;
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
		Log.info("Navigating to Workbanch");
		return PageFactory.initElements(ui_getUIDriver(), MasterManagement.class);
	}

	public Workbench navigateToItemMaster() {
		// TODO Auto-generated method stub
		ui_click(itemMaster_lnk, "ItemMasterLink");
		return this;
	}
	public Workbench clickSelectAllProductCheckBox() {

		ui_click(Master_checkbox, "Masterchechkbox");
		return this;
	}
	public Workbench clickExportBtn() {
		ui_waitForElementToDisplay(export_btn,10);
		ui_click(export_btn, "ExportButton");
		return this;
	}	
	public Workbench clickSelectThisPage() {
		ui_click(selectThis_checkbox, "SelectThisPage");
		return this;
	}	
	public Workbench clickExportButtonOnBottomTray() {
		ui_click(exportButtomTray_btn,"ExportButtonOnButtomTray");
		return this;
	}
	public Workbench selectProductdataExport() {
		ui_click(selectProductData_btn, "SelectProductdataOnBottomTray");
		return this;
	}	
	
	public Workbench clickColumnDropDown() {		
		ui_waitForElementToDisplay(Column_btn,10);
		ui_click(Column_btn, "ClickColumnButton");	
		return this;
	}	
	public Workbench deselectAllCheckBox() {
		ui_click(DeselectAll_CheckBox, "DeselectAllCheckbox");	
		return this;
	}		
	public Workbench selectAllCheckBox() {
		ui_wait(5);
		ui_waitForElementToDisplay(selectAll_CheckBox,10);
		ui_click(selectAll_CheckBox, "SelectAllchechkbox");	
		return this;
	}	
	public Workbench SelectCheckBox() {
		ui_click(ChechkBox_btn, "Chechkbox");
		return this;
	}		
	public Workbench EditBtn() {
		ui_waitForElementToDisplay(Edit_btn,5);
		Actions ob = new Actions(ui_getUIDriver());
		ob.click(Edit_btn).build().perform();		
		return this;
	}
	public Workbench ClearProductInputBox() {
		ui_clearUsingJavaScript(productDesc_textBox, "productDesc8899");
		return this;
	}
	public Workbench ProductDescInputBox() {
		ui_setvalue(productDesc_textBox, "ProductDiscriopnTextBox","productDesc_"+StringUtility.randomGenarotor("number", 4));
		return this;
	}	
	public Workbench ClearCategoryInputBox() {
		ui_clearUsingJavaScript(category_textBox, "category8899");
		return this;
	}	
	public Workbench SendKeyInputBox() {
		category_textBox.sendKeys("cat");
		ui_wait(3);
		category_textBox.sendKeys("a");
		return this;
	}		
	public Workbench SelectSuggetionDrpdown() {
		ui_waitForElementToDisplay(suggetion_DropDown,10);
		ui_click(suggetion_DropDown, "Suggetion pop-up");
		return this;
	}
	public Workbench clickSubCategoryInputBox() {
		ui_click(subCategory_InputBox,"SubcategoryInputbox");
		return this;
	}
	public Workbench SubSuggetiondropDown() {
		ui_selectValueFromDropDownByIndex(ClicksubSuggetion_btn, 1);
		//ui_click(ClicksubSuggetion_btn,"subSuggetionDropDown");
		return this;
	}
	public Workbench SaveBtn() {
		ui_click(Save_btn, "ClickOnSaveInActionItemBtn");	
		return this;
	}
	public Workbench DocumnetManagebtn() {
		ui_wait(5);
		ui_click(documnetManage_btn, "DocumentManagementInActionItemBtn");	
		return this;
	}	
	public Workbench clickImportFile(String file) {
		importFile_btn.sendKeys(file);		
		return this;
	}
	public Workbench deleteSingleFilebtn() {
		ui_click(deleteSingleFile_btn, "DeleteSingleFileButton");	
		return this;
	}
	public Workbench ClickdeletYes_btn() {
		ui_click(deleteYes_btn, "DeleteYesButton");	
		return this;
	}	
	
	public Workbench DownloadSingleFileBtn() {
		ui_click(downloadSingleFile_btn,"DownloadSigleFileButton");	
		return this;
	}		
	public Workbench DownloadAllBtn() {
		ui_click(downloadAll_btn, "DownloadAllFileBtn");
		return this;
	}		
	public Workbench DeleteAllBtn() {
		ui_click(deleteAll_btn, "DeleteAllFileBtn");
		return this;
	}		
	public Workbench SavePopUpBtn() {
		ui_click(saveOnPop_btn,"SaveOnPopupBtn");
		return this;
	}
	public Workbench clickSelectSubcheckbox() {
		// TODO Auto-generated method stub
		int subcheckboxesSize=SubCheckboxes.size();
		for (int i=subcheckboxesSize-1; i>subcheckboxesSize-3;i--) {
			SubCheckboxes.get(i).click();}
	    return this;
	}
	public Workbench functionallyEquivalentBtn() {
		ui_waitForElementToDisplay(functionallyEquivalent_btn,10);
		ui_click(functionallyEquivalent_btn,"FunctionallyEquivalent");
	    return this;
	}	
	public Workbench clickMarkAsfunctionallyEquivalentBtn () {
		ui_waitForElementToDisplay(markAsfunctionallyEquivalent_btn,4);
		ui_click(markAsfunctionallyEquivalent_btn,"FunctionallyEquivalent");
	    return this;
	}	
	public Workbench ClickbulkUpdate() {
		ui_waitForElementToDisplay(bulkUpdate_btn,4);
		ui_click(bulkUpdate_btn,"FunctionallyEquivalent");
	    return this;
		}
	public Workbench ClickbulkDelete() {
		ui_waitForElementToDisplay(bulkDelete_btn,4);
		ui_click(bulkDelete_btn,"FunctionallyEquivalent");
	    return this;
		}
	public Workbench ClickSinleDelete() {
		ui_waitForElementToDisplay(SignleDelete_btn,4);
		ui_click(SignleDelete_btn,"FunctionallyEquivalent");
	    return this;
		}
	public Workbench ClickfunDownloadAll_Btn() {		
		ui_click(funDownloadAll_btn,"FunctionallyEquivalentDownloadAll");
	    return this;
		}
	public Workbench ClickfunDeleteAll_Btn() {		
		ui_click(funDeleteAll_btn,"FunctionallyEquivalentDeleteAll");
	    return this;
		}
	public Workbench ClickfunNo_Btn() {		
		ui_click(funNo_btn,"ClickNoButton ");
	    return this;
	}
	public Workbench ClickfunSave_Btn() {		
		ui_click(funSave_btn,"FunctionallyEquivalentSaveBtn");
	    return this;
	}	
	public Workbench clickPaginationToNext_Btn() {		
		ui_click(paginationToNext_btn,"NextButtonOnPagination");
	    return this;
		}
	public Workbench clickbulkDeleteButtomTray_Btn() {		
		ui_click(bulkDeleteButtomTray_btn,"bulkDeleteButtomTraybtn");
	    return this;
		}
	public Workbench clickbulkUpdatCategoryInputBox() {		
		ui_click(bulkUpdatCategoryInputBox,"bulkUpdatCategoryInputBox");
	    return this;
		}
	public Workbench clickbulkUpdatSubCategoryInputBox() {		
		ui_click(bulkUpdatSubCategoryInputBox,"bulkUpdatSubCategoryInputBox");
	    return this;
		}
	public Workbench SelectbulkUpdatDropdownOption() {
		ui_waitForElementToDisplay(bulkUpdatDropdownOption,4);
		ui_click(bulkUpdatDropdownOption,"bulkUpdatDropdownOption");
	    return this;
	}	
	public Workbench clickbulkUpdate_Btn() {		
		ui_click(bulkUpdate_Btn,"bulkUpdateBtn");
	    return this;
		}
	public Workbench bulkUpdatCategorySendKeys() {
		bulkUpdatCategoryInputBox.sendKeys("cat");
		return this;
	}
	public Workbench bulkUpdatSubCategorySendKeys() {
		bulkUpdatSubCategoryInputBox.sendKeys("Sub");
		return this;
	}
	
	
	
	
	
	
	
	
	//Group Method////////////////////
	public Workbench exportProductEntries() {
		// TODO Auto-generated method stub
		clickSelectAllProductCheckBox();
		clickExportBtn();
		clickSelectThisPage();
		clickExportButtonOnBottomTray();
		selectProductdataExport();
		return this;
		}

	public Workbench selectAllColumns() {
		// TODO Auto-generated method stub
		clickColumnDropDown();
		deselectAllCheckBox();
		clickColumnDropDown();
		selectAllCheckBox();
		return this;
	}
	public Workbench actionItemToEditFunctionallty() {
		// TODO Auto-generated method stub
		ui_wait(10);
		//SelectCheckBox();
		EditBtn();
		ClearProductInputBox();
		ProductDescInputBox();
		ClearCategoryInputBox();
		SendKeyInputBox();
		SelectSuggetionDrpdown();
		clickSubCategoryInputBox();		
		SubSuggetiondropDown();
		SaveBtn();
		return this;
	}
	public Workbench actionItemToFunctionallyEquivalent() {
		// TODO Auto-generated method stub
		functionallyEquivalentBtn();
		ClickfunDownloadAll_Btn();
		ClickfunDeleteAll_Btn();
		ClickfunNo_Btn();
		ClickfunSave_Btn();		
		return this;
	}
	public Workbench actionItemToSingledeleteFunctionallty() {
		// TODO Auto-generated method stub
		ClickSinleDelete();
		ClickdeletYes_btn();
		return this;
	}
	public Workbench actionItemToDocumnetManagementFunctionallty() {
		// TODO Auto-generated method stub
		DocumnetManagebtn();
		clickImportFile("C:\\Users\\praveen\\Downloads\\Category_Master (31).xlsx");		
		deleteSingleFilebtn();
		DownloadSingleFileBtn();
		DownloadAllBtn();
		DeleteAllBtn();
		SavePopUpBtn();
		return this;
		}
	public Workbench markAsFunctionalEquivalentFunctionallty() {
		// TODO Auto-generated method stub
		ui_wait(10);
		clickSelectSubcheckbox();		
		clickMarkAsfunctionallyEquivalentBtn();
		return this;
	}
	public Workbench bulkUpdateFunctionallty() {
		// TODO Auto-generated method stub
		clickPaginationToNext_Btn();
		ui_wait(10);
		clickSelectSubcheckbox();		
		ClickbulkUpdate();
		clickbulkUpdatCategoryInputBox();
		bulkUpdatCategorySendKeys();
		SelectbulkUpdatDropdownOption();
		clickbulkUpdatSubCategoryInputBox();
		bulkUpdatSubCategorySendKeys();
		SelectbulkUpdatDropdownOption();
		clickbulkUpdate_Btn();		
		return this;
	}

	public Workbench bulkdeleteFunctionallty() {
		// TODO Auto-generated method stub
		ui_wait(10);
		clickPaginationToNext_Btn();
		clickSelectAllProductCheckBox();
		ClickbulkDelete();
		clickSelectThisPage();
		clickbulkDeleteButtomTray_Btn();
		ClickdeletYes_btn();
		return this;
	}
	
	
}
	
	
		

	
		
		
				
				
		
		
		
	
	
