package com.sel;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DradAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	driver.manage().window().maximize();
	FluentWait<WebDriver> u = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(1000)).pollingEvery(Duration.ofSeconds(10)).ignoring(Throwable.class);
	WebElement source = driver.findElement(By.id("draggable"));
	u.until(ExpectedConditions.elementToBeSelected(source));
	WebElement target = driver.findElement(By.id("droppable"));
	Actions acc = new Actions(driver);
	acc.dragAndDrop(source, target).perform();
	driver.quit();
	
	
	
	
	}

}
