package com.sel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Selinium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html\r\n");	
	 WebElement ad = driver.findElement(By.xpath("(//button[contains(text(),'to display')])[1]"));
ad.click();
	 Alert al = driver.switchTo().alert();
al.accept();
Thread.sleep(3000);
WebElement ad1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
ad1.click();
WebElement ad2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
ad2.click();
Alert a2=driver.switchTo().alert();
String a = a2.getText();
System.out.println(a);
a2.accept();
	 Thread.sleep(3000);	 
	 WebElement ad3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	 ad3.click();	 
	 WebElement ad4 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	 ad4.click();	 
	 Alert a3=driver.switchTo().alert();
	 Thread.sleep(3000);
	 a3.sendKeys("Abdul");	
	 String s = a3.getText();
	 a3.accept();
System.out.println(s);
}
}