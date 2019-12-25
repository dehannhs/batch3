package com.hp.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(linkText="Input Forms")
	public WebElement inputFormLink;
	
	@FindBy(linkText="Simple Form Demo")
	public WebElement simpleFormLink;
	
@FindBy(id="user-message")
public WebElement testBoxFiled;
	
	@FindBy(xpath = "//*[@id=\"get-input\"]/button")
	public WebElement showMessageButton;
	
	  
	@FindBy(id = "display")
	public WebElement messageDispayed;
	
	
	
	
	

}
