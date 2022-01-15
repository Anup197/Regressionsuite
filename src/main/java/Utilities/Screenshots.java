package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Pojo.Callbrowser;

public class Screenshots {
 public static void takescreenshot(WebDriver driver, String name) throws IOException {
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\RegressionSuite\\Screenshots_test"+name+".png");
	FileHandler.copy(source, destination);
	
 }
}
