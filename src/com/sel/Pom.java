package com.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass {
	
public Pom() {
	PageFactory.initElements(driver, this);	
}
@CacheLookup
@FindBy(id="email")
private WebElement userName;
@FindBy(id="pass")
private WebElement passWord;
@FindBy(xpath="//input[@type='submit']")
private WebElement loginBtn;

public WebElement getUserName() {
	return userName;
}
public WebElement getPassWord() {
	return passWord;
}
public WebElement getLoginBtn() {
	return loginBtn;
}

}
