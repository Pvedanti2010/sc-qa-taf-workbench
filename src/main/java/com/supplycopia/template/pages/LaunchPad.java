package com.supplycopia.template.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.supplycopia.tempate.base.BasePage;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Wait;

public class LaunchPad extends BasePage {

	
	@FindBy(name = "//app-your-apps/descendant::p[text()='Virtual Item Master']")
	WebElement vim_yourapp;
	
	@FindBy(xpath = "//div[@class='greet-text' and text()=' Welcome back! ']" )
	WebElement pageIdentifier_ele;

	public LaunchPad(){	
    		
	}

	public void validatePageLoad() {
		// TODO Auto-generated method stub
	    ui_waitForElementToAppear(pageIdentifier_ele,Wait.MEDIUM);
	    Reporter.log("Successful navigation is validated",true);
	}

	public void validateAccess() {
		// TODO Auto-generated method stub
		Assert.assertTrue(ui_IsElementPresent(vim_yourapp));
	}

}
