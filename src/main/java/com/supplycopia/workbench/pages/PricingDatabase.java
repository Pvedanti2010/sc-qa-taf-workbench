package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.supplycopia.report.Log;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PricingDatabase extends BasePage {
	
	String rowelement_packSizeTxt= "//tbody/tr[%s]//input[@name='packSize']";
	String rowelement_savePricing= "//tbody/tr[%s]//span[contains(@class,'action-save-icon')]";
	String rowelement_changeHistory="//tbody/tr[%s]//span[contains(@class,'action-change-history')]";
	String rowelement_deleteIcon="//tbody/tr[%s]//span[contains(@class,'action-delete-icon')]";
	String rowelement_editIcon="(//tr/td//span[contains(@class,'edit-icon')])[%s]";
	
	
	
	
	
	
	@FindBy(xpath = "//span[@class='sc-filter-title' and contains(.,'Product Reference No ')]")
	WebElement productRef_dd;
    String productRefOption=	"(//span[@class='sc-filter-title' and contains(.,'Product Reference No ')]//ancestor::mat-expansion-panel//span[@class='mat-checkbox-inner-container'])[1]";
	@FindBy(xpath = "//button/span[@class='mat-button-wrapper' and contains(.,'Filters')]")
	WebElement filters_btn;
	@FindBy(xpath = "//app-confirm-dialog//button[text()='Yes']")
	WebElement filtersYes;
	@FindBy(xpath = "//img[@class='back-icon cursor-pointer']")
	WebElement filterBack_lnk;
	@FindBy(xpath = "//span[contains(@class,'clearFilter')]")
	WebElement clearFilter_lnk;
	
	
	@FindBy(xpath = "//app-confirm-dialog//button[text()='Yes']")
	WebElement deleteMappingYes;
	@FindBy(xpath = "//mat-dialog-container[@role='dialog']//span[@class='close-text']")
	WebElement changeHistoryCloseDialog;
	
	@FindBy(xpath = "//mat-dialog-container[@role='dialog']")
	WebElement changeHistoryDialog;
	@FindBy(xpath = "//span/img[@class='scroll-arrow' and contains(@src,'greaterthan')]")
	WebElement scrollRight;
	@FindBy(xpath = "//table/tbody/tr/td/span[contains(span,text())]")
	WebElement productPricetableIdentifier;
	
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
	@FindBy(xpath = "//app-bulk-delete-dialog//button[text()='Yes']")
	WebElement clickYes_btn;
	@FindBy(xpath = "//tbody//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	private List<WebElement> SubCheckboxes;
	@FindBy(xpath = "//button[contains(@class,'bulk-delete-button-enabled')]")
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

	@FindBy(xpath = "//span[contains(.,'Columns')]//mat-icon[contains(.,'keyboard_arrow_down')]")
	WebElement ColumnDropDown;
	
	@FindBy(xpath = "//div[@role='menu']//span[contains(.,'Account') and @class='mat-checkbox-label']/../span[@class='mat-checkbox-inner-container']")
	WebElement AccountOption;
	
	@FindBy(xpath = "//th/div[text()=' Account ']")
	WebElement accountHeader;
	
	
	public PricingDatabase(){	
		
	}
	
	public PricingDatabase bulkSelectReferenceNumbers(String numberOfMapping) {
		// TODO Auto-generated method stub
		int num=Integer.valueOf(numberOfMapping);
		ui_waitForElementToDisplay(productPricetableIdentifier, 6);
		int subcheckboxesSize=SubCheckboxes.size()-1;
		assertThat(num, is(lessThan(subcheckboxesSize)));
		for (int i=0; i<num;i++) {
		ui_click(SubCheckboxes.get(i), "checkbox");	}
	    return this;
	}
	
	public PricingDatabase validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementPresent(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM),"5");
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}		
	public PricingDatabase navigateToMasterManagement() {
		// TODO Auto-generated method stub
		Log.info("Navigating to  MasterManagemnet");
	    return PageFactory.initElements(ui_getUIDriver(), PricingDatabase.class);
	}	
	public PricingDatabase clickAddNewBtn() {
		// TODO Auto-generated method stub
		ui_click(addNew_btn,"AddNewButton");
		  return this;			
	}
	public PricingDatabase clickOnRadioBtnOnAddNewCategory() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public PricingDatabase setCategory(String boxCategory) {			
		ui_setvalue(InputBox1, "EnterValueInputBox", boxCategory );
		return this;			
	}	
	public PricingDatabase ClickTextBoxCategory() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public PricingDatabase setSubCategory(String subCategory) {	
		ui_setvalue(InputBox2, "EnterValueInputBox", subCategory);
		ui_wait(5);
		return this;		
	}
	public PricingDatabase ClickTextBoxSubCategory() {			
		ui_click(InputBox2,"EnterSubCategory");		
		ui_wait(5);
		return this;		
	}
	public PricingDatabase clickOnSaveBtn() {	
		ui_click(saveAddNew_btn, "ClickOnSave");
		ui_IsElementPresent(ui_waitForElementToDisplay(SaveStatus_Message,Pause.MEDIUM),"5");
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;	    
	}
	public PricingDatabase clickEditBtn() {
		// TODO Auto-generated method stub
		ui_click(Edit_btn, "Editbtn");
		return this;
	}
	public PricingDatabase clearMainCategoryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationCategoryTest name29");		
		return this;
	}
	public PricingDatabase clearChooseCategoryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationCategoryTest name29");		
		return this;
	}
	public PricingDatabase clickDeleteBtn() {
		// TODO Auto-generated method stub
		ui_click(Delete_btn, "DeleteButton");
		ui_IsElementPresent(ui_waitForElementToDisplay(Popup_Text,Pause.HIGH),"5");
		Log.info("popup message"+this.getClass().getSimpleName());
	    return this;
	}
	public PricingDatabase clickYesBtn() {	
		ui_click(clickYes_btn, "YesButtonOnDeletePopup");
		//ui_IsElementPresent(ui_waitForElementToAppear(deleteStatus_Message,Wait.HIGH));
		//Sorry! This mapping is currently being used in the platform and cannot be deleted
		//Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;
	}

	public PricingDatabase clickBulkDelete() {
		// TODO Auto-generated method stub
		ui_click(bulkDelete_btn, "BulkDeleteButton");
	    return this;
	} 
	public PricingDatabase clickMasterCheckBoxes() {
		// TODO Auto-generated method stub
		ui_click(Master_checkbox, "SelectMasterCheckBox");		
	    return this;    
	}
	public PricingDatabase clickExport() {	
		ui_click(export_btn, "ExportButton");
	    return this;
	} 
	public PricingDatabase clickExportButtomTray() {		
		ui_click(exportButtomTray_btn, "ExportButtomTray");	
		//ui_IsElementPresent(ui_waitForElementToDisplay(ExportStatus_Message,Pause.HIGH));
		Log.info("Export function successfully validated for "+this.getClass().getSimpleName());
	    return this;
	} 
	public PricingDatabase unCheckMastrChechkBox() {		
		ui_click(unCheckMaster_checkbox, "UnchechkMastrChechkbox");
	    return this;
	} 
	public PricingDatabase clickUpdateBtn() {
		// TODO Auto-generated method stub
		ui_click(update_btn, "UpdatebButton");
		return this; 
	}
	public PricingDatabase clickUpdateCategory() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	}   
	public PricingDatabase clickUpdateSubCategory() {	
		ui_click(updateValue_2_btn, "UpdateValue1button");				
	    return this; 
	} 
	public PricingDatabase selectDropDownValue() {		
		//ui_selectValueFromDropDownByIndex(selectDropDownValue, 1);
		ui_click(selectDropDownValue,"SelectDropDownValue");
		return this; 
	}
	public PricingDatabase clickUpdatePopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public PricingDatabase clickUpdateManufacturerPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public PricingDatabase clickUpdateSupplierPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Supplier,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public PricingDatabase clickUpdateCountryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Country,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	
	public PricingDatabase clickUpdateCategoryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Category,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	

	
	public PricingDatabase ClickContractSuprMaster() {
		// TODO Auto-generated method stub
		ui_click(ContractSuprMaster_btn, "ClickOnContratctSupplirMaster");
		return this;	
	}
	
	public PricingDatabase clickOnRadioBtnOnAddNewSuppler() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public PricingDatabase InputBoxSupplier_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoSupplier_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	public PricingDatabase InputBoxContract_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoContract_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	public PricingDatabase ClickTextBoxContract() {			
		ui_click(InputBox2,"EnterContract");		
		ui_wait(5);
		return this;		
	}
	public PricingDatabase clearChooseContractTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationContractTest name29");		
		return this;
	}
	public PricingDatabase ClickTextBoxSupplier() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public PricingDatabase clearMainSupplerTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationSupplierTest name29");		
		return this;
	}
	public PricingDatabase clickUpdateSupplier() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	
		
	//CountryAccount
	
	public PricingDatabase clickCountryAccountMaster() {
		// TODO Auto-generated method stub
		ui_click(countryAccountMaster_btn, "ClickOnContratctSupplirMaster");
		return this;
	}	
	public PricingDatabase clickUpdateCountry() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	public PricingDatabase clickOnRadioBtnOnAddNewCountry() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public PricingDatabase InputBoxCountry_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoCountry_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	public PricingDatabase InputBoxAccount_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoAccount_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	public PricingDatabase ClickTextBoxAccount() {			
		ui_click(InputBox2,"EnterAccount");		
		ui_wait(5);
		return this;		
	}
	public PricingDatabase clearChooseAccountTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationContractTest name29");		
		return this;
	}
	public PricingDatabase ClickTextBoxCountry() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public PricingDatabase clearMainCountryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationSupplierTest name29");		
		return this;
	}
	
	//ProductManufacture

		
	public PricingDatabase ClickProductManufacturerMaster() {
		// TODO Auto-generated method stub
		ui_click(ProductManufacturerMaster_btn, "ClickOnContratctSupplirMaster");
		return this;
	}
	public PricingDatabase clickUpdateManufacturer() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	public PricingDatabase clickOnRadioBtnOnAddNewManufacturer() {
		ui_waitForElementToDisplay(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public PricingDatabase InputBoxManufacturer_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoManufacturer_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	public PricingDatabase InputBoxProductRef_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoProductRef_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	public PricingDatabase ClickTextBoxProductRef() {			
		ui_click(InputBox2,"EnterAccount");		
		ui_wait(5);
		return this;		
	}
	public PricingDatabase clearChooseProductRefTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationProductRefName29");		
		return this;
	}
	public PricingDatabase ClickTextBoxManufacturer() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public PricingDatabase clearMainManufacturerTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationManufacturerName29");		
		return this;
	}
	
		
	public PricingDatabase addNewCategory(String category,String subCategory) {
		// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewCategory();
		setCategory(category);
		setSubCategory(subCategory);
		clickOnSaveBtn();
		return this;		
	}	
	public PricingDatabase editNewCategorySubcategory(String category,String subCategory) {
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
	public PricingDatabase deleteMapping() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public PricingDatabase bulkDeleteMapping(String numberOfMapping) {
		// TODO Auto-generated method stub
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	private void bulkSelectMapping(String numberOfMapping) {
		// TODO Auto-generated method stub
		
	}

	public PricingDatabase exportCategoryItem() {
		// TODO Auto-generated method stub
		ui_wait(1);
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		ui_wait(1);
		unCheckMastrChechkBox();
		return this;
	}
	public PricingDatabase updateCategory() {
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
	public PricingDatabase addNewContractsupplier() {
		// TODO Auto-generated method stub
		ClickContractSuprMaster();
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewSuppler();
		InputBoxSupplier_random();
		InputBoxContract_random();
		clickOnSaveBtn();
		return this;		
	}
	public PricingDatabase editNewContractsupplier() {
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
	public PricingDatabase deleteContractsupplierItem() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public PricingDatabase bulkDeleteContractsupplier(String numberOfMapping) {
		// TODO Auto-generated method stub
		ui_wait(5);
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;		
	}
	public PricingDatabase exportContractsupplier() {
		// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;		
	}
	public PricingDatabase updateContractsupplier() {
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
	
	
	public PricingDatabase addNewCountryAccount() {
		// TODO Auto-generated method stub
		clickCountryAccountMaster();
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewSuppler();
		InputBoxCountry_random();
		InputBoxAccount_random();
		clickOnSaveBtn();
		return this;
	}
	public PricingDatabase editNewCountryAccount() {
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
	public PricingDatabase deleteCountryAccountItem() {
			// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		ui_wait(2);
		return this;		
	}
	public PricingDatabase bulkDeleteCountryAccount(String numberOfMapping) {
			// TODO Auto-generated method stub
		ui_wait(2);
		bulkSelectMapping(numberOfMapping);
		ui_wait(1);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	public PricingDatabase exportCountryAccount() {
			// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
	    clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;
	}
	public PricingDatabase updateCountryAccount() {
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
	
	
	public PricingDatabase clickProductManufacture() {
		// TODO Auto-generated method stub
		ClickProductManufacturerMaster();
		return this;
	}
	public PricingDatabase addNewProductManufacture() {
				// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewManufacturer();
		InputBoxManufacturer_random();
		InputBoxProductRef_random();
		clickOnSaveBtn();
		return this;
	}
	public PricingDatabase editNewProductManufacture() {
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
	public PricingDatabase deleteProductManufactureItem() {
			// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public PricingDatabase bulkDeleteProductManufacture(String numberOfMapping) {
				// TODO Auto-generated method stub
		ui_wait(2);
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	public PricingDatabase exportProductManufacture() {
			// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;
	}
	public PricingDatabase updateProductManufacture() {
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

	public PricingDatabase clickColumns() {
		// TODO Auto-generated method stub
		ui_click(ColumnDropDown, "");
		return this;
	}
	public PricingDatabase selectColumnAccount() {
		// TODO Auto-generated method stub
		ui_click(AccountOption, "");
		return this;
	}

	public PricingDatabase validateColumnPresent(String choice,boolean value) {
		ui_waitForElementToDisplay(productPricetableIdentifier, 30);
		switch(choice) {
		case "Account":Assert.assertEquals(ui_IsElementPresent(accountHeader,"5"), value);
		break;
		default:
			Assert.assertTrue(value);
		
		}
		return this;	
	}

	public PricingDatabase selectRowfor(String choice, String row) {
		// TODO Auto-generated method stub
	
		switch(choice.toLowerCase()) {
		case "edit":
			ui_click(String.format(rowelement_editIcon, row),"EditIcon");
			break;
		case "changehistory":
			ui_click(String.format(rowelement_changeHistory, row),"changeHistoryIcon");	
			break;
		case "delete":
			ui_click(String.format(rowelement_deleteIcon, row),"deleteIcon");	
			break;
		default:
			Assert.assertTrue(false);
		     
		}
		return this;	
	}

	public PricingDatabase setPackSize(String value, String row) {
		// TODO Auto-generated method stub
			ui_clearAndSetValue(String.format(rowelement_packSizeTxt, row), value);
	        ui_wait(6);
		   
		return this;
	}
	
	public PricingDatabase clickSaveProductPrices(String value, String row) {
		// TODO Auto-generated method stub
		ui_wait(4);
		ui_click(String.format(rowelement_savePricing, row), value);
		ui_waitForElementToDisplay(productPricetableIdentifier, 30);
		return this;
	}
	
		
	public PricingDatabase scrollRight(String value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Integer.valueOf(value); i++) {
			ui_click(scrollRight, "Scrolling right");ui_wait(1);
		}
		
		return this;
	}

	public PricingDatabase verifyChangeHistoryPopUp() {
		// TODO Auto-generated method stubchange
		Assert.assertEquals(ui_IsElementDisplay(changeHistoryDialog),true);
		return this;
	}

	public PricingDatabase closeChangeHistoryPopUp() {
		// TODO Auto-generated method stub
	ui_click(changeHistoryCloseDialog, "changeHistoryCloseDialog");	
		return this;
	}

	public PricingDatabase confirmDeleteMapping() {
		// TODO Auto-generated method stub
	ui_click(deleteMappingYes, "Confirm Yes Button");
	return this;	
	}

	public PricingDatabase confirmBulkDeleteMapping() {
		// TODO Auto-generated method stub
		ui_click(clickYes_btn, "confirmBulkDelete");
		return this;
	}

	public PricingDatabase clickFilter() {
		// TODO Auto-generated method stub
		ui_click(filters_btn, "confirmBulkDelete");
		return this;		
	}
	
	public PricingDatabase expendProductRef() {
	ui_click(productRef_dd, "");
	return this;
	}
	public PricingDatabase selectProdRefOption(String option) {
		ui_click(productRefOption, ""); 
		return this;
		}
	public PricingDatabase clickBackFilter() {
		ui_click(filterBack_lnk,"filterBack button"); 
		return this;
		}
	public PricingDatabase clearFilter() {
		ui_click(clearFilter_lnk,""); 
		return this;
		}

}