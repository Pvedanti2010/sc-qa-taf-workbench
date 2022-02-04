package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.supplycopia.report.Log;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.utils.Wait;
import com.supplycopia.workbench.base.BasePage;



public class BulkUpload extends BasePage {

	//div[text()='All Done!']
	
	
	@FindBy(xpath = "//ul[@class='process-step']/li/span[text()='File Upload']" )
	WebElement pageIdentifier_ele;
	
	@FindBy(xpath = "//select[@formcontrolname='dataType']" )
	WebElement dataType_sel;
	
	@FindBy(xpath = "//select[@formcontrolname='customSet']" )
	WebElement customeSet_sel;
	
	@FindBy(xpath = "//button[text()='Upload']" )
	WebElement upload_btn;
	
	@FindBy(xpath = "//button/span[text()='Proceed To Upload']" )
	WebElement proceedToUpload_btn;
	
	@FindBy(xpath = "//input[@id='fileDropRef']" )
	WebElement uploadFile_txt;
	
	@FindBy(xpath = "//button[@class='importBtn']" )
	WebElement importFile_btn;
	
	@FindBy(xpath = "//button[@class='saveBtn']" )
	WebElement saveAndProceed_btn;
	
	@FindBy(xpath = "//a[@class='text-danger']" )
	WebElement validationIssues;
	
	@FindBy(xpath = "//span[@class='totalCount']" )
	WebElement totalRecords;
	
	@FindBy(xpath = "//app-confirm-dialog//button[text()='Yes']" )
	WebElement updateConfirmation;
	
	@FindBy(xpath = "//app-workbench-success-dialog//p[contains(text(),'All the attributes have been update')]")
	WebElement successMessage;
	@FindBy(xpath = "//button[@class=\"mat-focus-indicator btn functionality-equi-button functionality-equi-button-enabled mat-button mat-button-base\" and contains(.,' Add New ')]")
	WebElement addNew_btn;
	@FindBy(xpath = "//input[@id=\"yes\" or contains(.,'Add New main category')]")
	WebElement radioUpper_Btn;
	@FindBy(xpath = "//input[@formcontrolname=\"category\"]")
	WebElement textBox1;
	@FindBy(xpath = "//input[@formcontrolname=\"subCategory\"]")
	WebElement textBox2;
	@FindBy(xpath = "//button//span[@class=\"mat-button-wrapper\" and contains(.,'Save')]")
	WebElement saveAddNew_btn;
	@FindBy(xpath = "//input[@id=\"no\" or contains(.,'Add New main category')]")
	WebElement chooseCatName_radioBtn;
	@FindBy(xpath = "//img[@src=\"/assets/images/icons_svg/edit_deactive.svg\"]")
	WebElement catEdit_btn;
	@FindBy(xpath = "//div[@id='mat-autocomplete-2']")
	WebElement catSelect;
	@FindBy(xpath = "//span[@class=\"cursor-pointer action-link\"]")
	WebElement Delete_btn;
	@FindBy(xpath = "//button[@class=\"btn save-button confirmButton\" and contains(.,'Yes')]")
	WebElement clickYes_btn;
	@FindBy(xpath = "//tbody//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	private List<WebElement> SubCheckboxes;
	@FindBy(xpath = "//button[@class=\"btn functionality-equi-button float-right mr-2 bulkDeleteButton\" and contains(.,'Bulk Delete')]")
	WebElement bulkDelete_btn;
	@FindBy(xpath = "//button[contains(.,' Export')]/span[@class='mat-button-wrapper']")
	WebElement export_btn;
	@FindBy(xpath = "//th//mat-checkbox[@class=\"mat-checkbox mat-accent\"]")	
	WebElement Master_checkbox;
	@FindBy(xpath = "//button[@id=\"exportCardsBtn\" and contains(.,'Export')]")
	WebElement exportButtomTray_btn;
	@FindBy(xpath = "//button[@class=\"mat-menu-trigger btn functionality-equi-button functionality-equi-button-enabled ng-star-inserted\" and contains(.,'Update')]")
	WebElement update_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Category')]")
	WebElement updateItem_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Supplier')]")
	WebElement updateSupplierItem_btn;	
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Country')]")
	WebElement UpdateCountryItem_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Manufacturer')]")
	WebElement UpdateManufacturer_btn;
	@FindBy(xpath = "//input[@formcontrolname=\"subCategory\"]")
	WebElement choose_textbox;
	@FindBy(xpath = "//span[@class=\"mat-option-text\"]")
	WebElement selectDropDownValue;
	@FindBy(xpath = "//input[@formcontrolname=\"category\"]")
	WebElement enterRename;
	@FindBy(xpath = "//button//span[@class=\"mat-button-wrapper\" and contains(.,\"Update\")]")
	WebElement updateValue_btn;
	@FindBy(xpath = "//div[@role=\"tab\" and contains(.,'Contract Supplier Master')]")
	WebElement ContractSupplierMaster_btn;
	@FindBy(xpath = "//div[@role=\"tab\" and contains(.,'Country Account Master')]")
	WebElement countryAccountMaster_btn;	
	@FindBy(xpath = "//div[@role=\"tab\" and contains(.,'Product Manufacturer Master')]")
	WebElement ProductManufacturerMaster_btn;
	
	String ListFromMatch="//div[@id='cdk-drop-list-1']/div[%s]/span";
	String ListToMatch="//div[@id='cdk-drop-list-0']/div[%s]";
	
	
	public BulkUpload(){	
    		
	}

	public BulkUpload validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementPresent(ui_waitForElementToAppear(pageIdentifier_ele,Wait.MEDIUM));
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}

