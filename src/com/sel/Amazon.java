package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='NOT NOW']")).click();
		WebElement heading = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(heading).perform();
		WebElement popular = driver.findElement(By.xpath("//span[text()='Popular Smartphones']"));
		ac.moveToElement(popular).perform();
		popular.click();
		
		Thread.sleep(8000);
		
		List<WebElement> name = driver.findElements(By.xpath("//p[@class='product-title ']"));
	for (WebElement a : name) {
		//String d = a.getAttribute("title");
		//System.out.println(d);
		String s = a.getText();
		System.out.println(s);
		
	}
	}

}
