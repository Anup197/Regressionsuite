package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Callbrowser {

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
}
