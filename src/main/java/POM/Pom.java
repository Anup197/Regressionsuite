package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
@FindBy(xpath = "//img[@src=\"/static/images/kite-logo.svg\"]") private WebElement image;
@FindBy(xpath = "//input[@id=\"userid\"]") private WebElement userId;
@FindBy(xpath= "//input[@id=\"password\"]") private WebElement passWord;
@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement login;
@FindBy(xpath = "//a[text()='Forgot password?']") private WebElement fogetpasslink;
@FindBy(xpath = "//img[@src=\"/static/images/android.svg\"]") private WebElement playstore;
@FindBy(xpath = "//img[@src=\"/static/images/apple.svg\"]") private WebElement applesign;
@FindBy(xpath = "//img[@src=\"/static/images/zerodha-logo.svg\"]") private WebElement zerodhalogo;
@FindBy(xpath = "(//p//a)[3]") private WebElement donthavaccount;

public Pom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public boolean imagevisibiiltyCheck() {
	return image.isDisplayed();
	
}

public void enterUserId(String email) {
	userId.sendKeys(email);
}

public void enterPASSWORD(String passw) {
	passWord.sendKeys(passw);
}

public void clickLginbutton() {
	login.click();
}

public void forgetPAsaword() {
	fogetpasslink.click();
}

public boolean checkplaystorelog() {
	return playstore.isDisplayed();
}

public boolean applesign() {
	return applesign.isDisplayed();
}

public boolean checklogoZerodha() {
	return zerodhalogo.isDisplayed();
}

public void donthavaccount() {
	donthavaccount.click();
}
}
