package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler;

public class PractiseCountHyperlink {

	
	public static void main(String[] args) {
		
		//launch web driver
				System.setProperty("Webdriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//open chrome
				driver.get("https://www.calculator.net/");
				//maximize browser
				driver.manage().window().maximize();
				
				
				List<WebElement> eleList=driver.findElements(By.tagName("a"));
				
				
				for(WebElement ele:eleList){
					System.out.println(ele.getText());
				}
				
				System.out.println(eleList.size());
				
				driver.close();
				
				
	}
	
}
