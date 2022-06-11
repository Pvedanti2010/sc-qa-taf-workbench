package com.supplycopia.workbench.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supplycopia.report.Log;
import com.supplycopia.utils.Configuration;
import com.supplycopia.utils.Pause;
import com.supplycopia.workbench.base.BasePage;


public class LoginPage extends BasePage {

	@FindBy(name = "userId")
	WebElement username_txt;
	
	@FindBy(name = "password")
	WebElement password_txt;
	
	@FindBy(xpath = "//button[@type=\"submit\" and contains(.,'Next')]" )
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
	public LaunchPad login(String user) {
		String username=Configuration.getEnvironmentVariable("project.user."+user);
		String password=Configuration.getEnvironmentVariable("project.password."+user);
		return login(username,password);
		
	}
	
	
	/*
	 * This method will validate successful page load
	 */
	public LoginPage validatePageLoad() {
		
	    ui_IsElementDisplay(ui_waitForElementToDisplay(pageIdentifier_ele,Pause.MEDIUM));
	    Log.info("Successful navigation is validated for "+this.getClass().getSimpleName());
	    return this;
	}

	
	
}
