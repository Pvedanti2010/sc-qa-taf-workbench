package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supplycopia.report.Log;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;

public class MasterManagement extends BasePage {
	@FindBy(xpath = "//div[@role=\"tab\" and contains(.,'Category Master')]")
	WebElement pageIdentifier_ele;
	@FindBy(xpath = "//button[@class=\"mat-focus-indicator btn functionality-equi-button functionality-equi-button-enabled mat-button mat-button-base\" and contains(.,' Add New ')]")
	WebElement addNew_btn;
	@FindBy(xpath = "//input[@id=\"yes\" or contains(.,'Add New main category')]")
	WebElement radio_Btn;
	@FindBy(xpath = "//input[@formcontrolname=\"category\" or contains(.,'Enter main category')]")
	WebElement InputBox1;	
	@FindBy(xpath = "//input[@formcontrolname=\"subCategory\" or contains(.,'CHOOSE EXISTING')]")
	WebElement InputBox2;
	@FindBy(xpath = "//button//span[@class=\"mat-button-wrapper\" and contains(.,'Save')]")
	WebElement saveAddNew_btn;
	@FindBy(xpath = "//span[@class=\"text\"and contains(.,'Mapping(s) added successfully!')]")
	WebElement SaveStatus_Message;
	@FindBy(xpath = "//span[@class=\"text\"and contains(.,'Yayy! The file has been exported')]")
	WebElement ExportStatus_Message;
	@FindBy(xpath = "//span[@class=\"text\" and contains(.,'Yayy! The manufacturer name has been updated!')]")
	WebElement updateStatus_Manufacturer;
	@FindBy(xpath = "//span[@class=\"text\" and contains(.,'Yayy! The supplier name has been updated!')]")
	WebElement updateStatus_Supplier;
	@FindBy(xpath = "//span[@class=\"text\" and contains(.,'Yayy! The country name has been updated!')]")
	WebElement updateStatus_Country;
	@FindBy(xpath = "//span[@class=\"text\" and contains(.,'Yayy! The category name has been updated!')]")
	WebElement updateStatus_Category;
	@FindBy(xpath = "//span[@class=\"text\" and contains(.,'The mapping has been deleted!')]")
	WebElement deleteStatus_Message;	
	@FindBy(xpath = "//input[@id=\"no\" or contains(.,'Add New main category')]")
	WebElement chooseCatName_radioBtn;
	@FindBy(xpath = "//img[@src=\"/assets/images/icons_svg/edit_deactive.svg\"]")
	WebElement Edit_btn;
	@FindBy(xpath = "//div[@id='mat-autocomplete-2']")
	WebElement catSelect;
	@FindBy(xpath = "//span[@class=\"cursor-pointer action-link\"]//img")
	WebElement Delete_btn;
	@FindBy(xpath = "//span[@class=\"message\"and contains(.,'This will delete the mapping(s)')]")
	WebElement Popup_Text;	
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
	@FindBy(xpath = "//th//mat-checkbox[@id=\"mat-checkbox-1\"]")	
	WebElement unCheckMaster_checkbox;	
	@FindBy(xpath = "//button[@id=\"exportCardsBtn\" and contains(.,'Export')]")
	WebElement exportButtomTray_btn;
	@FindBy(xpath = "//button[@class=\"mat-menu-trigger btn functionality-equi-button functionality-equi-button-enabled ng-star-inserted\" and contains(.,'Update')]")
	WebElement update_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\"][1]")
	WebElement updateValue_1_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\"][2]")
	WebElement updateValue_2_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Supplier')]")
	WebElement updateSupplierItem_btn;	
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Country')]")
	WebElement UpdateCountryItem_btn;
	@FindBy(xpath = "//button[@role=\"menuitem\" and contains(.,'Update Manufacturer')]")
	WebElement UpdateManufacturer_btn;
	@FindBy(xpath = "//input[@formcontrolname=\"subCategory\"]")
	WebElement choose_textbox;
	@FindBy(xpath = "//mat-option[@class=\"mat-option mat-focus-indicator ng-star-inserted\"]")
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
	@FindBy(xpath = "//div[@role=\"tab\" and contains(.,'Contract Supplier Master')]")
	WebElement ContractSuprMaster_btn;
	
	
	
	
	public MasterManagement(){	
		
	}
	public MasterManagement validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementPresent(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM),"5");
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}		
	public MasterManagement navigateToMasterManagement() {
		// TODO Auto-generated method stub
		Log.info("Navigating to  MasterManagemnet");
	    return PageFactory.initElements(ui_getUIDriver(), MasterManagement.class);
	}	
	public MasterManagement clickAddNewBtn() {
		// TODO Auto-generated method stub
		ui_click(addNew_btn,"AddNewButton");
		  return this;			
	}
	public MasterManagement clickOnRadioBtnOnAddNewCategory() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public MasterManagement setCategory(String boxCategory) {			
		ui_setvalue(InputBox1, "EnterValueInputBox", boxCategory );
		return this;			
	}	
	public MasterManagement ClickTextBoxCategory() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public MasterManagement setSubCategory(String subCategory) {	
		ui_setvalue(InputBox2, "EnterValueInputBox", subCategory);
		ui_wait(5);
		return this;		
	}
	public MasterManagement ClickTextBoxSubCategory() {			
		ui_click(InputBox2,"EnterSubCategory");		
		ui_wait(5);
		return this;		
	}
	public MasterManagement clickOnSaveBtn() {	
		ui_click(saveAddNew_btn, "ClickOnSave");
		ui_IsElementPresent(ui_waitForElementToDisplay(SaveStatus_Message,Pause.MEDIUM),"5");
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;	    
	}
	public MasterManagement clickEditBtn() {
		// TODO Auto-generated method stub
		ui_click(Edit_btn, "Editbtn");
		return this;
	}
	public MasterManagement clearMainCategoryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationCategoryTest name29");		
		return this;
	}
	public MasterManagement clearChooseCategoryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationCategoryTest name29");		
		return this;
	}
	public MasterManagement clickDeleteBtn() {
		// TODO Auto-generated method stub
		ui_click(Delete_btn, "DeleteButton");
		ui_IsElementPresent(ui_waitForElementToDisplay(Popup_Text,Pause.HIGH),"5");
		Log.info("popup message"+this.getClass().getSimpleName());
	    return this;
	}
	public MasterManagement clickYesBtn() {	
		ui_click(clickYes_btn, "YesButtonOnDeletePopup");
		//ui_IsElementPresent(ui_waitForElementToAppear(deleteStatus_Message,Wait.HIGH));
		//Sorry! This mapping is currently being used in the platform and cannot be deleted
		//Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;
	}
	public MasterManagement bulkSelectMapping(String numberOfMapping) {
		// TODO Auto-generated method stub
		int num=Integer.valueOf(numberOfMapping);
		int subcheckboxesSize=SubCheckboxes.size()-1;
		for (int i=subcheckboxesSize; i>subcheckboxesSize-num;i--) {
			SubCheckboxes.get(i).click();}
	    return this;
	}
	public MasterManagement clickBulkDelete() {
		// TODO Auto-generated method stub
		ui_click(bulkDelete_btn, "BulkDeleteButton");
	    return this;
	} 
	public MasterManagement clickMasterCheckBoxes() {
		// TODO Auto-generated method stub
		ui_click(Master_checkbox, "SelectMasterCheckBox");		
	    return this;    
	}
	public MasterManagement clickExport() {	
		ui_click(export_btn, "ExportButton");
	    return this;
	} 
	public MasterManagement clickExportButtomTray() {		
		ui_click(exportButtomTray_btn, "ExportButtomTray");	
		ui_IsElementPresent(ui_waitForElementToDisplay(ExportStatus_Message,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
	    return this;
	} 
	public MasterManagement unCheckMastrChechkBox() {		
		ui_click(unCheckMaster_checkbox, "UnchechkMastrChechkbox");
	    return this;
	} 
	public MasterManagement clickUpdateBtn() {
		// TODO Auto-generated method stub
		ui_click(update_btn, "UpdatebButton");
		return this; 
	}
	public MasterManagement clickUpdateCategory() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	}   
	public MasterManagement clickUpdateSubCategory() {	
		ui_click(updateValue_2_btn, "UpdateValue1button");				
	    return this; 
	} 
	public MasterManagement selectDropDownValue() {		
		//ui_selectValueFromDropDownByIndex(selectDropDownValue, 1);
		ui_click(selectDropDownValue,"SelectDropDownValue");
		return this; 
	}
	public MasterManagement clickUpdatePopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public MasterManagement clickUpdateManufacturerPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public MasterManagement clickUpdateSupplierPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Supplier,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public MasterManagement clickUpdateCountryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Country,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	
	public MasterManagement clickUpdateCategoryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Category,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	

	
	public MasterManagement ClickContractSuprMaster() {
		// TODO Auto-generated method stub
		ui_click(ContractSuprMaster_btn, "ClickOnContratctSupplirMaster");
		return this;	
	}
	
	public MasterManagement clickOnRadioBtnOnAddNewSuppler() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public MasterManagement InputBoxSupplier_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoSupplier_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	public MasterManagement InputBoxContract_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoContract_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	public MasterManagement ClickTextBoxContract() {			
		ui_click(InputBox2,"EnterContract");		
		ui_wait(5);
		return this;		
	}
	public MasterManagement clearChooseContractTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationContractTest name29");		
		return this;
	}
	public MasterManagement ClickTextBoxSupplier() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public MasterManagement clearMainSupplerTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationSupplierTest name29");		
		return this;
	}
	public MasterManagement clickUpdateSupplier() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	
		
	//CountryAccount
	
	public MasterManagement clickCountryAccountMaster() {
		// TODO Auto-generated method stub
		ui_click(countryAccountMaster_btn, "ClickOnContratctSupplirMaster");
		return this;
	}	
	public MasterManagement clickUpdateCountry() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	public MasterManagement clickOnRadioBtnOnAddNewCountry() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public MasterManagement InputBoxCountry_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoCountry_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	public MasterManagement InputBoxAccount_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoAccount_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	public MasterManagement ClickTextBoxAccount() {			
		ui_click(InputBox2,"EnterAccount");		
		ui_wait(5);
		return this;		
	}
	public MasterManagement clearChooseAccountTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationContractTest name29");		
		return this;
	}
	public MasterManagement ClickTextBoxCountry() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public MasterManagement clearMainCountryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationSupplierTest name29");		
		return this;
	}
	
	//ProductManufacture

		
	public MasterManagement ClickProductManufacturerMaster() {
		// TODO Auto-generated method stub
		ui_click(ProductManufacturerMaster_btn, "ClickOnContratctSupplirMaster");
		return this;
	}
	public MasterManagement clickUpdateManufacturer() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	public MasterManagement clickOnRadioBtnOnAddNewManufacturer() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public MasterManagement InputBoxManufacturer_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoManufacturer_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	public MasterManagement InputBoxProductRef_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoProductRef_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	public MasterManagement ClickTextBoxProductRef() {			
		ui_click(InputBox2,"EnterAccount");		
		ui_wait(5);
		return this;		
	}
	public MasterManagement clearChooseProductRefTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationProductRefName29");		
		return this;
	}
	public MasterManagement ClickTextBoxManufacturer() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public MasterManagement clearMainManufacturerTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationManufacturerName29");		
		return this;
	}
	
		
	public MasterManagement addNewCategory(String category,String subCategory) {
		// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewCategory();
		setCategory(category);
		setSubCategory(subCategory);
		clickOnSaveBtn();
		return this;		
	}	
	public MasterManagement editNewCategorySubcategory(String category,String subCategory) {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewCategory();
		ClickTextBoxSubCategory();
		clearChooseCategoryTextBox();
		setSubCategory(subCategory);
		ClickTextBoxCategory();
		clearMainCategoryTextBox();
		setCategory(category);		
		clickOnSaveBtn();
		return this;		
	}
	public MasterManagement deleteMapping() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public MasterManagement bulkDeleteMapping(String numberOfMapping) {
		// TODO Auto-generated method stub
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	public MasterManagement exportCategoryItem() {
		// TODO Auto-generated method stub
		ui_wait(1);
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		ui_wait(1);
		unCheckMastrChechkBox();
		return this;
	}
	public MasterManagement updateCategory() {
		// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateCategory();		
		clearChooseCategoryTextBox();
		ui_wait(5);		
		ui_keyPress("AutoCategory_2402");
		selectDropDownValue();
		setCategory("AotoMainCategory_"+StringUtility.randomGenarotor("number", 4));
		clickUpdateCategoryPopUp();
		return this;
	}
	
	
	
	
	
	//Contract supplier master/////////////////////////////////////
	public MasterManagement addNewContractsupplier() {
		// TODO Auto-generated method stub
		ClickContractSuprMaster();
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewSuppler();
		InputBoxSupplier_random();
		InputBoxContract_random();
		clickOnSaveBtn();
		return this;		
	}
	public MasterManagement editNewContractsupplier() {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewSuppler();
		ClickTextBoxContract();
		clearChooseContractTextBox();
		InputBoxContract_random();
		ClickTextBoxSupplier();
		clearMainSupplerTextBox();
		InputBoxSupplier_random();		
		clickOnSaveBtn();
		return this;		
	}
	public MasterManagement deleteContractsupplierItem() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public MasterManagement bulkDeleteContractsupplier(String numberOfMapping) {
		// TODO Auto-generated method stub
		ui_wait(5);
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;		
	}
	public MasterManagement exportContractsupplier() {
		// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;		
	}
	public MasterManagement updateContractsupplier() {
		// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateSupplier();
		ui_wait(2);
		clearChooseContractTextBox();		
		selectDropDownValue();
		InputBoxSupplier_random();
		clickUpdateSupplierPopUp();
		return this;
	}
		
	//CountryAccount Master//////////////////////////////////////
	
	
	public MasterManagement addNewCountryAccount() {
		// TODO Auto-generated method stub
		clickCountryAccountMaster();
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewSuppler();
		InputBoxCountry_random();
		InputBoxAccount_random();
		clickOnSaveBtn();
		return this;
	}
	public MasterManagement editNewCountryAccount() {
			// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewCountry();
		ClickTextBoxAccount();
		clearChooseAccountTextBox();
		InputBoxAccount_random();
		ClickTextBoxCountry();
		clearMainCountryTextBox();
		InputBoxCountry_random();		
		clickOnSaveBtn();
		return this;		
	}
	public MasterManagement deleteCountryAccountItem() {
			// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		ui_wait(2);
		return this;		
	}
	public MasterManagement bulkDeleteCountryAccount(String numberOfMapping) {
			// TODO Auto-generated method stub
		ui_wait(2);
		bulkSelectMapping(numberOfMapping);
		ui_wait(1);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	public MasterManagement exportCountryAccount() {
			// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
	    clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;
	}
	public MasterManagement updateCountryAccount() {
			// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateCountry();
		clearChooseAccountTextBox();
		ui_wait(2);
	    selectDropDownValue();
		InputBoxCountry_random();
		clickUpdateCountryPopUp();
		return this;
	}
	
	
	public MasterManagement clickProductManufacture() {
		// TODO Auto-generated method stub
		ClickProductManufacturerMaster();
		return this;
	}
	public MasterManagement addNewProductManufacture() {
				// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewManufacturer();
		InputBoxManufacturer_random();
		InputBoxProductRef_random();
		clickOnSaveBtn();
		return this;
	}
	public MasterManagement editNewProductManufacture() {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewManufacturer();
		ClickTextBoxProductRef();
		clearChooseProductRefTextBox();
		InputBoxProductRef_random();
		ClickTextBoxManufacturer();
		clearMainManufacturerTextBox();
		InputBoxManufacturer_random();		
		clickOnSaveBtn();
		return this;		
	}
	public MasterManagement deleteProductManufactureItem() {
			// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public MasterManagement bulkDeleteProductManufacture(String numberOfMapping) {
				// TODO Auto-generated method stub
		ui_wait(2);
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	public MasterManagement exportProductManufacture() {
			// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;
	}
	public MasterManagement updateProductManufacture() {
				// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateManufacturer();
		clearChooseProductRefTextBox();		
		ui_wait(2);
		selectDropDownValue();
		InputBoxManufacturer_random();
		clickUpdateManufacturerPopUp();
		return this;
		
	}

		
}