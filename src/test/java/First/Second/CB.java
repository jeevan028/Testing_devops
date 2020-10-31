package First.Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB {
	WebDriver driver;
	//String Bpath=System.getProperty("user.dir");
	
	@BeforeClass
	@Parameters ({"browser"})
	public void set(String ch) {
		
	if(ch.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jeevan kumar\\eclipse-workspace\\Propertiesfile\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}
	else if(ch.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jeevan kumar\\eclipse-workspace\\Propertiesfile\\Drivers\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}
	
		
	}
	@Test
	public void run() {
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		}

}
