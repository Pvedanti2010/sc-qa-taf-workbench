package com.supplycopia.workbench.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.supplycopia.report.Log;
import com.supplycopia.utils.Wait;
import com.supplycopia.workbench.base.BasePage;



public class Workbench extends BasePage {


	@FindBy(xpath = "//app-workbench-your-apps//div[text()='Your Workbench Apps']" )
	WebElement pageIdentifier_ele;

	@FindBy(xpath = "//div[text()='Bulk Upload']/../..//div[@class='arrow arrow-right']" )
	WebElement bulkUpload_lnk;


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

}
