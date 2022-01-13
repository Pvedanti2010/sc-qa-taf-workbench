package com.supplycopia.tempate.base;

import org.openqa.selenium.support.PageFactory;

import com.supplycopia.base.Capability;

public class BasePage extends Capability {

	
	 protected BasePage(){
		ui_setDriver();
		PageFactory.initElements(ui_getUIDriver(), this);
	}
	
}
