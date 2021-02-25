package org.adactin;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Base {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "cc_num")
	private WebElement txtccNum;
	@FindBy(id = "cc_type")
	private WebElement selectccType;
	@FindBy(id = "cc_exp_month")
	private WebElement selectccExpMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement selectccExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement txt_cc_cvv;
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	@FindBy(id = "order_no")
	private WebElement txtOrderNo;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public void setTxtOrderNo(WebElement txtOrderNo) {
		this.txtOrderNo = txtOrderNo;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtccNum() {
		return txtccNum;
	}

	public WebElement getSelectccType() {
		return selectccType;
	}

	public WebElement getSelectccExpMonth() {
		return selectccExpMonth;
	}

	public WebElement getSelectccExpYear() {
		return selectccExpYear;
	}

	public WebElement getTxt_cc_cvv() {
		return txt_cc_cvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
}
