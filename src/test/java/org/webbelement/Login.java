package org.webbelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Base;

public class Login extends Base
{
	public Login()//constuctor
	{
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="email")
	private WebElement txtUsername;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	//Getter


	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	

}
