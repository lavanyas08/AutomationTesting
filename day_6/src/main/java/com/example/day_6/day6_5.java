package com.example.day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_5 {

	public static void main(String args[])throws InterruptedException
	{

		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement user=driver.findElement(By.name("username"));
		  user.sendKeys("Admin");
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("admin123");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  Thread.sleep(3000);
		  driver.quit();
  }
	}

