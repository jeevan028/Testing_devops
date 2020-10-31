package First.Second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PFwithoutNG {
	static WebDriver driver;
	static String bro=System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Data.properties");
		pro.load(fis);
        System.setProperty("webdriver.chrome.driver",bro +"//Drivers//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(pro.getProperty("url"));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
        driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}

}
