package DemoTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonWebsite {

	public static void main(String[] args) {
	//	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	WebElement drop=	driver.findElement(By.id("searchDropdownBox"));
Select dropdown = new Select(drop);
	List<WebElement> getAll=dropdown.getOptions();

	List<String> options=new ArrayList<String>();
	
	for(WebElement ele:getAll){
	options.add(ele.getText());
	}
	
	List<String> sortedStrings= new ArrayList<String>(options);
	
	Collections.sort(sortedStrings);
	
	if(options.equals(sortedStrings)) {
		System.out.println("Sorted");
	}
	else {
		System.out.println("not");
	}
	
	
//	 for(WebElement ele:getAll) {
//	 if(ele.getText().equals("Computers")) {
//		 ele.click();
//		 break;
//	 }
//		
//	 }
//	
//	 System.out.println( getAll.size());
//
//	
	}
}
