package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supplycopia.report.Log;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.utils.Wait;
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
	@FindBy(xpath = "//span[@class=\"text\" and contains(.,'Yayy! The category name has been updated!')]")
	WebElement UpdateStatus_Message;	
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
	@FindBy(xpath = "//span[@class=\"mat-option-text\"][1]")
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
		ui_IsElementPresent(ui_waitForElementToAppear(pageIdentifier_ele,Wait.MEDIUM));
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
		ui_waitForElementToAppear(radio_Btn, 2);
		ui_click(radio_Btn, "RadioBtn");
		   return this;			
	}
	public MasterManagement InputBoxCategory_random() {			
		ui_setvalue(InputBox1, "EnterValueInputBox", "AotoMainCategory_"+StringUtility.randomGenarotor("number", 4));
		return this;			
	}	
	public MasterManagement ClickTextBoxCategory() {	
		ui_click(InputBox1,"Text box");
		return this;			
	}
	public MasterManagement InputBoxSubCategory_random() {	
		ui_setvalue(InputBox2, "EnterValueInputBox", "AutoSubCategory_"+StringUtility.randomGenarotor("number", 5));
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
		ui_IsElementPresent(ui_waitForElementToAppear(SaveStatus_Message,Wait.MEDIUM));
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
		//ui_IsElementPresent(ui_waitForElementToAppear(Popup_Text,Wait.MEDIUM));
		//Log.info("popup message"+this.getClass().getSimpleName());
	    return this;
	}
	public MasterManagement clickYesBtn() {	
		ui_click(clickYes_btn, "YesButtonOnDeletePopup");
		//ui_IsElementPresent(ui_waitForElementToAppear(deleteStatus_Message,Wait.MEDIUM));
		//Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;
	}
	public MasterManagement clickSelectSubcheckbox() {
		// TODO Auto-generated method stub
		int subcheckboxesSize=SubCheckboxes.size();
		for (int i =subcheckboxesSize-1; i>subcheckboxesSize-4; i--) {
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
		//ui_IsElementPresent(ui_waitForElementToAppear(ExportStatus_Message,Wait.MEDIUM));
		//Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
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
		ui_selectValueFromDropDownByIndex(selectDropDownValue,2);
		ui_click(selectDropDownValue,"SelectDropDownValue");
		return this; 
	}
	public MasterManagement UpdateBtnOnPopUp() {
		// TODO Auto-generated method stub
		ui_click(updateValue_btn, "UpdateButton");	
		ui_IsElementPresent(ui_waitForElementToAppear(UpdateStatus_Message,Wait.MEDIUM));
		Log.info("Export FileSuccessfulis validated for "+this.getClass().getSimpleName());
		return this; 
		}
	
	public MasterManagement ClickContractSuprMaster() {
		// TODO Auto-generated method stub
		ui_click(ContractSuprMaster_btn, "ClickOnContratctSupplirMaster");
		return this;		
	}
	//
	public MasterManagement clickOnRadioBtnOnAddNewSuppler() {
		ui_waitForElementToAppear(radio_Btn, 2);
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
	
	
	
	
	
	
	
	
	public MasterManagement addNewCategorySubcategory() {
		// TODO Auto-generated method stub
		clickAddNewBtn();
		clickOnRadioBtnOnAddNewCategory();
		InputBoxCategory_random();
		InputBoxSubCategory_random();
		clickOnSaveBtn();
		return this;		
	}	
	public MasterManagement editNewCategorySubcategory() {
		// TODO Auto-generated method stub
		clickEditBtn();
		clickOnRadioBtnOnAddNewCategory();
		ClickTextBoxSubCategory();
		clearChooseCategoryTextBox();
		InputBoxSubCategory_random();
		ClickTextBoxCategory();
		clearMainCategoryTextBox();
		InputBoxCategory_random();		
		clickOnSaveBtn();
		return this;		
	}
	public MasterManagement deleteCategory() {
		// TODO Auto-generated method stub
		clickDeleteBtn();
		clickYesBtn();
		return this;		
	}
	public MasterManagement bulkDeleteCategory() {
		// TODO Auto-generated method stub
		clickSelectSubcheckbox();
		clickBulkDelete();
		clickYesBtn();
		return this;
	}

	public MasterManagement exportCategoryItem() {
		// TODO Auto-generated method stub
		clickMasterCheckBoxes();
		clickExport();
		clickExportButtomTray();
		clickMasterCheckBoxes();
		return this;
		
	}

	public MasterManagement updateCategory() {
		// TODO Auto-generated method stub
		clickUpdateBtn();
		clickUpdateCategory();		
		clearChooseCategoryTextBox();
		ui_wait(5);
		selectDropDownValue();
		InputBoxCategory_random();
		UpdateBtnOnPopUp();
		return this;
		
	//Contract supplier master
			
		}

	public MasterManagement addNewContractsupplier() {
		// TODO Auto-generated method stub
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
	public MasterManagement bulkDeleteContractsupplier() {
		// TODO Auto-generated method stub
		clickSelectSubcheckbox();
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
}


		
	

			
	

	
	

	
		
	

	
	
	
	
	
	
	
	
	
	
		
		
		
			
	
	
	
	

