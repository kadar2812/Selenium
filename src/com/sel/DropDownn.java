package com.sel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownn {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	WebElement mul = driver.findElement(By.id("continentsmultiple"));
	
	Thread.sleep(3000);
	Select s = new Select(mul);
	s.selectByIndex(1);
	s.selectByValue("AUS");
	s.selectByVisibleText("South America");
	List<WebElement> options = s.getOptions();
	
	for (int i = 0; i <options.size(); i++) {
		System.out.println(options.get(i).getText());
	}
	
	List<WebElement> conti = s.getAllSelectedOptions();
	for (WebElement g : conti) {
		
		System.out.println(g.getText());
		
	}
	
	WebElement first = s.getFirstSelectedOption();
	
	System.out.println(first.getText());
	
	}
}
