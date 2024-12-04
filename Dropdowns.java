package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		//launch web driver
				System.setProperty("Webdriver.chrome.driver", "C:\\Users\\10738451\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//open chrome
				driver.get("https://sarathi.parivahan.gov.in/sarathiservice/stateSelection.do");
			//	driver.manage().window().maximize();
				
				
		WebElement ele=driver.findElement(By.id("stfNameId"));
			Select dropdown=new Select(ele);
			
//			dropdown.selectByIndex(1);
//			dropdown.selectByValue("AN");
			
			if(dropdown.isMultiple()) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
			
			List<WebElement> list=dropdown.getOptions();
			
			for(WebElement l:list) {
				System.out.println(l.getText() + l.getSize());
			}
		
				
			
				
	}
	
}

