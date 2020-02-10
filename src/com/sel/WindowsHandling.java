package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {	
	public static void main(String[] args) throws InterruptedException, IOException{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("(//div[contains(@class,'wU')])[1]")).click();
		String pwin = driver.getWindowHandle();
		Set<String> cwin = driver.getWindowHandles();
		for (String w : cwin) {			
			if (!w.equals(pwin)) {				
				driver.switchTo().window(w);				
			}			
		}		
		Thread.sleep(3000);
				WebElement more = driver.findElement(By.xpath("//button[text()='Read More']"));
				JavascriptExecutor js =(JavascriptExecutor)driver;		
		js.executeScript("arguments[0].scrollIntoView(true)", more);		
		Thread.sleep(3000);		
		TakesScreenshot tk=(TakesScreenshot)driver;		
		File source = tk.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		int e = d.getSeconds();		
		File target = new File("C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\screenshots"+e+".png");	
	//FileUtils.copyFile(source, target);
	}

}
