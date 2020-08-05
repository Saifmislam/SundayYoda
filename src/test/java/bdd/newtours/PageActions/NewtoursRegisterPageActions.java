package bdd.newtours.PageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.NewtoursRegisterPageLocators;
import bdd.utilities.SetupDrivers;

public class NewtoursRegisterPageActions {

	NewtoursRegisterPageLocators NewtoursRegisterPageLocatorsObj;

	public NewtoursRegisterPageActions() {
		NewtoursRegisterPageLocatorsObj = new NewtoursRegisterPageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursRegisterPageLocatorsObj);
	}

	public void fillContactInfo() {
		NewtoursRegisterPageLocatorsObj.FirstName.clear();
		NewtoursRegisterPageLocatorsObj.FirstName.sendKeys("Saif");
		NewtoursRegisterPageLocatorsObj.LastName.clear();
		NewtoursRegisterPageLocatorsObj.LastName.sendKeys("Islam");
		NewtoursRegisterPageLocatorsObj.phone.clear();
		NewtoursRegisterPageLocatorsObj.phone.sendKeys("609-334-2283");
		NewtoursRegisterPageLocatorsObj.email.clear();
		NewtoursRegisterPageLocatorsObj.email.sendKeys("ISaifny@gamil.com");
	}

	public void fillMailingInfo() {

		NewtoursRegisterPageLocatorsObj.address1.sendKeys("9220 91st Ave Apt2");
		NewtoursRegisterPageLocatorsObj.city.sendKeys("Woodhaven");
		NewtoursRegisterPageLocatorsObj.state.sendKeys("NY");
		NewtoursRegisterPageLocatorsObj.postalCode.sendKeys("11421");

		Select mydrpdwn = new Select(NewtoursRegisterPageLocatorsObj.country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
	}

	public void fillUserInfo() {
		NewtoursRegisterPageLocatorsObj.UserName.sendKeys("Saif0071");
		NewtoursRegisterPageLocatorsObj.Password.sendKeys("1234");
		NewtoursRegisterPageLocatorsObj.confirmPassword.sendKeys("1234");
	}

	public void submitRegForm() {
		NewtoursRegisterPageLocatorsObj.SubmitButton.click();
	}

}
