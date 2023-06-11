package com.example.day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_2 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("lavanya");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("slavanya@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("08-11-03");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("123456778");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("1234567898");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).sendKeys("15615");
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("7851");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("huifhdauiehfu");
		driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("jhaueihfuihvauenvk");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select_1665628361\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
		
		
		
		
	}
	

}
