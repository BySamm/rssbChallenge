package sams.work.rssbEvaluation;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllTests extends Base{
	
	static Login login = new Login();
	static WelcomePage welcome = new WelcomePage();
	static Validations message = new Validations();
	
	public AllTests()
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
	System.out.println("AM INNNNNN");
	login.enterUserName("mbasambam1@gmail.com");
	login.enterPassword("Sagamba@123.");
	login.submit();
	welcomeMsg = welcome.getWelcomeMsg();
	System.out.println(welcomeMsg);
	AssertJUnit.assertEquals(welcomeMsg, "Welcome to Facebook, Sam");	
}
	
@Test
public void incorrectPassword()
{
	String ErrMessage = null;
	login.enterUserName("mbasambam1@gmail.com");
	login.enterPassword("*ssd&dd@4dd@4dfajlkjleijijil");
	login.submit();
	ErrMessage = message.getIncorrectKeyMsg();
	System.out.println(ErrMessage);
	AssertJUnit.assertEquals(ErrMessage, "The password you’ve entered is incorrect. Forgot Password?");		
}

@Test
public void incorrectCredentials()
{
	String ErrMessage = null;
	login.enterUserName("maageagamdsa@gmail.com");
	login.enterPassword("*ssd&dd@4dd@4dfajlkjleijijil");
	login.submit();
	ErrMessage = message.getIncorrectCredsMsg();
	System.out.println(ErrMessage);
	AssertJUnit.assertEquals(ErrMessage, "The email you entered isn’t connected to an account. Find your account and log in.");	
}

@Test
public void emptyCredentials()
{
	String ErrMessage = null;
	login.submit();
	ErrMessage = message.getEmptyCredsMsg();
	System.out.println(ErrMessage);
	AssertJUnit.assertEquals(ErrMessage, "The email or mobile number you entered isn’t connected to an account. Find your account and log in.");
}


@AfterMethod
public void afterMethod()
{
	dr.close();
	System.out.println("After Method");
}

}
