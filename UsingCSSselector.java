package DemoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSselector {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	  //tag#id combination
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=login-button")).click();		
		
		
		String currentWindowHandle=driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//tag.valueofclass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		
	//driver.close();
		
	}

}
