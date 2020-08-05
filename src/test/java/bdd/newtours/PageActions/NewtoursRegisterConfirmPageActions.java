package bdd.newtours.PageActions;

import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewtoursRegisterConfirmPageLocators;
import bdd.utilities.SetupDrivers;
import junit.framework.Assert;

public class NewtoursRegisterConfirmPageActions {

	NewtoursRegisterConfirmPageLocators registerConfrPageLocatorsobj;

	public NewtoursRegisterConfirmPageActions() {
		registerConfrPageLocatorsobj = new NewtoursRegisterConfirmPageLocators();
		PageFactory.initElements(SetupDrivers.driver, registerConfrPageLocatorsobj);
	}

	public void verifyThankyouRegister() {
		String confMsg = registerConfrPageLocatorsobj.TxtThankYou.getText();
		Assert.assertEquals(confMsg,
				"Thank you for registering. You may now sign-in using the user name and password you've just entered.");

	}
}