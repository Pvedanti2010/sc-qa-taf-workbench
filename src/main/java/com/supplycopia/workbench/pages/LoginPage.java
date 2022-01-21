package com.supplycopia.workbench.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.supplycopia.report.Log;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Wait;
import com.supplycopia.workbench.base.BasePage;


public class LoginPage extends BasePage {

	@FindBy(name = "userId")
	WebElement username_txt;
	
	@FindBy(name = "password")
	WebElement password_txt;
	
	@FindBy(xpath = "//input[@value='Next']" )
	WebElement next_btn;

	@FindBy(xpath = "/html/head/title[contains(text(),'Making Healthcare Affordable')]" )
	WebElement pageIdentifier_ele;
	
	
	
	public LoginPage(){	
	
     ui_launch(Configuration.get("baseUrl"));
     ui_waitForPageLoad();
   	
	}

	
	/*
	 * This method will login into application
	 */
	public LaunchPad login(String username_val, String password_val) {
	
	ui_setvalue(username_txt, "USER_NAME", username_val);
	ui_setvalue(password_txt, "PASSWORD", password_val);
	ui_click(next_btn, "LOGIN_BTN");
	return PageFactory.initElements(ui_getUIDriver(), LaunchPad.class);
	}
	
	
	/*
	 * This method will login into application
	 */
	public LaunchPad login() {
		
		return login(_session.get_dataValue("UserName"),_session.get_dataValue("Password"));
		
	}
	
	
	/*
	 * This method will validate successful page load
	 */
	public LoginPage validatePageLoad() {
		
	    ui_IsElementPresent(ui_waitForElementToAppear(pageIdentifier_ele,Wait.MEDIUM));
	    Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;
	}

	
	
}
