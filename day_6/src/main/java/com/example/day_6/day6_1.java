package com.example.day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_1 {
	public static void main(String args[]) throws InterruptedException {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("LAVANYA");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("s.lavanya@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("slavanya08");
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)","");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
