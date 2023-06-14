package com.example.day_9;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{
 
  public void onTestStart(ITestResult tr) {
	  System.out.print("Test Started");  
	  }
  public void onTestSuccess(ITestResult tr) {
	  System.out.print("Test passed");  
	  }

  public void onTestFailuure(ITestResult tr) {
	  System.out.print("Test failed");  
	  }

  public void onTestSkipped(ITestResult tr) {
	  System.out.print("Test Skipped");  
	  }

}
