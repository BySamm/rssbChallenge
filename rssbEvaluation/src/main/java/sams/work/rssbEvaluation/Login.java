package sams.work.rssbEvaluation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base{
	
	@FindBy(xpath = "//input[@id='email']") WebElement userEmail;
	
	@FindBy(xpath = "//input[@id='pass']") WebElement passKey;
	
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement submit;
	
	public Login()
	{
		PageFactory.initElements(dr, this);
	}
	
	public void enterUserName(String userName)
	{
		enterText(userEmail, userName);
	}
	
	public void enterPassword(String password)
	{
		enterText(passKey, password);
	}
	
	public void submit()
	{
		click(submit);
	}
	
}
