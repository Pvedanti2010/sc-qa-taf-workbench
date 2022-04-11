package com.supplycopia.workbench.pages;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.supplycopia.report.Log;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;

public class BulkUpload extends BasePage {

	@FindBy(xpath = "//ul[@class='process-step']/li/span[text()='File Upload']")
	WebElement pageIdentifier_ele;

	@FindBy(xpath = "//select[@formcontrolname='dataType']")
	WebElement dataType_sel;

	@FindBy(xpath = "//select[@formcontrolname='customSet']")
	WebElement customeSet_sel;

	@FindBy(xpath = "//button[text()='Upload']")
	WebElement upload_btn;

	@FindBy(xpath = "//button/span[text()='Proceed To Upload']")
	WebElement proceedToUpload_btn;

	@FindBy(xpath = "//div[@class='uploadContent']//button[@class='uploadBtn']")
	WebElement fileUploadPopUp_btn;

	@FindBy(xpath = "//input[@id='fileDropRef']")
	WebElement uploadFile_txt;

	@FindBy(xpath = "//button[@class='importBtn']")
	WebElement importFile_btn;

	@FindBy(xpath = "//button[@class='saveBtn']")
	WebElement saveAndProceed_btn;

	@FindBy(xpath = "//a[@class='text-danger']")
	WebElement validationIssues;

	@FindBy(xpath = "//span[@class='totalCount']")
	WebElement totalRecords;

	@FindBy(xpath = "//app-confirm-dialog//button[text()='Yes']")
	WebElement updateConfirmation;
	
	@FindBy(xpath = "//td//div//span[1]//img[@class=\"ng-star-inserted\"]")
	WebElement deleteFileName_CrossIcon;
	@FindBy(xpath = "//button[contains(@class,'confirmButton')]")
	WebElement ConfirmDelete_btn;

	
	
	@FindBy(xpath = "//app-workbench-success-dialog//p[contains(text(),'All files have been uploaded!')]")
	WebElement successMessage;
	@FindBy(xpath = "//app-workbench-success-dialog//p[contains(text(),'All file have been deleted!')]")
	WebElement deleteConfirmMessage;

	@FindBy(xpath = "//div[text()='All Done!']")
	WebElement uploadSuccessMessage;

	@FindBy(xpath = "//img[@class='validateIcon']//../..")
	List<WebElement> flagIcons;
	@FindBy(xpath = "//td[3]//input[contains(@class,'inputCategory ng-star-inserted') or contains(@class,'inputwithout ng-star-inserted')]")
	List<WebElement> prdtName;

	@FindBy(xpath = "//td[contains(@class,'isFalse')]//div/img[@class=\"validateIcon\"]")
	List<WebElement> errorFlagIcons;
	@FindBy(xpath = "//td[contains(@class,'isFalse') and contains(@class,'Category')]//input")
	List<WebElement> categoryList;
	@FindBy(xpath = "//td[contains(@class,'isFalse') and contains(@class,'Country')]//input")
	List<WebElement> countryList;
	@FindBy(xpath = "//td[contains(@class,'isFalse') and contains(@class,'Account')]//input")
	List<WebElement> accountList;
	@FindBy(xpath = "//td[contains(@class,'isFalse') and contains(@class,'Contract')]//input")
	List<WebElement> contractIdList;
	@FindBy(xpath = "//td[contains(@class,'isFalse') and contains(@class,'Supplier')]//input")
	List<WebElement> supplierList;
	@FindBy(xpath = "//div[contains(@class,'drag cardListItems')]")              //ReviewEditScreen
	List<WebElement> draganddropItemsList;
	@FindBy(xpath = "//td[contains(@class,'isFalse')]//div[@class=\"cdk-drop-list\"]")              //ReviewEditScreen
	List<WebElement> droplocationList;
	

	@FindBy(xpath = "//td[contains(@class,'isFalse') and contains(@class,'Subcategory')]//input")
	List<WebElement> subCategoryList;

