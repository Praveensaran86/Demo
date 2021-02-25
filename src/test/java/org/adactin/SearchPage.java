package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base {
	@FindBy(id = "location")
	private WebElement selectLocation;
	public WebElement getSelectLocation() {
		return selectLocation;
	}
	public WebElement getSelectHotels() {
		return selectHotels;
	}
	public WebElement getSelectRoomType() {
		return selectRoomType;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	@FindBy(id = "hotels")
	private WebElement selectHotels;
	@FindBy(id = "room_type")
	private WebElement selectRoomType;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
}
