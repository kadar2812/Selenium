package com.sel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Oppo {	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
		WebDriver fb = new ChromeDriver();
		fb.get("https://www.flipkart.com/");		
		WebElement cl = fb.findElement(By.xpath("//button[text()='✕']"));		
		cl.click();
	WebElement ele = fb.findElement(By.xpath("//span[text()='Electronics']"));		
	Actions acc = new Actions(fb);	
	acc.moveToElement(ele).perform();
	WebElement mi = fb.findElement(By.xpath("//a[text()='OPPO']"));
	mi.click();
	Thread.sleep(6000);
List<WebElement> varients = fb.findElements(By.xpath("//a[contains(@class,'Zhf')]"));
	for (WebElement print : varients) {
		String g = print.getAttribute("title");
		System.out.println(g);
	}
	}

}
