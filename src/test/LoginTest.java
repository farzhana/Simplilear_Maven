package test;

import org.testng.annotations.Test;
import Pages.LoginPage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(TestNgListnerEx.class)

public class LoginTest extends BaseClass{	
	
	
	@Test(enabled = false)
	@Parameters({"username" , "password"})
		public void LoginTst(String uname , String pass) {
		
		LoginPage loginobj = new LoginPage();
		
		loginobj.Login(uname, pass);
	}
	
	
	@Test
	public void LoginTst2() {
		
		LoginPage loginobj = new LoginPage();
		
		
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		loginobj.Login(uname, pass);
	}
	
		
		
		
					
			
		
}