	@FindBy(xpath = "//div[contains(@id,'container-Category')]//span[1]")
	List<WebElement> categoryDropDownList;
	@FindBy(xpath = "//div[contains(@id,'container-Subcategory')]//span[1]")
	List<WebElement> subcategoryDropDownList;
	@FindBy(xpath = "//div[contains(@id,'container-Country')]//span[1]")
	List<WebElement> countryDropDownList;
	@FindBy(xpath = "//div[contains(@id,'container-Account')]//span[1]")
	List<WebElement> accountDropDownList;
	@FindBy(xpath = "//div[contains(@id,'container-Contract')]//span[1]")
	List<WebElement> contractIdDropDownList;
	@FindBy(xpath = "//div[contains(@id,'container-Supplier')]//span[1]")
	List<WebElement> supplierDropDownList;
	
	
	
	
	
	
	String ListDocumentItems = "//div[%s][contains(@class,'drag cardListItems')]";
	String ListToFile = "//td[contains(@class,'isFalse')]//*[contains(@id,'cdk-drop-list')][%s]";
	String ListFromMatch = "//div[@id='cdk-drop-list-1']/div[%s]/span";
	String ListToMatch = "//div[@id='cdk-drop-list-0']/div[%s]";
	String ListToMatchWithText = "//div[@id='cdk-drop-list-0']/div[count(//div[@class='drag-scroll']/div[@class='drag-col']/div/span[normalize-space(text())='%s']/../preceding-sibling::*)+1]";
	String ListFromMatchWithText = "//div[@id='cdk-drop-list-1']//span[normalize-space(text())='%s']/parent::div";

	public BulkUpload() {

	}

	public BulkUpload validatePageLoad() {
		// TODO Auto-generated method stub

		ui_IsElementPresent(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM),"5");
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

	public BulkUpload clickDataTypeInputBox() {
		// TODO Auto-generated method stub
		ui_wait((int) Pause.V_SMALL);
		ui_click(dataType_sel, "click data type Field");
		ui_wait((int) Pause.SMALL);
		return this;
	}

	public BulkUpload clickCustomeSetInputBox() {
		// TODO Auto-generated method stub
		ui_wait((int) Pause.V_SMALL);
		ui_click(customeSet_sel, "customeSet");
		ui_wait((int) Pause.SMALL);
		return this;
	}
	public BulkUpload selectCustomeSet(String customeSet) {
		// TODO Auto-generated method stub
		ui_wait((int) Pause.V_SMALL);
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
		String completeFile = System.getProperty("user.dir")+Configuration.get("uploadFilePath")+"\\"+file;
		ui_waitForElementToDisplay(fileUploadPopUp_btn, Pause.MEDIUM);
		uploadFile_txt.sendKeys(completeFile);

		return this;
	}

	public BulkUpload validateUploadSuccessMessage() {
		ui_IsElementPresent(ui_waitForElementToDisplay(uploadSuccessMessage, Pause.HIGH),"5");
		return this;	

	}

	public BulkUpload clickImportFile() {
		// TODO Auto-generated method stub
		ui_click(importFile_btn, "Proceed To Upload button");
		return this;
	}

	public BulkUpload dragHeaderWithIndex(String fromRowItem, String toRowItem) {
		// TODO Auto-generated method stub
		ui_wait(2);
		ui_clickHoldAndDrop(ui_getElementWithXpath(String.format(ListFromMatch, fromRowItem)),
				ui_getElementWithXpath(String.format(ListToMatch, toRowItem)));
		return this;
	}

	public BulkUpload dragHeaderWithName(String fromRowItem, String toRowItem) {
		// TODO Auto-generated method stub
		ui_wait(2);
		ui_clickHoldAndDrop(ui_getElementWithXpath(String.format(ListFromMatchWithText, fromRowItem)),
				ui_getElementWithXpath(String.format(ListToMatchWithText, toRowItem)));
		return this;
	}

	public BulkUpload proceedToReviewAndEdit() {
		// TODO Auto-generated method stub
		ui_click(saveAndProceed_btn, "proceedToReview&Edit");
		return this;
	}

	public BulkUpload insertValueinValidationErrorTable(String CategoryVal, String SubCategoryVal, int index) {
		List<WebElement> listErrorFlag = errorFlagIcons;
		for (int i = 0; i < listErrorFlag.size(); i++) {
			ui_wait(5);
			categoryList.get(0).clear();
			categoryList.get(0).sendKeys(CategoryVal);
			ui_wait(4);
			categoryDropDownList.get(index).click();;
			ui_wait(5);
			subCategoryList.get(0).clear();
			ui_wait(5);
			subCategoryList.get(0).sendKeys(SubCategoryVal);
			ui_wait(4);
			subcategoryDropDownList.get(index).click();
		}

		return this;
	}
 
