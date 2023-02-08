package sams.work.rssbEvaluation;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC_01_SuccessfulLogin extends Base {
	
	static Login login = new Login();
	static WelcomePage welcome = new WelcomePage();
	static Validations message = new Validations();
	
	public TC_01_SuccessfulLogin()
	{
		super();
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		initDriver();
		System.out.println("Before Method");
	}
	
@Test
public void validLogin()
{	
	String welcomeMsg = null;
	login.enterUserName("mbasambam1@gmail.com");
	login.enterPassword("JustForTest@1");
	login.submit();
	welcomeMsg = welcome.getWelcomeMsg();
	System.out.println(welcomeMsg);
	AssertJUnit.assertEquals(welcomeMsg, "Welcome to Facebook, Sam");	
}

@AfterMethod
public void afterMethod()
{
	dr.close();
	System.out.println("After Method");
}


}
