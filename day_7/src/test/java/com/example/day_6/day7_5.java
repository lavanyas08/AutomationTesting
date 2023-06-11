package com.example.day_6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_5 {
	
//	@Test(priority=1)
//	  public void task1()  {
//		  WebDriverManager.edgedriver().setup();
//		  WebDriver driver=new EdgeDriver();
//		  driver.get("https://www.godaddy.com/en-in");
//		  driver.manage().window().maximize();
//		  String currTitle=driver.getTitle();
//		  Assert.assertEquals(currTitle,driver.getTitle());
//		  String currUrl=driver.getCurrentUrl();
//		  Assert.assertEquals(currUrl,driver.getCurrentUrl());
//		  
//		  driver.quit();
//  }
//	@Test(priority=2)
//	public void task2() throws InterruptedException
//	{
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.godaddy.com/en-in");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
//		Thread.sleep(1000);
//		driver.quit();
//	}
	@Test
	public void task3() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
		Thread.sleep(4000);
		String pageTitle=driver.getTitle();
		System.out.print(pageTitle);
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
		search.sendKeys("mydomain");
		Thread.sleep(1000);
		if(search.isEnabled())
			System.out.println("It is present");
		else
			System.out.print("It is not present");
		Thread.sleep(2000);
		WebElement buyit=driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button"));
		if(buyit.isDisplayed())
			System.out.println("Buy it is present");
		else
			System.out.println("Buy it is not present");
		Thread.sleep(2000);
		buyit.click();
		Thread.sleep(3000);
		WebElement addcart=driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button"));
		if(addcart.isDisplayed())
			System.out.println("add cart is present");
		else
			System.out.println("add cart is not present");
		Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span"));
		if(price.isDisplayed())
			System.out.println("price is present");
		else
			System.out.println("price is not present");
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
