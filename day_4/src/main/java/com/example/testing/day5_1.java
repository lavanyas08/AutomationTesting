package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_1 {
	public static void  main ( String args[])throws InterruptedException  {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		String url="https://j2store.net/free/";
		driver.navigate().to(url);
		String pageTitle=driver.getTitle();
		if(pageTitle.equals("Home"))
			System.out.print("true");
		else
			System.out.print("false");
		
		//WebElement clothingLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Clothing")));
		Thread.sleep(5000);
		// Click on the "Clothing" link
		driver.findElement(By.linkText("Clothing")).click();

		// Get the title of the page
		pageTitle = driver.getTitle();

		// Validate the title of the page is "Shop"
		if (pageTitle.equals("Shop")) {
		    System.out.println("Title is validated: Shop");
		} else {
		    System.out.println("Title validation failed!");
		}

		
		driver.quit();
		
	}

}
