package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static WebDriver driver;
	public static JavascriptExecutor js ;
	public static Actions acc;
	public static TakesScreenshot tk;
	
	
public static void getDriver(String url)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get(url);	
}
public static void enterText(String Value,WebElement element) {
	element.sendKeys(Value);
	}

public static void Alt() {
Alert al = driver.switchTo().alert();
al.accept();
}

public static String  curl() {
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	return currentUrl;
	}

public static  String title()
{
	String heading = driver.getTitle();
	System.out.println(heading);
	return heading ;
	
}

public static void clk(WebElement element)

{
	
	element.click();

}

public static void wh()
{
	String windowHandle = driver.getWindowHandle();
Set<String> windowHandles = driver.getWindowHandles();
for (String s : windowHandles) {
	
	if (!s.equals(windowHandle)) {
		
		driver.switchTo().window(s);
	}
	
	
}

}


public static void scDown(String locator) {
	js= (JavascriptExecutor)driver;
	WebElement sd = driver.findElement(By.xpath(locator));
	
	js.executeScript("arguments[0].scrollIntoView(false)", sd);

}

public static void scup(String Locator) {
	js= (JavascriptExecutor)driver;
	WebElement su = driver.findElement(By.xpath(Locator));
	js.executeScript("arguments[0].scrollIntoView(True)", su);
	
	
}

public static String gAt(String locator)
{	js= (JavascriptExecutor)driver;
	WebElement a = driver.findElement(By.xpath(locator));
	
	Object d = js.executeScript("return arguments[0].getAttribute('value')",a);
	String s = (String)d;
	return s;
	

}

public static void dragD (String Locator,String locator1) {
	acc=new Actions (driver);
	WebElement source = driver.findElement(By.xpath(Locator));
	WebElement target = driver.findElement(By.xpath(locator1));
	
	acc.dragAndDrop(source, target).perform();
	
}	

public static void  dclk(String Locator)
{
	acc=new Actions (driver);
	
	WebElement source = driver.findElement(By.xpath(Locator));
	
	acc.moveToElement(source).perform();
}

public static void rclk(String Locator) {
	acc=new Actions (driver);
WebElement source = driver.findElement(By.xpath(Locator));
acc.contextClick(source);
}

public static void ss() throws IOException {
	
	 tk=(TakesScreenshot)driver;		
	File source = tk.getScreenshotAs(OutputType.FILE);
	Date d = new Date();
	int e = d.getSeconds();		
	File target = new File("C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\screenshots\\facebook"+e+".png");	
	FileUtils.copyFile(source, target);
	
	
	
}

}