	public BulkUpload navigateToBulkUpload() {
		// TODO Auto-generated method stub
		Log.info("Navigating to Preference card");
	    return PageFactory.initElements(ui_getUIDriver(), BulkUpload.class);
	}
	
	public BulkUpload selectDataType(String dataType) {
		// TODO Auto-generated method stub
		ui_selectValueFromDropDownByText(dataType_sel, dataType);
	    return this;
	}
	
	public BulkUpload selectCustomeSet(String customeSet) {
		// TODO Auto-generated method stub
		ui_wait(2);
		ui_selectValueFromDropDownByText(customeSet_sel, customeSet);
	    return this;
	}
	
	public BulkUpload clickUpload() {
		// TODO Auto-generated method stub
		ui_click(upload_btn, "Upload button");
	    return this;
	}
	
	public BulkUpload clickProceedToUpload() {
		// TODO Auto-generated method stub
		ui_click(proceedToUpload_btn, "Proceed To Upload button");
	    return this;
	}
	
	public BulkUpload uploadFromComputer(String file) {
		// TODO Auto-generated method stub
		ui_wait(2);
		uploadFile_txt.sendKeys(file);
	    return this;
	}
	public BulkUpload clickImportFile() {
		// TODO Auto-generated method stub
		ui_click(importFile_btn, "Proceed To Upload button");
	    return this;
	}
	
	public BulkUpload dragHeader(String fromRowItem,String toRowItem) {
		// TODO Auto-generated method stub
		ui_wait(2);
		ui_clickHoldAndDrop(ui_getElementWithXpath(String.format(ListFromMatch,fromRowItem)),ui_getElementWithXpath(String.format(ListToMatch, toRowItem)));
	    return this;
	}
	
	public BulkUpload proceedToReviewAndEdit() {
		// TODO Auto-generated method stub
		ui_click(saveAndProceed_btn,"proceedToReview&Edit");
	    return this;
	}
	
	public BulkUpload checkValidationErrorsOnReviewAndEdit(String numberOfError) {
		// TODO Auto-generated method stub]
		ui_wait(4);
		ui_isElementContainsText(validationIssues, String.format("%s validation issues found",numberOfError));
		return this;
	}
	
	public BulkUpload checktotalRecordsOnReviewAndEdit(String numberOfRecords) {
		// TODO Auto-generated method stub
	  
		ui_isElementContainsText(totalRecords, String.format("%s records found",numberOfRecords));
		return this;
	}
	
	public BulkUpload proceedToUpdate() {
		// TODO Auto-generated method stub
		ui_click(saveAndProceed_btn,"proceedToUpdate");
		return this;
	} 
	
