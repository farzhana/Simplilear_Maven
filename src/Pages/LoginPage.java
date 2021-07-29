package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.LoginTest;


public class LoginPage {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	//----------WebElement-----------
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement Username;
	
	@FindBy(name = "user_pwd")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	
	@FindBy(name = "btn_login")
	WebElement Login;
	
	//@FindBy(id = "msg_box")
	//WebElement Error;
	
	
	
	
	
	
	//-----------Constructor---------------
	
	public LoginPage() {
				
		driver = LoginTest.driver;
		report = LoginTest.report;
		test = LoginTest.test;
		
		PageFactory.initElements(this.driver,this);
	}
	

	//---------Method---------------------
	
	public void Login(String uname, String pass) {
		
		test = report.startTest("Login Test Case");
		
		//WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		test.log(LogStatus.PASS,"Successfully clicked on login link");
		
		
		
		//WebElement Username = driver.findElement(By.name("user_login"));		
		Username.sendKeys(uname);
		test.log(LogStatus.PASS,"Successfully enetered userrname");
		
		
		
		//WebElement password = driver.findElement(By.name("user_pwd"));		
		Password.sendKeys(pass);
		test.log(LogStatus.PASS,"Successfully enetered password");
		
		

		//WebElement RememberMe = driver.findElement(By.className("rememberMe"));		
		RememberMe.click();
		test.log(LogStatus.PASS,"Successfully checked on Remember Me ");

		//WebElement Login = driver.findElement(By.name("btn_login"));		
		Login.click();
		test.log(LogStatus.PASS,"Successfully clicken login button ");
		
		
		/*
		//WebElement Error = driver.findElement(By.id("msg_box"));		
		String ActMsg = Error.getText();		
		String ExpMsg = "The email or password you have entered is invalid.";
		
				
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActMsg,  ExpMsg);
		
		//soft.assertEquals(ActMsg,  ExpMsg);
				//System.out.println("After soft assertion");
		
	
		try {
			Assert.assertEquals(ActMsg , ExpMsg);
			test.log(LogStatus.PASS,"Actual message And Expected Message matches");
		}
		catch(Throwable e) {
			test.log(LogStatus.FAIL,"Actual message And Expected Message does not matches");
		}
		*/
	}
		

	}

