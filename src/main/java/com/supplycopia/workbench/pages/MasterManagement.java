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
	@FindBy(xpath = "//app-workbench-master-table//span [contains(.,'Showing ')]")
	WebElement masterpageIdentifier_ele;
	@FindBy(xpath = "//button[contains(.,'Add New')]")
	WebElement addNew_btn;
	@FindBy(xpath = "//input[@id=\"yes\" or contains(.,'Add New main category')]")
	WebElement radio_Btn;
	@FindBy(xpath = "//input[@formcontrolname=\"category\"]")
	WebElement InputBox1;	
	@FindBy(xpath = "//input[@formcontrolname=\"subCategory\"]")
	WebElement InputBox2;
	@FindBy(xpath = "//button//span[@class=contains(.,'Save')]")
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
	@FindBy(xpath = "//tbody//span[contains(@class,'mat-checkbox-inner-container')]")
	private List<WebElement> SubCheckboxes;
	@FindBy(xpath = "//button[contains(.,'Bulk Delete')]")
	WebElement bulkDelete_btn;
	@FindBy(xpath = "//button[contains(.,' Export')]")
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
	@FindBy(xpath = "//button[contains(.,'Update Supplier')]")
	WebElement updateSupplierItem_btn;	
	@FindBy(xpath = "//button[contains(.,'Update Country')]")
	WebElement UpdateCountryItem_btn;
	@FindBy(xpath = "//button[contains(.,'Update Manufacturer')]")
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
	/**
	 * This method will validate page load
	 * @return
	 */
	public MasterManagement validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementPresent(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM),"5");
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}		
	/**
	 * This method will navigate master management page
	 * @return
	 */
	public MasterManagement navigateToMasterManagement() {
		// TODO Auto-generated method stub
		Log.info("Navigating to  MasterManagemnet");
	    return PageFactory.initElements(ui_getUIDriver(), MasterManagement.class);
	}	
	public MasterManagement validateMasterPageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementDisplay(ui_waitForElementToDisplay(masterpageIdentifier_ele,Pause.MEDIUM));
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}	
	/**
	 * This method will click the add new button
	 * @return
	 */
	public MasterManagement clickAddNewBtn() {
		// TODO Auto-generated method stub
		ui_click(addNew_btn,"AddNewButton");
		  return this;			
	}
	/**
	 * This method will click on radio button on add new category
	 * @return
	 */
	public MasterManagement clickOnRadioBtnOnAddNewCategory() {
		ui_IsElementDisplay(ui_waitForElementToDisplay(radio_Btn, Pause.V_SMALL));	
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	/**
	 * This method will set value in category text box
	 * @param boxCategory
	 * @return
	 */
	public MasterManagement setCategory(String boxCategory) {			
		ui_setvalue(InputBox1, "EnterValueInputBox", boxCategory );
		return this;			
	}	
	/**
	 * This method will set click the category text box
	 * @return
	 */
	public MasterManagement clickTextBoxCategory() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	/**
	 * This method will set value in sub-category text box
	 * @param subCategory
	 * @return
	 */
	public MasterManagement setSubCategory(String subCategory) {	
		ui_setvalue(InputBox2, "EnterValueInputBox", subCategory);
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will set click the Sub-category text box
	 * @return
	 */
	public MasterManagement clickTextBoxSubCategory() {			
		ui_click(InputBox2,"EnterSubCategory");		
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will click on save button on pop-up
	 * @return
	 */
	public MasterManagement clickOnSaveBtn() {	
		ui_click(saveAddNew_btn, "ClickOnSave");
		ui_IsElementPresent(ui_waitForElementToDisplay(SaveStatus_Message,Pause.MEDIUM),"5");
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;	    
	}
	/**
	 * This method will click on edit button on pop-up
	 * @return
	 */
	public MasterManagement clickEditBtn() {
		// TODO Auto-generated method stub
		ui_click(Edit_btn, "Editbtn");
		return this;
	}
	/**
	 * This method will clear the main category text box
	 * @return
	 */
	public MasterManagement clearMainCategoryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationCategoryTest name29");		
		return this;
	}
	/**
	 * This method will clear the choose category text box
	 * @return
	 */
	public MasterManagement clearChooseCategoryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationCategoryTest name29");		
		return this;
	}
	/**
	 * This method will click on delete button on pop-up
	 * @return
	 */
	public MasterManagement clickDeleteBtn() {
		// TODO Auto-generated method stub
		ui_click(Delete_btn, "DeleteButton");
		ui_IsElementPresent(ui_waitForElementToDisplay(Popup_Text,Pause.HIGH),"5");
		Log.info("popup message"+this.getClass().getSimpleName());
	    return this;
	}
	/**
	 * This method will click on yes button on pop-up
	 * @return
	 */
	public MasterManagement clickYesBtn() {	
		ui_click(clickYes_btn, "YesButtonOnDeletePopup");		
	    return this;
	}
	/**
	 * This method will bulk select 
	 * @param numberOfMapping
	 * @return
	 */
	public MasterManagement bulkSelectMapping(String numberOfMapping) {
		// TODO Auto-generated method stub
		int num=Integer.valueOf(numberOfMapping);
		int subcheckboxesSize=SubCheckboxes.size()-1;
		for (int i=subcheckboxesSize; i>subcheckboxesSize-num;i--) {
			SubCheckboxes.get(i).click();}
	    return this;
	}
	/**
	 * This method will click on bulk delete button on bottom
	 * @return
	 */
	public MasterManagement clickBulkDelete() {
		// TODO Auto-generated method stub
		ui_click(bulkDelete_btn, "BulkDeleteButton");
	    return this;
	} 
	/**
	 * This method will click on master check box
	 * @return
	 */
	public MasterManagement clickMasterCheckBoxes() {
		// TODO Auto-generated method stub
		ui_click(Master_checkbox, "SelectMasterCheckBox");		
	    return this;    
	}
	/**
	 * This method will click on export button
	 * @return
	 */
	public MasterManagement clickExport() {	
		ui_click(export_btn, "ExportButton");
	    return this;
	} 
	/**
	 * This method will click on export button on bottom tray
	 * @return
	 */
	public MasterManagement clickExportButtomTray() {		
		ui_click(exportButtomTray_btn, "ExportButtomTray");	
		ui_IsElementPresent(ui_waitForElementToDisplay(ExportStatus_Message,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
	    return this;
	} 
	/**
	 * This method will click on uncheck master check box
	 * @return
	 */
	public MasterManagement unCheckMastrChechkBox() {		
		ui_click(unCheckMaster_checkbox, "UnchechkMastrChechkbox");
	    return this;
	} 
	/**
	 * This method will click on update button
	 * @return
	 */
	public MasterManagement clickUpdateBtn() {
		// TODO Auto-generated method stub
		ui_click(update_btn, "UpdatebButton");
		return this; 
	}
	/**
	 * This method will click on update category button
	 * @return
	 */
	public MasterManagement clickUpdateCategory() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	}   
	/**
	 * This method will click on update sub-category button
	 * @return
	 */
	public MasterManagement clickUpdateSubCategory() {	
		ui_click(updateValue_2_btn, "UpdateValue1button");				
	    return this; 
	} 
	/**
	 * This method will select the drop down value
	 * @return
	 */
	public MasterManagement selectDropDownValue() {			
		ui_click(selectDropDownValue,"SelectDropDownValue");
		return this; 
	}
	/**
	 * This method will click update pop up
	 * @return
	 */
	public MasterManagement clickUpdatePopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	/**
	 * This method will click update Manufacturer on pop up
	 * @return
	 */
	public MasterManagement clickUpdateManufacturerPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Manufacturer,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	/**
	 * This method will click update supplier on pop up
	 * @return
	 */
	public MasterManagement clickUpdateSupplierPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Supplier,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	/**
	 * This method will click update country on pop up
	 * @return
	 */
	public MasterManagement clickUpdateCountryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Country,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	
	/**
	 * This method will click update category on pop up
	 * @return
	 */
	public MasterManagement clickUpdateCategoryPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToDisplay(updateStatus_Category,Pause.HIGH),"5");
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}	
	/**
	 * This method will click update Contract Supplier Master on pop up
	 * @return
	 */
	public MasterManagement clickContractSupplierMaster() {
		// TODO Auto-generated method stub
		ui_click(ContractSuprMaster_btn, "ClickOnContratctSupplirMaster");
		return this;	
	}
	
	/**
	 * This method will click on radio button 
	 * @return
	 */
	public MasterManagement clickOnRadioBtnOnAddNewSuppler() {
		ui_IsElementDisplay(ui_waitForElementToDisplay(radio_Btn, Pause.V_SMALL));
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	/**
	 * This method will enter random number in supplier text box
	 * @return
	 */
	public MasterManagement inputBoxSupplier_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoSupplier_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	/**
	 * This method will enter random number in contract text box
	 * @return
	 */
	public MasterManagement inputBoxContract_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoContract_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will click contract text box
	 * @return
	 */
	public MasterManagement clickTextBoxContract() {			
		ui_click(InputBox2,"EnterContract");		
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will clear choose contract text box
	 * @return
	 */
	public MasterManagement clearChooseContractTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationContractTest name29");		
		return this;
	}
	/**
	 * This method will click supplier text box
	 * @return
	 */
	public MasterManagement clickTextBoxSupplier() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	/**
	 * This method will clear main supplier text box
	 * @return
	 */
	public MasterManagement clearMainSupplerTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationSupplierTest name29");		
		return this;
	}
	/**
	 * This method will update the supplier value
	 * @return
	 */
	public MasterManagement clickUpdateSupplier() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	
		
	//CountryAccount
	
	/**
	 * This method will click the country Account Master
	 * @return
	 */
	public MasterManagement clickCountryAccountMaster() {
		// TODO Auto-generated method stub
		ui_click(countryAccountMaster_btn, "ClickOnContratctSupplirMaster");
		return this;
	}	
	/**
	 * This method will click the update country
	 * @return
	 */
	public MasterManagement clickUpdateCountry() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	/**
	 * This method will click the radio button on add new country
	 * @return
	 */
	public MasterManagement clickOnRadioBtnOnAddNewCountry() {
		ui_IsElementDisplay(ui_waitForElementToDisplay(radio_Btn, Pause.V_SMALL));	
		ui_click(radio_Btn, "RadioBtn");
		return this;			
	}
	/**
	 * This method will enter random number in country text box
	 * @return
	 */
	public MasterManagement enterCountry(String country) {			
		ui_setvalue(InputBox1, "EnterValueInputBox", country);
		return this;			
	}
	/**
	 * This method will enter random number in account text box
	 * @return
	 */
	public MasterManagement enterAccount(String account) {	
		ui_setvalue(InputBox2, "EnterValueInputBox", account);
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will enter the value in account text box
	 * @return
	 */
	public MasterManagement clickTextBoxAccount() {			
		ui_click(InputBox2,"EnterAccount");		
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will clear the choose account text box
	 * @return
	 */
	public MasterManagement clearChooseAccountTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationContractTest name29");		
		return this;
	}
	/**
	 * This method will enter the value in  the country text box
	 * @return
	 */
	public MasterManagement clickTextBoxCountry() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	/**
	 * This method will clear the main country text box
	 * @return
	 */
	public MasterManagement clearMainCountryTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationSupplierTest name29");		
		return this;
	}
	
	//ProductManufacture

		
	/**
	 * This method will click on Product Manufacturer Master button
	 * @return
	 */
	public MasterManagement clickProductManufacturerMaster() {
		// TODO Auto-generated method stub
		ui_click(ProductManufacturerMaster_btn, "ClickOnContratctSupplirMaster");
		return this;
	}
	/**
	 * This method will click on Manufacturer Master button
	 * @return
	 */
	public MasterManagement clickUpdateManufacturer() {	
		ui_click(updateValue_1_btn, "UpdateValue1button");				
	    return this; 
	} 
	/**
	 * This method will click on radio button on add new Manufacturer
	 * @return
	 */
	public MasterManagement clickOnRadioBtnOnAddNewManufacturer() {
		ui_IsElementDisplay(ui_waitForElementToDisplay(radio_Btn, Pause.V_SMALL));
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	/**
	 * This method will enter the random  value in Manufacturer text box
	 * @return
	 */
	public MasterManagement inputBoxManufacturer_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoManufacturer_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}
	/**
	 * This method will enter the random  value in Product reference text box
	 * @return
	 */
	public MasterManagement inputBoxProductRef_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoProductRef_"+StringUtility.randomGenarotor("number", 5));
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will click on Product reference text box
	 * @return
	 */
	public MasterManagement clickTextBoxProductRef() {			
		ui_click(InputBox2,"EnterAccount");		
		ui_wait(5);
		return this;		
	}
	/**
	 * This method will clear the choose Product reference text box
	 * @return
	 */
	public MasterManagement clearChooseProductRefTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox2,"AutomationProductRefName29");		
		return this;
	}
	/**
	 * This method will click on manufacture text box
	 * @return
	 */
	public MasterManagement clickTextBoxManufacturer() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	/**
	 * This method will clear the Main Manufacturer text box
	 * @return
	 */
	public MasterManagement clearMainManufacturerTextBox() {
		// TODO Auto-generated method stub
		ui_clearUsingJavaScript(InputBox1,"AutomationManufacturerName29");		
		return this;
	}
	
		
	/**
	 * This method will  add the new category in the category master
	 * @param category
	 * @param subCategory
	 * @return
	 */
	public MasterManagement addNewCategory(String category,String subCategory) {
		// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewCategory();
		setCategory(category);
		setSubCategory(subCategory);
		clickOnSaveBtn();
		return this;		
	}	
	/**
	 * This method will  edit the category and sub-category in the category master
	 * @param category
	 * @param subCategory
	 * @return
	 */
	public MasterManagement editNewCategorySubcategory(String category,String subCategory) {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewCategory();
		clickTextBoxSubCategory();
		clearChooseCategoryTextBox();
		setSubCategory(subCategory);
		clickTextBoxCategory();
		clearMainCategoryTextBox();
		setCategory(category);
		ui_wait(5);
		clickOnSaveBtn();
		return this;		
	}
	
	/**
	 * This method will delete the category in the category master
	 * @return
	 */
	public MasterManagement deleteMapping() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	/**
	 * This method will  bulk delete category master value
	 * @param numberOfMapping
	 * @return
	 */
	public MasterManagement bulkDeleteMapping(String numberOfMapping) {
		// TODO Auto-generated method stub
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	/**
	 * This method will export the category master  data
	 * @return
	 */
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
	/**
	 * This method will update the category on category master data base
	 * @return
	 */
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
	/**
	 * This method will  add the new contract supplier in the contractSupplier master
	 * @return
	 */
	public MasterManagement addNewContractsupplier() {
		// TODO Auto-generated method stub
		clickContractSupplierMaster();
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewSuppler();
		inputBoxSupplier_random();
		inputBoxContract_random();
		clickOnSaveBtn();
		return this;		
	}
	/**
	 * This method will  edit the contract supplier in the contractSupplier master
	 * @return
	 */
	public MasterManagement editNewContractsupplier() {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewSuppler();
		clickTextBoxContract();
		clearChooseContractTextBox();
		inputBoxContract_random();
		clickTextBoxSupplier();
		clearMainSupplerTextBox();
		inputBoxSupplier_random();	
		ui_wait(5);
		clickOnSaveBtn();
		return this;		
	}
	/**
	 * This method will  delete the new contract supplier in the contractSupplier master
	 * @return
	 */
	public MasterManagement deleteContractsupplierItem() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	/**
	 * This method will bulk delete the new contract supplier in the contractSupplier master
	 * @param numberOfMapping
	 * @return
	 */
	public MasterManagement bulkDeleteContractsupplier(String numberOfMapping) {
		// TODO Auto-generated method stub
		ui_wait(5);
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;		
	}
	/**
	 * This method will export contractSupplier master data 
	 * @return
	 */
	public MasterManagement exportContractsupplier() {
		// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;		
	}
	/**
	 * This method will update contract supplier in the contractSupplier master data base
	 * @return
	 */
	public MasterManagement updateContractsupplier() {
		// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateSupplier();
		ui_wait(2);
		clearChooseContractTextBox();		
		selectDropDownValue();
		inputBoxSupplier_random();
		clickUpdateSupplierPopUp();
		return this;
	}
		
	//CountryAccount Master//////////////////////////////////////
	
	
	/**
	 * This method will add the new country account  in the country-account master
	 * @return
	 */
	public MasterManagement addNewCountryAccount(String country,String account) {
		// TODO Auto-generated method stub
		clickCountryAccountMaster();
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewSuppler();
		enterCountry(country);
		enterAccount(account);
		clickOnSaveBtn();
		return this;
	}
	/**
	 * This method will edit the country account  in the country-account master
	 * @return
	 */
	public MasterManagement editNewCountryAccount(String country,String account) {
			// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewCountry();
		clickTextBoxAccount();
		clearChooseAccountTextBox();
		enterAccount(account);
		clickTextBoxCountry();
		clearMainCountryTextBox();
		enterCountry(country);
		ui_wait(5);
		clickOnSaveBtn();
		return this;		
	}
	/**
	 * This method will delete the country account  in the country-account master
	 * @return
	 */
	public MasterManagement deleteCountryAccountItem() {
			// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		ui_wait(2);
		return this;		
	}
	/**
	 * This method will bulk delete  the country account  in the country-account master data value
	 * @param numberOfMapping
	 * @return
	 */
	public MasterManagement bulkDeleteCountryAccount(String numberOfMapping) {
			// TODO Auto-generated method stub
		ui_wait(2);
		bulkSelectMapping(numberOfMapping);
		ui_wait(1);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	/**
	 * This method will export the country account  in the country-account master data 
	 * @return
	 */
	public MasterManagement exportCountryAccount() {
			// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
	    clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;
	}
	/**
	 * This method will update the country account in the country-account master data base
	 * @return
	 */
	public MasterManagement updateCountryAccount(String country) {
			// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateCountry();
		clearChooseAccountTextBox();
		ui_wait(2);
	    selectDropDownValue();
		enterCountry(country);
		clickUpdateCountryPopUp();
		return this;
	}
	
	//Product Manufacture
	
	
	/**
	 * This method will click the new Product Manufacture  in the ProductManufacture master
	 * @return
	 */
	public MasterManagement clickProductManufacture() {
		// TODO Auto-generated method stub
		clickProductManufacturerMaster();
		return this;
	}
	/**
	 * This method will add new the Product Manufacture  in the ProductManufacture master
	 * @return
	 */
	public MasterManagement addNewProductManufacture() {
		// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewManufacturer();
		inputBoxManufacturer_random();
		inputBoxProductRef_random();
		clickOnSaveBtn();
		return this;
	}
	/**
	 * This method will edit the Product Manufacture  in the ProductManufacture master
	 * @return
	 */
	public MasterManagement editNewProductManufacture() {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewManufacturer();
		clickTextBoxProductRef();
		clearChooseProductRefTextBox();
		inputBoxProductRef_random();
		clickTextBoxManufacturer();
		clearMainManufacturerTextBox();
		inputBoxManufacturer_random();
		ui_wait(5);
		clickOnSaveBtn();
		return this;		
	}
	/**
	 * This method will delete the Product Manufacture  in the ProductManufacture master
	 * @return
	 */
	public MasterManagement deleteProductManufactureItem() {
			// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	/**
	 * This method will bulk delete the Product Manufacture  in the ProductManufacture master data value
	 * @param numberOfMapping
	 * @return
	 */
	public MasterManagement bulkDeleteProductManufacture(String numberOfMapping) {
				// TODO Auto-generated method stub
		ui_wait(2);
		bulkSelectMapping(numberOfMapping);
		clickBulkDelete();
		clickYesBtn();
		return this;
	}
	/**
	 * This method will export the ProductManufacture master data value
	 * @return
	 */
	public MasterManagement exportProductManufacture() {
			// TODO Auto-generated method stub
		    clickMasterCheckBoxes();
		    clickExport();
		    clickExportButtomTray();
		    clickMasterCheckBoxes();
		    return this;
		}
	/**
	 * This method will update the Product Manufacture  in the ProductManufacture master data base
	 * @return
	 */
	public MasterManagement updateProductManufacture() {
			// TODO Auto-generated method stub
			clickUpdateBtn();
			clickUpdateManufacturer();
			clearChooseProductRefTextBox();		
			ui_wait(2);
			selectDropDownValue();
			inputBoxManufacturer_random();
			clickUpdateManufacturerPopUp();
			return this;
		
	}

		
}