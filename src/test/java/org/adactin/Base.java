package org.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	 public static WebDriver driver;
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

	public void maxWindow() {
		driver.manage().window().maximize();
	}

	public void dragAndDrop(Actions ac, WebElement source, WebElement target) {
		ac.dragAndDrop(source, target).perform();
	}

	public void mousehOver(Actions ac, WebElement element) {
		ac.moveToElement(element).perform();
	}

	public void contextClick(Actions ac, WebElement element) {
		ac.contextClick(element).perform();
	}

	public void doubleClick(Actions ac, WebElement element) {
		ac.doubleClick(element).perform();
	}
	public void alertAccept(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public void alertDismiss(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	public void alertPrompt(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.sendKeys("Hello java");
		al.accept();
	}
	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String elementGetAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}
	public void selectByVisibleText(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void deselectByVisibleText(WebElement element,String text) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	public void selectByValue(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByValue(text);
	}
	public void deselectByValue(WebElement element,String text) {
		Select sel = new Select(element);
		sel.deselectByValue(text);
	}
	public void selectByIndex(WebElement element,int num) {
		Select sel = new Select(element);
		sel.selectByIndex(num);
	}
	public void deselectByIndex(WebElement element,int num) {
		Select sel = new Select(element);
		sel.deselectByIndex(num);
	}
	public List<WebElement> getOptions(WebElement element){
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		return options;
	}
	public boolean isMultiple(WebElement element){
		Select sel = new Select(element);
		boolean multiple = sel.isMultiple();
		return multiple;
	}
	public WebElement getFirstSelectedOption(WebElement element){
		Select sel = new Select(element);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		return firstSelectedOption;
	}
	public List<WebElement> getAllSelectedOptions(WebElement element){
		Select sel = new Select(element);
		List<WebElement> options = sel.getAllSelectedOptions();
		return options;
	}
	
	public void deSelectAll(WebElement element){
		Select sel = new Select(element);
		sel.deselectAll();
	}
	public String excelRead(String fileLoc, String sheetName,int rowNo,int cellNo) throws IOException {
		File file = new File(fileLoc);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if(cellType == 1 ) {
			String name = cell.getStringCellValue();
			return name;
		}
		if(cellType == 0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				String name = new SimpleDateFormat("dd-MMM-yy").format(cell.getStringCellValue());
				return name;
			}
			 else {
					String name = String.valueOf(cell.getNumericCellValue());
					return name;
				}
		}
		
		return null;
	}
	
	public void excelWrite(String fileLoc, String sheetName,int rowNo,int cellNo,String data) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		Sheet createSheet = workbook.createSheet(sheetName);
		Row createRow = createSheet.createRow(rowNo);
		Cell createCell = createRow.createCell(cellNo);
		createCell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(new File(fileLoc));
		workbook.write(outputStream);
		System.out.println("Excel write Done.....");
	}
	public void excelUpdate(String fileLoc, String sheetName,int rowNo,int cellNo,String data) throws IOException {
		File file = new File(fileLoc);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet createSheet = workbook.getSheet(sheetName);
		Row createRow = createSheet.createRow(rowNo);
		Cell createCell = createRow.createCell(cellNo);
		createCell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		System.out.println("Excel update Done.....");
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
}

