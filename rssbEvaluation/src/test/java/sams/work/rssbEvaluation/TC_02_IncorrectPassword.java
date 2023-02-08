package sams.work.rssbEvaluation;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_02_IncorrectPassword extends Base{

	static Login login = new Login();
	static WelcomePage welcome = new WelcomePage();
	static Validations message = new Validations();
	
	public TC_02_IncorrectPassword()
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

@AfterMethod
public void afterMethod()
{
	System.out.println("After Method");
	dr.close();
}

}
