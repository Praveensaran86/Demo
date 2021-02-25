package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Base {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioHotel;
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getRadioHotel() {
		return radioHotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
