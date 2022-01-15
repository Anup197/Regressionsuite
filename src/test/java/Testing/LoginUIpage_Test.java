package Testing;
//org.testng.annotations;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.reporters.jq.ResultsByClass;

import POM.Pom;
import Pojo.Callbrowser;
import Utilities.Parameterization;
import Utilities.Screenshots;
//@org.testng.annotations.Listeners
@org.testng.annotations.Listeners(Testing.Listeners.class)
public class LoginUIpage_Test {
    WebDriver driver;
	//static Logger log = Logger.getLogger(LoginUIpage_Test.class.getName());
//    @BeforeMethod
//	public void loginwithCredential() {
//		 driver = Callbrowser.launchBrowser();
//	}
	
//	@AfterClass
//	public void afterclassprint() {
//		System.out.println("test runned");
//	}
//	
	@Test(priority=-1)
	public void testwithgiven_CredentialonUI() throws EncryptedDocumentException, IOException {
//		Pom test = new Pom(driver);
//		//String email = Parameterization.getData(0, 0);
//		test.enterUserId("Anup");
//		//log.info("username is add successfully");
//		//String passw = Parameterization.getData(1, 1);
//		test.enterPASSWORD("12346");
//		//log.info("password is entered successfully");
//		test.clickLginbutton();
//		
		System.out.println("1st test");
	}
	
	@Test(timeOut = 1000)
	public void test2() throws InterruptedException {
		
		System.out.println("testing");
		Thread.sleep(2000);
	}
	
	@Test()
	public void test3() {
		System.out.println("testing still going");
	}
	
	
	@AfterMethod
	public void takesnap(ITestResult result ) throws IOException {
		try {
			
		if(result.getStatus()==ITestResult.FAILURE)
		Screenshots.takescreenshot(driver, result.getName());
	  
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	
}
