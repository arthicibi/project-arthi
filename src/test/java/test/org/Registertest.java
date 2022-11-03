package test.org;

import org.webbelement.Register;

import Baseclass.Base;

public class Registertest extends Base
{
	public static void main(String[] args) {
		
	launchBrowser("chrome");
	implicitlyWait(10);
	urlLaunch("https://www.facebook.com/");
	Register r=new Register();
    click(r.getCrtbtn());
    sendkeys(r.getFirstname(),"arthi");
    sendkeys(r.getLastname(),"cibi");
    sendkeys(r.getMobileno(),"8825723834");
    sendkeys(r.getNewpassword(),"145652");
    selectByIndex(r.getDate(),19);//we need to pass the index
    selectbyvalue(r.getMonth(), "5");//inside the select class what given in the value attribute that we need to give
    selectbyvisibletext(r.getYear(), "1989");
    
	
	}
}
