package com.supplycopia.workbench.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.supplycopia.report.Log;
import com.supplycopia.utils.StringUtility;
import com.supplycopia.utils.Wait;
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
	@FindBy(xpath = "//span//input[@Id=\"priceInput-Category-61d7f4867d57008a31c32724\"]")
	WebElement category_textBox;
	@FindBy(xpath = "//span//input[@Id=\"priceInput-Subcategory-61d7f4867d57008a31c32724\"]")
	WebElement subCategory_textBox;
	@FindBy(xpath = "//span[@class=\"action-save-icon mr-2\" or contains(.,'Save')]")
	WebElement Save_btn;
	@FindBy(xpath = "//div[@id=\"container-Category-61d7f4867d57008a31c32724\"]")
	WebElement suggetion_btn;
	@FindBy(xpath = "//option[@class=\"ng-star-inserted\"]")
	WebElement subSuggetion_btn;
	@FindBy(xpath = "//td//div//span[@class=\"mat-tooltip-trigger action-doc-management-icon\"]")
	WebElement documnetManage_btn;
	@FindBy(xpath = "//span[@class=\"textLink\" or contains(.,'Browser')]")
	WebElement browser_btn;
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
	
	//img[@ngbtooltip="Download the file"]
	//img[@ngbtooltip="Delete the uploaded file"]
	//button//span[@class="deleteText" and contains(.,'Delete All')]
	//button//span[@class="downloadText" and contains(.,'Download All')]
	//button[@type="submit" and contains(.,'Save')]
	
	public Workbench(){	

	}

	public Workbench validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementPresent(ui_waitForElementToAppear(pageIdentifier_ele,Wait.MEDIUM));
		ui_IsElementPresent(ui_waitForElementToAppear(bulkUpload_lnk,Wait.MEDIUM));
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}

	public BulkUpload navigateToBulkUpload() {
		// TODO Auto-generated method stub
		ui_click(bulkUpload_lnk, "Bulk Upload link");
		Log.info("Navigating to Preference card");
		return PageFactory.initElements(ui_getUIDriver(), BulkUpload.class);
	}
	
//	public BulkUpload navigateToMasterManagement() {
//		// TODO Auto-generated method stub
//		ui_click(masterManagement_lnk, "Master Management link");
//		Log.info("Navigating to Workbanch");
//		return PageFactory.initElements(ui_getUIDriver(), BulkUpload.class);
//	}
	public BulkUpload uploadFromComputer(String file) {
		// TODO Auto-generated method stub
		ui_wait(2);
		browser_btn.sendKeys(file);
		return PageFactory.initElements(ui_getUIDriver(), BulkUpload.class);
		
	}
	public MasterManagement navigateToMasterManagement() {
		// TODO Auto-generated method stub
		ui_click(masterManagement_lnk, "Master Management link");
		Log.info("Navigating to Workbanch");
		return PageFactory.initElements(ui_getUIDriver(), MasterManagement.class);
	}

	public BulkUpload navigateToItemMaster() {
		// TODO Auto-generated method stub
		ui_click(itemMaster_lnk, "ItemMasterLink");
		ui_wait(5);
		ui_click(Master_checkbox, "Masterchechkbox");
		ui_waitForElementToAppear(export_btn, 5);
		ui_click(export_btn, "ExportButton");
		ui_click(selectThis_checkbox, "SelectThisPage");
		ui_click(exportButtomTray_btn,"ExportButtonOnButtomTray");
		ui_click(selectProductData_btn, "SelectProductdataOnBottpmTray");
		ui_waitForElementToAppear(Column_btn, 5);
		ui_click(Column_btn, "ClickColumnButton");		
		ui_click(DeselectAll_CheckBox, "DeselectAllCheckbox");
		ui_wait(5);
		ui_click(Column_btn, "ClickColumnButton");
		ui_waitForElementToAppear(selectAll_CheckBox, 10);
		ui_click(selectAll_CheckBox, "SelectAllchechkbox");
		ui_wait(5);
		ui_click(ChechkBox_btn, "Chechkbox");
		ui_click(Edit_btn, "Edit button");
		ui_clearUsingJavaScript(productDesc_textBox, "productDesc8899");	
		ui_setvalue(productDesc_textBox, "ProductDiscriopnTextBox","productDesc_"+StringUtility.randomGenarotor("number", 4));
		ui_clearUsingJavaScript(category_textBox, "category8899");
		category_textBox.sendKeys("cat");
		ui_wait(5);
		ui_click(suggetion_btn, "Suggetion pop-up");		
		ui_click(subCategory_textBox,"Subcategory text box");		
		ui_click(subCategory_textBox, "subCategory8899");		
		ui_click(subSuggetion_btn, "Suggetion pop-up");	
		ui_click(Save_btn, "ClickOnSaveInActionItemBtn");
		ui_wait(5);
		ui_click(documnetManage_btn, "DocumentManagementInActionItemBtn");
		ui_click(deleteSingleFile_btn, "DeleteSingleFileButton");
		ui_click(downloadSingleFile_btn,"DownloadSigleFileButton");
		ui_click(downloadAll_btn, "DownloadAllFileBtn");
		ui_wait(2);
		ui_click(deleteAll_btn, "DeleteAllFileBtn");
		ui_click(saveOnPop_btn,"SaveOnPopupBtn");
		//ui_click(browser_btn, "Browser button");
		
		ui_wait(5);
		Log.info("Navigating to Workbanch");
		return PageFactory.initElements(ui_getUIDriver(), BulkUpload.class);
		}		
		
		//ui_selectValueFromDropDownByValue(DeselectAll_CheckBox, "Deselect All");
		
		
				
		
	}
	
