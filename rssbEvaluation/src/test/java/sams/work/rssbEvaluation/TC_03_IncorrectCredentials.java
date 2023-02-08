package sams.work.rssbEvaluation;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_03_IncorrectCredentials extends Base{
	
	static Login login = new Login();
	static WelcomePage welcome = new WelcomePage();
	static Validations message = new Validations();
	
	public TC_03_IncorrectCredentials()
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

@AfterMethod
public void afterMethod()
{
	System.out.println("After Method");
	dr.close();
}

}
