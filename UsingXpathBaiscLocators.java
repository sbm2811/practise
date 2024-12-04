package DemoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBaiscLocators {

	
	public static void main(String[] args) {
		//launch web driver
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open website
		driver.get("https://www.saucedemo.com/");
		
		//locate username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//locate password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//click on submit
		driver.findElement(By.className("submit-button")).click();
	//now after submitting page got navigated.Now add one product to cart
		
	String currentWindowHandle=	driver.getWindowHandle();
	driver.switchTo().window(currentWindowHandle);
	driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
}
	
	
}
