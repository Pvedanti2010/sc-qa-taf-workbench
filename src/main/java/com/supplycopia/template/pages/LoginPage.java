package com.supplycopia.template.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supplycopia.tempate.base.BasePage;
import com.supplycopia.utils.Configuration;

public class LoginPage extends BasePage {

	@FindBy(name = "userId")
	WebElement username_txt;
	
	@FindBy(name = "password")
	WebElement password_txt;
	
	@FindBy(xpath = "//input[@value='Next']" )
	WebElement next_btn;

	public LoginPage(){	
     ui_launch(Configuration.get("baseUrl"));		
	}

	public LaunchPad login(String username_val, String password_val) {
		// TODO Auto-generated method stub
	ui_setvalue(username_txt, "USER_NAME", username_val);
	ui_takeScreenShot(_session.get_testCaseName(),_session.get_testCaseName());
	ui_setvalue(password_txt, "PASSWORD", password_val);
	ui_takeScreenShot(_session.get_testCaseName(), _session.get_testCaseName());
	ui_click(next_btn, "LOGIN_BTN");
	ui_wait(4);
	ui_takeScreenShot(_session.get_testCaseName(), "");
	return PageFactory.initElements(ui_getUIDriver(), LaunchPad.class);
	}

}
