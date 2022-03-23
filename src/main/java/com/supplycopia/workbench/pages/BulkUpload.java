package com.supplycopia.workbench.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supplycopia.report.Log;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;



public class BulkUpload extends BasePage {

	
	
	
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
	
	@FindBy(xpath = "//div[@class='uploadContent']//button[@class='uploadBtn']" )
	WebElement fileUploadPopUp_btn;
	
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
	
	@FindBy(xpath = "//app-workbench-success-dialog//p[contains(text(),'All files have been uploaded!')]")
	WebElement successMessage;
	
	@FindBy(xpath = "//div[text()='All Done!']")
	WebElement uploadSuccessMessage;

	String ListFromMatch="//div[@id='cdk-drop-list-1']/div[%s]/span";
	String ListToMatch="//div[@id='cdk-drop-list-0']/div[%s]";
	String ListToMatchWithText=	"//div[@id='cdk-drop-list-0']/div[count(//div[@class='drag-scroll']/div[@class='drag-col']/div/span[normalize-space(text())='%s']/../preceding-sibling::*)+1]";
	String ListFromMatchWithText="//div[@id='cdk-drop-list-1']//span[normalize-space(text())='%s']/parent::div";
	public BulkUpload(){	
    		
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
	
	public BulkUpload selectCustomeSet(String customeSet) {
		// TODO Auto-generated method stub
		ui_wait((int)Pause.V_SMALL);
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
		String completeFile = System.getProperty("user.dir")+"/"+Configuration.get("uploadFilePath")+"//"+file;
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
	
	public BulkUpload dragHeaderWithIndex(String fromRowItem,String toRowItem) {
		// TODO Auto-generated method stub
		ui_wait(2);
		ui_clickHoldAndDrop(ui_getElementWithXpath(String.format(ListFromMatch,fromRowItem)),ui_getElementWithXpath(String.format(ListToMatch, toRowItem)));
	    return this;
	}
	
	public BulkUpload dragHeaderWithName(String fromRowItem,String toRowItem) {
		// TODO Auto-generated method stub
		ui_wait(2);
		ui_clickHoldAndDrop(ui_getElementWithXpath(String.format(ListFromMatchWithText,fromRowItem)),ui_getElementWithXpath(String.format(ListToMatchWithText, toRowItem)));
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
		ui_IsElementPresent(ui_waitForElementToDisplay(successMessage, Pause.HIGH),"5");
		return this;	
	}
	public BulkUpload ui_wait(String time) {
		ui_wait(Integer.parseInt(time));
		return this;	
	}
	}
		
	







