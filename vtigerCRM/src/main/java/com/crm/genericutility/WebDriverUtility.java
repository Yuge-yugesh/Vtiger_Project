package com.crm.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * 
	 * @param driver
	 */
	
	public void rightClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrolling(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();;
		act.scrollByAmount(100,200).perform();;
	}
	/**
	 * 
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source,target);
	}
	/**
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
		
	}
	/**
	 * 
	 * @param driver
	 * @param nameorid
	 */
	public void switchToFrame(WebDriver driver,String nameorid) {
		driver.switchTo().frame(nameorid);
		
	}
	/**
	 * 
	 * @param driver
	 * @param frameElement
	 */
	public void switchToFrame(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void jsClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0]", element);
	}
	/**
	 * 
	 * @param driver
	 * @param X
	 * @param Y
	 */
	public void jsScroll(WebDriver driver,int X,int Y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("Window.ScrollBy", "+X+","+Y+");
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	/**
	 * 
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * 
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * 
	 * @param driver
	 * @param data
	 */
	public void switchToAlertAndSendKeys(WebDriver driver,String data) {
		driver.switchTo().alert().sendKeys(data);;
	}
	/**
	 * 
	 * @param element
	 * @param index
	 */
	public void selectDropdown(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void selectDropdown(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public WebDriver driver;
	/**
	 * 
	 */
	public void switchToAlertAndGetText() {
		Alert popup = driver.switchTo().alert();
		popup.getText();
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void takeScreenShot() throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot"+time+".png");
		FileHandler.copy(temp, dest);
	}
	/**
	 * 
	 */
	public void navigateBack() {
		driver.navigate().back();
	}
	/**
	 * 
	 */
	public void navigateForward() {
		driver.navigate().forward();
	}
	/**
	 * 
	 */
	public void naviagateRefresh() {
		driver.navigate().refresh();
	}
	/**
	 * 
	 * @param referencevariable
	 */
	public void scrolltillBottom(String referencevariable) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", referencevariable);
	}
	/**
	 * 
	 */
	public void getColor() {
		driver.get("https://demowebshop.tricentis.com/register");
		String cssValue = driver.findElement(By.xpath("//input[@value='Register']")).getCssValue("color");
		System.out.println(cssValue);
	}
	/**
	 * 
	 */
	public void closeWindow() {
		driver.close();
	}
	/**
	 * 
	 */
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * 
	 */
	public void explicitWait() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	/**
	 * This method used to switch driver control to window based url
	 * @param driver
	 * @param url
	 */
	public void switchToWindow(WebDriver driver,String url) {
		//Step1: Capture WindowIDS
		Set<String> allWindowID = driver.getWindowHandles();
		//Step2: Travel Through all the Windows
		for(String id:allWindowID) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(url)) {
				break;
			}
			
		}
	}
}
