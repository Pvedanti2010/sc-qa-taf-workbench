package com.supplycopia.workbench.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supplycopia.report.Log;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;



public class LaunchPad extends BasePage {

	
	@FindBy(xpath = "//div[@class='greet-text' and text()=' Welcome Back! ']" )
	WebElement pageIdentifier_ele;
	
	@FindBy(xpath = "//p[text()='Procedure Cards']" )
	WebElement procedureCard_ele;
	
	@FindBy(xpath = "//p[text()='VIM-Workbench']/../../../div/p[contains(text(),'Start Using')]" )
	WebElement procedureCardStart_lnk;
	
	public LaunchPad(){	
    		
	}

	public LaunchPad validatePageLoad() {
		// TODO Auto-generated method stub
		ui_IsElementDisplay(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM));
		ui_IsElementDisplay(ui_waitForElementToDisplay(procedureCard_ele,Pause.MEDIUM));
		ui_IsElementDisplay(ui_waitForElementToDisplay(procedureCardStart_lnk,Pause.MEDIUM));
		Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
		return this;
	}

	public Workbench navigateToWorkbench() {
		// TODO Auto-generated method stub
		
		ui_click(procedureCardStart_lnk, "Procedure button");
		Log.info("Navigating to Preference card");
	    return PageFactory.initElements(ui_getUIDriver(), Workbench.class);
	}

}
