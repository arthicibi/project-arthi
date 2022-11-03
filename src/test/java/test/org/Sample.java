package test.org;

//import org.openqa.selenium.support.ui.Select;
import org.webbelement.Login;
import org.webbelement.Register;

import Baseclass.Base;

public class Sample extends Base{
	public static void main(String[] args) {
		launchBrowser("chrome");
		implicitlyWait(10);
		urlLaunch("https://www.facebook.com/");
		Login l=new Login();
		
		sendkeys(l.getTxtUsername(),"arthi");
		sendkeys(l.getTxtPassword(),"1234");
		click(l.getBtnLogin());
		
	
			}
	

}
