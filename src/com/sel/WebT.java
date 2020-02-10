package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebT {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		List<WebElement> table = driver.findElements(By.tagName("table"));
	     WebElement tb = table.get(0);
		List<WebElement> rows = tb.findElements(By.tagName("tr"));	
		Thread.sleep(3000);
		for (int i = 0; i < rows.size(); i++) {
			WebElement ir = rows.get(i);
			List<WebElement> data = ir.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement id = data.get(j);
				String text = id.getText();
				System.out.println(text);
				if (text.equals("14")) {
					id.click();
					System.out.println("done");
				}
				
			}
		}
	
	}

}