	public BulkUpload checkValidationErrorsOnUpdatePage(String numberOfError) {
		// TODO Auto-generated method stub
		ui_wait(4);
		ui_isElementContainsText(validationIssues, String.format("%s validation issues found",numberOfError));
		return this;
	}
	
	public BulkUpload checktotalRecordsOnUpdatePage(String numberOfRecords) {
		// TODO Auto-generated method stub
		ui_isElementContainsText(totalRecords, String.format("%s records found",numberOfRecords));
		return this;
	}
	public BulkUpload saveAndUpdate() {
		// TODO Auto-generated method stub
		ui_click(saveAndProceed_btn,"proceedToUpdate");
		return this;
	} 
	public BulkUpload confirmUpdate() {
		// TODO Auto-generated method stub
        ui_click(updateConfirmation, "Confirmation Yes button");
		return this;
	}
	
	public BulkUpload validateSuccessMessage() {
		ui_IsElementPresent(ui_waitForElementToAppear(successMessage, Wait.HIGH));
		return this;	
	}
     //Categogory Master
	public BulkUpload clickCategoryManagement() {
		// TODO Auto-generated method stub
		ui_click(addNew_btn,"AddNewCategory");	
		ui_waitForElementToAppear(radioUpper_Btn, 2);
		ui_click(radioUpper_Btn, "AddNewMainCategory");		
		ui_setvalue(textBox1, "Text box", "AutoCategory_"+StringUtility.randomGenarotor("number", 4));
		ui_wait(2);		
		ui_setvalue(textBox2, "Text box", "AutoSubCategory_"+StringUtility.randomGenarotor("number", 4));		
		ui_wait(2);
		ui_click(saveAddNew_btn, "SaveAddNewCategory");
		ui_wait(5);
		ui_click(catEdit_btn, "Category edit btn");
		ui_click(radioUpper_Btn, "editNewMainCategory");
		ui_wait(5);
		ui_clearUsingJavaScript(textBox1, "AutomationCategoryTest name29");
		ui_wait(5);
		ui_setvalue(textBox1, "Text box", "AutomationCategory_"+StringUtility.randomGenarotor("number", 4));	
		ui_wait(5);
		ui_click(saveAddNew_btn, "Save add new category");
		ui_wait(5);
		ui_click(Delete_btn, "category delete");
		ui_wait(5);
		ui_click(clickYes_btn, "YES button on delete popup");
		int subcheckboxesSize=SubCheckboxes.size();
		for (int i =subcheckboxesSize-1; i>subcheckboxesSize-4; i--) {
			SubCheckboxes.get(i).click();}	
		ui_click(bulkDelete_btn, "Bulk delete button");
		ui_click(clickYes_btn, "Click Yes button on bulk delete popup" );
		ui_wait(5);
		ui_click(Master_checkbox, "Select Master Check box");
		ui_wait(2);
		ui_click(export_btn, "Export category button");
		ui_wait(2);
		ui_click(exportButtomTray_btn, "Export buttom tray");
		ui_wait(5);
		ui_click(Master_checkbox, "Select Master Check box");
		ui_wait(2);
		ui_click(update_btn, "Click on update button");
		ui_wait(2);
		ui_click(updateItem_btn, "Update category button");
		ui_wait(2);
		ui_click(choose_textbox, "choose main category");
		ui_wait(2);
		choose_textbox.sendKeys("A");
		ui_wait(2);
		ui_click(selectDropDownValue, "Select category from drop-down");
		ui_wait(2);
		ui_click(enterRename, "Enter rename category");
		ui_wait(2);		
		ui_setvalue(enterRename, "Text box", "NewAutomationCategory_"+StringUtility.randomGenarotor("number", 4));	
		ui_wait(2);
		ui_click(updateValue_btn, "update category");
		ui_wait(5);
		
	
		return this;
	}
	//ContracSupplier Master
		public BulkUpload clickContracSuppliertMasterManagement() {
			ui_click(ContractSupplierMaster_btn, "ContractSupplierMaster");
			ui_click(addNew_btn,"AddNewsupplier");	
			ui_waitForElementToAppear(radioUpper_Btn, 2);
			ui_click(radioUpper_Btn, "AddNewSupplier");		
			ui_setvalue(textBox1, "Text box", "AddNewSupplier_"+StringUtility.randomGenarotor("number", 4));
			ui_wait(2);		
			ui_setvalue(textBox2, "Text box", "AddContractId_"+StringUtility.randomGenarotor("number", 4));		
			ui_wait(2);
			ui_click(saveAddNew_btn, "SaveAddNewsupplier");
			ui_wait(5);
			ui_click(catEdit_btn, "supplierEditBtn");
			ui_click(radioUpper_Btn, "editNewSupplier");
			ui_wait(5);
			ui_clearUsingJavaScript(textBox1, "Automation Testname");
			ui_wait(5);
			ui_setvalue(textBox1, "Text box", "Automationsupplier_"+StringUtility.randomGenarotor("number", 4));	
			ui_wait(5);
			ui_click(saveAddNew_btn, "saveAddNewSupplier");
			ui_wait(5);
			ui_click(Delete_btn, "supplierDelete");
			ui_wait(5);
			ui_click(clickYes_btn, "YES button on delete popup");
			int subcheckboxesSize=SubCheckboxes.size();
			for (int i =subcheckboxesSize-1; i>subcheckboxesSize-4; i--) {
				SubCheckboxes.get(i).click();}	
			ui_click(bulkDelete_btn, "Bulk delete button");
			ui_click(clickYes_btn, "Click Yes button on bulk delete popup" );
			ui_wait(5);
			ui_click(Master_checkbox, "Select Master Check box");
			ui_wait(2);
			ui_click(export_btn, "Export supplier button");
			ui_wait(2);
			ui_click(exportButtomTray_btn, "Export buttom tray");
			ui_wait(5);
			ui_click(Master_checkbox, "Select Master Check box");
			ui_wait(2);
			ui_click(update_btn, "Click on update button");
			ui_wait(2);
			ui_click(updateSupplierItem_btn, "Update supplier button");
			ui_wait(2);
			ui_click(choose_textbox, "choose main supplier");
			ui_wait(2);
			choose_textbox.sendKeys("S");
			ui_wait(2);
			ui_click(selectDropDownValue, "Select category from drop-down");
			ui_wait(2);
			ui_click(enterRename, "Enter rename Supplier");
			ui_wait(2);		
			ui_setvalue(enterRename, "Text box", "NewAutomationSupplier_"+StringUtility.randomGenarotor("number", 4));	
			ui_wait(2);
			ui_click(updateValue_btn, "update Supplier");
			ui_wait(5);
			
			
			return this;
			// TODO Auto-generated method stub
}
		//Country Account Master
	public BulkUpload clickCountryAccountMasterManagement() {
			ui_click(countryAccountMaster_btn, "Country Account Master");
			ui_click(addNew_btn,"AddNewCountry");	
			ui_waitForElementToAppear(radioUpper_Btn, 2);
			ui_click(radioUpper_Btn, "AddNewCountry");		
			ui_setvalue(textBox1, "Text box", "AddNewCountry_"+StringUtility.randomGenarotor("number", 4));
			ui_wait(2);		
			ui_setvalue(textBox2, "Text box", "AddAccount_"+StringUtility.randomGenarotor("number", 4));		
			ui_wait(2);
			ui_click(saveAddNew_btn, "SaveAddNewCountry");
			ui_wait(5);
			ui_click(catEdit_btn, "CountryEditBtn");
			ui_click(radioUpper_Btn, "editNewCountry");
			ui_wait(5);
			ui_clearUsingJavaScript(textBox1, "AutomationCountryTestname");
			ui_wait(5);
			ui_setvalue(textBox1, "Text box", "AutomationCountry_"+StringUtility.randomGenarotor("number", 4));	
			ui_wait(5);
			ui_click(saveAddNew_btn, "saveAddNewCountry");
			ui_wait(5);
			ui_click(Delete_btn, "CountryDelete");
			ui_wait(5);
			ui_click(clickYes_btn, "YES button on delete popup");
			int subcheckboxesSize=SubCheckboxes.size();
			for (int i =subcheckboxesSize-1; i>subcheckboxesSize-4; i--) {
				SubCheckboxes.get(i).click();}	
			ui_click(bulkDelete_btn, "Bulk delete button");
			ui_click(clickYes_btn, "Click Yes button on bulk delete popup" );
			ui_wait(5);
			ui_click(Master_checkbox, "Select Master Check box");
			ui_wait(2);
			ui_click(export_btn, "ExportCountryAccountButton");
			ui_wait(2);
			ui_click(exportButtomTray_btn, "Export buttom tray");
			ui_wait(5);
			ui_click(Master_checkbox, "Select Master Check box");
			ui_wait(2);
			ui_click(update_btn, "Click on update button");
			ui_wait(2);
			ui_click(UpdateCountryItem_btn, "Update Country button");
			ui_wait(2);
			ui_click(choose_textbox, "choose main Country");
			ui_wait(2);
			choose_textbox.sendKeys("A");
			ui_wait(2);
			ui_click(selectDropDownValue, "Select category from drop-down");
			ui_wait(2);
			ui_click(enterRename, "Enter rename Country");
			ui_wait(2);		
			ui_setvalue(enterRename, "Text box", "NewAutomationCountry_"+StringUtility.randomGenarotor("number", 4));	
			ui_wait(2);
			ui_click(updateValue_btn, "update Country");
			ui_wait(5);
			
			
			return this;
		}

