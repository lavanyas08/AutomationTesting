package com.example.day_9;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day9_1 {
	
	day9_1_1 obj=new day9_1_1();
	  @Test(dataProvider="AddTest")
	  public void addmethod(int a,int b,int expected) {
		  int result=obj.add(a,b);
		  Assert.assertEquals(expected,result);
	  }
	  @Test(dataProvider="SubTest")
	  public void submethod(int a,int b,int expected) {
		  int result=obj.sub(a,b);
		  Assert.assertEquals(expected,result);
	  }
	  @Test(dataProvider="MulTest")
	  public void multiplymethod(int a,int b,int expected) {
		  int result=obj.mutiply(a,b);
		  Assert.assertEquals(expected,result);
	  }
	  @Test(dataProvider="DivTest")
	  public void divmethod(int a,int b,int expected) {
		  int result=obj.div(a,b);
		  Assert.assertEquals(expected,result);
	  }
	  @DataProvider
	  public Object[][] AddTest(){
		  return new Object[][] {
			  {1,1,2},{2,2,4}
		  };
	  }
	 @DataProvider
	 public Object[][] SubTest() {
	 return new Object[][]{
		 {3,2,1},{6,8,-2}
};
}
	 @DataProvider
	  public Object[][] MulTest(){
		  return new Object[][] {
			  {1,3,3},{2,2,4},
		  };
	  }
	 @DataProvider
	  public Object[][] DivTest(){
		  return new Object[][] {
			  {1,1,1},{2,2,1}
		  };
	  }
}