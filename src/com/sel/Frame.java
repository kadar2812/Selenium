package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	
	driver.switchTo().frame(0);
	 driver.findElement(By.xpath("//img[@alt='continue']")).click();
	
	Alert al =driver.switchTo().alert();
	al.accept();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	WebElement terms = driver.findElement(By.xpath("//a[contains(@onclick,'openLink')]"));
	terms.click();
	}
}
