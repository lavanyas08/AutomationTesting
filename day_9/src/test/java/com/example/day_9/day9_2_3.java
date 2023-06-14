package com.example.day_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day9_2_3 {
  @Test
  public void task1()throws InterruptedException {
	  
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.godaddy.com/en-in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String pageTitle=driver.getTitle();
			System.out.print(pageTitle);
			Assert.assertEquals(pageTitle,driver.getTitle());
			Thread.sleep(2000);
			String currUrl=driver.getCurrentUrl();
			System.out.print(currUrl);
			Assert.assertEquals(currUrl,driver.getCurrentUrl());
			Thread.sleep(2000);
			driver.quit();
			System.out.print("Thread count : "+Thread.currentThread().getId());
  }
  @Test
  public void task2() throws InterruptedException {
	    WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
		Thread.sleep(2000);
		driver.quit();
	
	  
}
  @Test
  public void task3() throws InterruptedException{
	    WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
		Thread.sleep(2000);
		String Title=driver.getTitle();
		Assert.assertEquals(Title, driver.getTitle());
		WebElement search=driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/div/div"));
		if(search.isEnabled())
			System.out.println("It is present");
		else
			System.out.println("It is not present");
		Thread.sleep(2000);
		WebElement buyIt=driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button"));
		if(buyIt.isDisplayed())
			System.out.print("It is Displayed");
		else
			System.out.print("It is not Displayed");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("mydomain");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)","");
	        Thread.sleep(1000);
		WebElement addToCart=driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/div/div[2]/button"));
		if(addToCart.isDisplayed())
			System.out.print("Add to cart is displayed");
		else
			System.out.print("Add to cart is not displayed");
		Thread.sleep(2000);
		WebElement price =driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span"));
		if(price.isDisplayed())
			System.out.print("price is displayed");
		else
			System.out.print("price is not displayed");
		Thread.sleep(2000);	
		driver.quit();

		
		
		
		
	  
  }
}
