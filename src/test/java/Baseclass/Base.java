package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base

{   
	
	
	public static WebDriver driver;//instance variable bcz we call access for all mtd
	
	//browser launch
	
	
	            //returntype   //mtd name     //which arg will chage again again that need to pass as argument
	public static WebDriver launchBrowser(String bname)
	{
	if(bname.equalsIgnoreCase("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	return driver ;
	
	}
	//tolauchurl
	public static void urlLaunch(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	//time(implicitwait
	public static void implicitlyWait(long a)
	{
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	

	//senkeys
	public static void sendkeys(WebElement e,String a) {
		e.sendKeys(a);
	}
	//click
	public static void click(WebElement e) {
		
     e.click();
	}
	//getcurrenturl
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	
   //  return driver.getCurrentUrl();
	
	}
	//quit
	public static void quit() {
	driver.quit();

	}
	//gettext
	public static String getText(WebElement e) 
	{
	String text = e.getText();
	return text;
    }
	//getattribute
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	//movetoelement
	public static void moveTOElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	
	//selectbyindex
	public static void selectByIndex(WebElement e,int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
    }
	
	//selectbyvalue
	public static void selectbyvalue(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByValue(value);
     }
	//select by visisbletext
	public static void selectbyvisibletext(WebElement e,String text) {
		Select s=new Select(e);
		s.selectByVisibleText(text);
     }
	
	//get attribute inner text
	public static String getAttributeInnerText(WebElement e) {
		String attribute = e.getAttribute("innerText");
		return attribute;

    }
	//double click
    public static void doubleClick(WebElement e)
    {
		Actions a=new Actions(driver);
        a.contextClick(e).perform();
	
    }
    //drag and drop "get option"
    
//   public static String getOptions(WebElement e)
//    {
//    	Select s=new Select(e);
//    	List<WebElement> options = s.getOptions();
//   	for(int i=0;i<options.size();i++)
//    	{
//    		WebElement element = options.get(i);
//    		String text = element.getText();
//    		return text;
//    	}
//
//   }
    
    
    //double click
    
    public static void doubleClick(WebDriver e)
    {
    	Actions a=new Actions(e);
    	a.doubleClick().perform();
    }
    //down arrow using robot class
    public static void downArrow() throws AWTException
    {
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    }
    
    //enter using robot class
    
    public static void enter() throws AWTException
    {
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);

    }
    // ctrl+a(select) using robot
    
    public static void select() throws AWTException
    {
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_A);
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_A);

    }
	
	
	
	
	
		
	
	

}
