package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		

	 WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("abdulkadar2812@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
		
		//WebElement go = driver.findElement(By.xpath("//input [@type='submit']"));
		//go.click();
		
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		male.click();
		
		WebElement tag = driver.findElement(By.xpath("//div[text()="+"It's quick and easy."+"]"));
		String d = tag.getText();
	System.out.println(d);
	
	WebElement tagline = driver.findElement(By.xpath("//span[text()=\'Create an account\']"));
	String s = tagline.getText();
	System.out.println(s);
		
		
		
	}

}
