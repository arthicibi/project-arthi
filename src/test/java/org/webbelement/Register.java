package org.webbelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Base;

public class Register extends Base {
     	public Register()
     	{
    		PageFactory.initElements(driver, this);

     	}
     	@FindBy(xpath="(//a[@role='button'])[2]")
     	private WebElement crtbtn;
     	
     	@FindBy(xpath="(//input[@type='text'])[2]")
     	private WebElement firstname;
     	
     	@FindBy(xpath="(//input[@type='text'])[3]")
     	private WebElement lastname;
     	
     	@FindBy(xpath="(//input[@type='text'])[4]")
     	private WebElement mobileno;
     	
     	@FindBy(xpath="(//input[@type='password'])[2]")
     	private WebElement newpassword;
     	
     	@FindBy(id="day")
     	private WebElement date;
     	
     	@FindBy(id="month")
     	private WebElement month;
     	
     	@FindBy(id="year")
     	private WebElement year;
     	
     	@FindBy(name="sex")
     	private WebElement gender;

		public WebElement getCrtbtn() {
			return crtbtn;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getMobileno() {
			return mobileno;
		}

		public WebElement getNewpassword() {
			return newpassword;
		}

		public WebElement getDate() {
			return date;
		}

		public WebElement getMonth() {
			return month;
		}

		public WebElement getYear() {
			return year;
		}

		public WebElement getGender() {
			return gender;
		}
}
