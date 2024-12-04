package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class FirstTestCase {
	
	public static void main(String[] args) {
		
		//launch web driver
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open chrome
		driver.get("https://www.saucedemo.com/");
		
		//title
		String s=driver.getTitle();
		System.out.println(s);
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		
		
		
		
	}

}
