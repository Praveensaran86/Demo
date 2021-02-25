package org.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
@Test
private void tc0() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
private void tc1() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver =  new EdgeDriver();
	driver.get("https://www.facebook.com/");
}


}
	
