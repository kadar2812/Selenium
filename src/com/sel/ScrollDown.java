package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://facebook.com/");
	WebElement down = driver.findElement(By.xpath("//span[text()=' Facebook © 2020']"));
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(false)",down);
	Thread.sleep(3000);
	WebElement up = driver.findElement(By.id("email"));
	WebElement up1 = driver.findElement(By.id("pass"));
 js.executeScript("arguments[0].scrollIntoView(true)", up);
	js.executeScript("arguments[1].setAttribute('value','abdul')",up,up1);
	Object e = js.executeScript("return arguments[0].getAttribute('value')", up);
	System.out.println(e);
	WebElement log = driver.findElement(By.xpath("//input[@value='Log In']"));
	js.executeScript("arguments[0].click()", log);
	}
	
}
