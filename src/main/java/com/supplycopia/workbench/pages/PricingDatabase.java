package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.supplycopia.report.Log;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PricingDatabase extends BasePage {
	
	

	String rowelement="(//tr/td//span[contains(@class,'edit-icon')])[%s]";
	@FindBy(xpath = "//table/tbody/tr/td/span[contains(span,text())]")
	WebElement productPricetableIdentifier;
	
	@FindBy(xpath = "//div[@role=\"tab\" and contains(.,'Category Master')]")
	WebElement pageIdentifier_ele;
	@FindBy(xpath = "//button[contains(.,' Add New ')]")
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
	@FindBy(xpath = "//tbody//span[contains(@class,'mat-checkbox-inner')]")
	private List<WebElement> SubCheckboxes;
	@FindBy(xpath = "//button[contains(.,'Bulk Delete')]")
	WebElement bulkDelete_btn;
	@FindBy(xpath = "//button[contains(.,' Export')]/span[@class='mat-button-wrapper']")
	WebElement export_btn;
	@FindBy(xpath = "//th//mat-checkbox[@class=\"mat-checkbox mat-accent\"]")	
	WebElement Master_checkbox;
	@FindBy(xpath = "//th//mat-checkbox[@id=\"mat-checkbox-1\"]")	
	WebElement unCheckMaster_checkbox;	
	@FindBy(xpath = "//button[@id=\"exportCardsBtn\" and contains(.,'Export')]")
	WebElement exportButtomTray_btn;
	@FindBy(xpath = "//button[contains(.,'Update')]")
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
	@FindBy(xpath = "//app-pricing-table-view//div[text()=' Product Reference No ']" )
	WebElement PricingpageIdentifier_ele;
	@FindBy(xpath = "//div[text()='Pricing Database']/../..//div[@class='arrow arrow-right']" )
	WebElement pricingDatabase_lnk;

	@FindBy(xpath = "//span[contains(.,'Columns')]//mat-icon[contains(.,'keyboard_arrow_down')]")
	WebElement ColumnDropDown;
	
	@FindBy(xpath = "//div[@role='menu']//span[contains(.,'Account') and @class='mat-checkbox-label']/../span[@class='mat-checkbox-inner-container']")
	WebElement AccountOption;
	
	@FindBy(xpath = "//th/div[text()=' Account ']")
	WebElement accountHeader;
	@FindBy(xpath = "//input[@name=\"packSize\"]")
	WebElement packSize_inputBox;
	@FindBy(xpath = "//input[@name=\"pricePerEaUsd\"]")
	WebElement pricePerEaUsd_inputBox;
	
	
	
	
	
	
	
	public PricingDatabase(){	
		
	}
	
	public PricingDatabase bulkSelectReferenceNumbers(String numberOfMapping) {
		// TODO Auto-generated method stub
		int num=Integer.valueOf(numberOfMapping);
		ui_waitForElementToDisplay(productPricetableIdentifier, 6);
		int subcheckboxesSize=SubCheckboxes.size()-1;
		assertThat(num, is(lessThan(subcheckboxesSize)));
		for (int i=0; i<num;i++) {
			SubCheckboxes.get(i).click();}
	    return this;
	}
	
	public PricingDatabase validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementPresent(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM));
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
		ui_IsElementPresent(ui_waitForElementToDisplay(SaveStatus_Message,Pause.MEDIUM));
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
		ui_IsElementPresent(ui_waitForElementToDisplay(Popup_Text,Pause.HIGH));
		Log.info("popup message"+this.getClass().getSimpleName());
	    return this;
	}
	public PricingDatabase clickYesBtn() {	
		ui_click(clickYes_btn, "YesButtonOnDeletePopup");		
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
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH));
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public PricingDatabase clickUpdateManufacturerPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH));
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public PricingDatabase clickUpdateSupplierPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Supplier,Pause.HIGH));
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	public PricingDatabase clickUpdateCountryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Country,Pause.HIGH));
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	
	public PricingDatabase clickUpdateCategoryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Category,Pause.HIGH));
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
	public PricingDatabase validatePricingBasePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementDisplay(ui_waitForElementToDisplay(PricingpageIdentifier_ele,Pause.MEDIUM));		
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
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
		case "Account":Assert.assertEquals(ui_IsElementPresent(accountHeader), value);
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
			ui_click(String.format(rowelement, row),"");   
		break;
		default:
			Assert.assertTrue(false);
		     
		}
		return this;	
	}

	public PricingDatabase editPackSizeFirstRow() {
		// TODO Auto-generated method stub
		ui_click(AccountOption, rowelement);
	
	return this;
		
	}	
}