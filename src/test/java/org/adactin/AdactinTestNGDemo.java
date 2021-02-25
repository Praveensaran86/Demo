package org.adactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinTestNGDemo {
	Base base = new Base();
	
@Test
@Parameters({"username","password"})
private void tc0(String userName, String password) throws IOException {
	base.getDriver();
	base.loadUrl("http://www.adactin.com/HotelApp/");
	base.maxWindow();
	LoginPage page = new LoginPage();
	WebElement txtUserName = page.getTxtUserName();
	WebElement txtPassword = page.getTxtPassword();
	WebElement btnLogin = page.getBtnLogin();
	base.type(txtUserName, userName);
	base.type(txtPassword, password);
	base.btnClick(btnLogin);
//	base.excelWrite("C:\\Users\\Vallavan\\eclipse-workspace\\MavenDemoProject\\Excel\\adactin1.xlsx", "TestAdactin", 0, 0, userName);
//	base.excelUpdate("C:\\Users\\Vallavan\\eclipse-workspace\\MavenDemoProject\\Excel\\adactin1.xlsx", "TestAdactin", 1, 0, password);
}
//@Test
//@Parameters({"selectLoc","selectHotel","selectRoomTy"})
//private void tc1(int selectLoc, int selectHotel,int selectRoomTy) throws IOException {
//	SearchPage searchPage = new SearchPage();
//	WebElement selectLocation = searchPage.getSelectLocation();
//	WebElement selectHotels = searchPage.getSelectHotels();
//	WebElement selectRoomType = searchPage.getSelectRoomType();
//	WebElement btnSubmit = searchPage.getBtnSubmit();
//	base.selectByIndex(selectLocation, selectLoc);
//	base.selectByIndex(selectHotels, selectHotel);
//	base.selectByIndex(selectRoomType, selectRoomTy);
//	base.btnClick(btnSubmit);
//}
//@Test
//private void tc2() {
//	SelectHotel hotelPage = new SelectHotel();
//	WebElement radioHotel = hotelPage.getRadioHotel();
//	base.btnClick(radioHotel);
//	WebElement btnContinue = hotelPage.getBtnContinue();
//	base.btnClick(btnContinue);
//}
//@Test
//@Parameters({"username","ccNum","ccType","ccExpMonth","ccExpYear","cc_cvv"})
//private void tc3(String userName,String ccNum,int ccType,int ccExpMonth,int ccExpYear,String cc_cvv) throws InterruptedException, IOException {
//	BookHotel bookPage =  new BookHotel();
//	WebElement txtFirstName = bookPage.getTxtFirstName();
//	base.type(txtFirstName, userName);
//	WebElement txtLastName = bookPage.getTxtLastName();
//	base.type(txtLastName, userName);
//	WebElement txtAddress = bookPage.getTxtAddress();
//	base.type(txtAddress, userName);
//	WebElement txtccNum = bookPage.getTxtccNum();
//	base.type(txtccNum, ccNum);
//	WebElement selectccType = bookPage.getSelectccType();
//	base.selectByIndex(selectccType, ccType);
//	WebElement selectccExpMonth = bookPage.getSelectccExpMonth();
//	base.selectByIndex(selectccExpMonth, ccExpMonth);
//	WebElement selectccExpYear = bookPage.getSelectccExpYear();
//	base.selectByIndex(selectccExpYear, ccExpYear);
//	WebElement txt_cc_cvv = bookPage.getTxt_cc_cvv();
//	base.type(txt_cc_cvv, cc_cvv);
//	WebElement btnBookNow = bookPage.getBtnBookNow();
//	base.btnClick(btnBookNow);
//	Thread.sleep(5000);
//	WebElement txtOrderNo = bookPage.getTxtOrderNo();
//	String orderNo = base.elementGetAttribute(txtOrderNo);
//	System.out.println(orderNo);
//	base.excelUpdate("C:\\Users\\Vallavan\\eclipse-workspace\\MavenDemoProject\\Excel\\adactin1.xlsx", "TestAdactin", 2, 0, orderNo);
//}

}
