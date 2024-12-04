package DemoTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceWebsite {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		List<WebElement> ele= driver.findElements(By.tagName("a"));
		

		for(WebElement list:ele) {
			System.out.println(list.getText());
			
		}
		System.out.println(ele.size());
		
		driver.quit();





	}

}