	public BulkUpload clickProductManufacturerMasterManagement() {
		// TODO Auto-generated method stub
		ui_click(ProductManufacturerMaster_btn, "ProductManufacturerMaster");		
		ui_click(addNew_btn,"AddNewCountry");	
		ui_waitForElementToAppear(radioUpper_Btn, 2);
		ui_click(radioUpper_Btn, "AddNewManufacturer");		
		ui_setvalue(textBox1, "Text box", "AddNewManufacturer_"+StringUtility.randomGenarotor("number", 4));
		ui_wait(2);		
		ui_setvalue(textBox2, "Text box", "AddProductReferenceNumber_"+StringUtility.randomGenarotor("number", 4));		
		ui_wait(2);
		ui_click(saveAddNew_btn, "SaveAddNewManufacturer");
		ui_wait(5);
		ui_click(catEdit_btn, "ManufacturerEditBtn");
		ui_click(radioUpper_Btn, "editNewManufacturer");
		ui_wait(5);
		ui_clearUsingJavaScript(textBox1, "ProductReferenceNumber");
		ui_wait(5);
		ui_setvalue(textBox1, "Text box", "AutomationManufacturer_"+StringUtility.randomGenarotor("number", 4));	
		ui_wait(5);
		ui_click(saveAddNew_btn, "saveAddNewManufacturer");
		ui_wait(5);
		ui_click(Delete_btn, "ManufacturerDelete");
		ui_wait(5);
		ui_click(clickYes_btn, "YES button on delete popup");
		int subcheckboxesSize=SubCheckboxes.size();
		for (int i =subcheckboxesSize-1; i>subcheckboxesSize-4; i--) {
			SubCheckboxes.get(i).click();}	
		ui_click(bulkDelete_btn, "Bulk delete button");
		ui_click(clickYes_btn, "Click Yes button on bulk delete popup" );
		ui_wait(5);
		ui_click(Master_checkbox, "Select Master Check box");
		ui_wait(2);
		ui_click(export_btn, "ExportProductManufacturerButton");
		ui_wait(2);
		ui_click(exportButtomTray_btn, "Export buttom tray");
		ui_wait(5);
		ui_click(Master_checkbox, "Select Master Check box");
		ui_wait(2);
		ui_click(update_btn, "Click on update button");
		ui_wait(2);
		ui_click(UpdateManufacturer_btn, "Update Manufacturer button");
		ui_wait(2);
		ui_click(choose_textbox, "choose main Manufacturer");
		ui_wait(2);
		choose_textbox.sendKeys("M");
		ui_wait(2);
		ui_click(selectDropDownValue, "Select Manufacturer from drop-down");
		ui_wait(2);
		ui_click(enterRename, "Enter rename ProductReferenceNumber");
		ui_wait(2);		
		ui_setvalue(enterRename, "Text box", "NewProductReferenceNumber_"+StringUtility.randomGenarotor("number", 4));	
		ui_wait(2);
		ui_click(updateValue_btn, "update Manufacturer");
		ui_wait(5);
		return this;
		
	}
		
	}







