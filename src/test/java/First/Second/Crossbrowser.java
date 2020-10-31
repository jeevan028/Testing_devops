package First.Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	WebDriver driver;
	String broW=System.getProperty("user.dir");

	@BeforeClass
	@Parameters ({"browser"})
	public void setup(String myb) {
		
	
	if (myb.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",broW +".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
	}
	else if (myb.equalsIgnoreCase("ff")){
		System.setProperty("webdriver.gecko.driver",broW +".//Drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		
	}
	}

	@Test
	public void run() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}
}


