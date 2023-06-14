package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTests {
	public static void main(String args[]) {
	    WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

	}

}
