package sams.work.rssbEvaluation;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_04_EmptyCredentials extends Base {

	static Login login = new Login();
	static WelcomePage welcome = new WelcomePage();
	static Validations message = new Validations();
	
	public TC_04_EmptyCredentials()
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
	System.out.println("After Method");
	dr.close();
}


}