	public BulkUpload insertValueinValidationErrorPriceTable(String ContractIdVal,String CountryVal,String AccountVal,String SupplierVal,int index) {		
			List<WebElement> listErrorFlag = errorFlagIcons;
			for (int i = 0; i < listErrorFlag.size(); i++) {	
			countryList.get(0).clear();
			ui_wait(5);
			countryList.get(0).sendKeys(CountryVal);
			ui_wait(4);
			countryDropDownList.get(index).click();
			ui_wait(10);
			accountList.get(0).clear();
			ui_wait(5);
			accountList.get(0).sendKeys(AccountVal);
			ui_wait(4);
			accountDropDownList.get(index).click();
			ui_wait(10);
			supplierList.get(0).clear();
			ui_wait(5);
			supplierList.get(0).sendKeys(SupplierVal);
			ui_wait(4);
			supplierDropDownList.get(index).click();
			ui_wait(10);
			contractIdList.get(0).clear();
			ui_wait(5);
			contractIdList.get(0).sendKeys(ContractIdVal);
			ui_wait(4);
			contractIdDropDownList.get(index).click();	
			ui_wait(10);

		}

		return this;
	}

	public BulkUpload validateProductNumber(String productNumber) {
		String text = "";
		for (int i = 0; i < flagIcons.size(); i++) {
			String iconClass = flagIcons.get(i).getAttribute("class");
			System.out.println(iconClass);
			if (!iconClass.contains("isFalse")) {
				String txt = prdtName.get(i).getAttribute("value");
				System.out.println("text--" + txt);
				if (txt.contains(productNumber)) {

					text = txt;
					break;
				}
			}

		}
		ui_validateSubstring(text, productNumber);

		return this;
	}

	public BulkUpload checkValidationErrorsOnReviewAndEdit(String numberOfError) {
		// TODO Auto-generated method stub]
		ui_wait(4);
		ui_isElementContainsText(validationIssues, String.format("%s validation issues found", numberOfError));
		return this;
	}

	public BulkUpload checktotalRecordsOnReviewAndEdit(String numberOfRecords) {
		// TODO Auto-generated method stub

		ui_isElementContainsText(totalRecords, String.format("%s records found", numberOfRecords));
		return this;
	}

	public BulkUpload proceedToUpdate() {
		// TODO Auto-generated method stub
		ui_click(saveAndProceed_btn, "proceedToUpdate");
		return this;
	}

	public BulkUpload checkValidationErrorsOnUpdatePage(String numberOfError) {
		// TODO Auto-generated method stub
		ui_wait(4);
		ui_isElementContainsText(validationIssues, String.format("%s validation issues found", numberOfError));
		return this;
	}

	public BulkUpload checktotalRecordsOnUpdatePage(String numberOfRecords) {
		// TODO Auto-generated method stub
		ui_isElementContainsText(totalRecords, String.format("%s records found", numberOfRecords));
		return this;
	}

	public BulkUpload saveAndUpdate() {
		// TODO Auto-generated method stub
		ui_click(saveAndProceed_btn, "proceedToUpdate");
		return this;
	}

	public BulkUpload confirmUpdate() {
		// TODO Auto-generated method stub
		ui_click(updateConfirmation, "Confirmation Yes button");
		return this;
	}

	

	public BulkUpload dragHeaderWithIndexOnreviewEditScreen(String fromRowItem, String toRowItem) {
		// TODO Auto-generated method stub
		//ui_wait(2);
		ui_clickHoldAndDrop(ui_getElementWithXpath(String.format(ListDocumentItems, fromRowItem)),
				ui_getElementWithXpath(String.format(ListToFile, toRowItem)));
		return this;
	}	
	public BulkUpload deleteValidationErrorFileToCrossIcon() {
		// TODO Auto-generated method stub
		ui_click(deleteFileName_CrossIcon, "Confirmation Yes button");		
		ui_click(ConfirmDelete_btn, "Confirmation Yes button");
		return this;
	}
	public BulkUpload validateSuccessMessage() {
			ui_IsElementDisplay(ui_waitForElementToDisplay(successMessage, Pause.HIGH));
			return this;	
		}
	public BulkUpload ui_wait(String time) {
		ui_wait(Integer.parseInt(time));
		return this;	
	}
	public BulkUpload validatedeleteMessage() {
		ui_IsElementDisplay(ui_waitForElementToDisplay(deleteConfirmMessage, Pause.LOW));
		return this;

	}
	public BulkUpload ValueinValidationErrorPriceTable(String ContractIdVal,String CountryVal,String AccountVal,String SupplierVal,int index) {		
		List<WebElement> listErrorFlag = errorFlagIcons;
	for (int i = 0; i < listErrorFlag.size(); i++) {
		deleteValidationErrorFileToCrossIcon();
			validatedeleteMessage();
			dragHeaderWithIndexOnreviewEditScreen("1","1");
	
		}

		return this;
	}

}



	
	


