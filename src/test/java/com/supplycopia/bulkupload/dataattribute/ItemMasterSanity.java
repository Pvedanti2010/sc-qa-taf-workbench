package com.supplycopia.bulkupload.dataattribute;

import org.testng.annotations.Test;


import com.supplycopia.workbench.base.BaseTest;
import com.supplycopia.workbench.pages.LoginPage;

/**
 * @author: Sonu Mehta
 *
 */

public class ItemMasterSanity extends BaseTest{

	@Test(groups = {"itemClass","sanity" })
	public void ItemMasterSanityTest() throws Throwable {

		new 
		LoginPage().
		login("qauser").	
		validatePageLoad().
		navigateToWorkbench().
		validatePageLoad().
		navigateToItemMaster().
		validateItemMasPageLoad();
		
		}
	
	}

	

	


