package sams.work.rssbEvaluation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends Base{
	
	@FindBy(xpath = "//span[contains(.,'Welcome to Facebook')]")
	WebElement welcomeMsg;
	
	public WelcomePage()
	{
		PageFactory.initElements(dr, this);
	}
	
	public String getWelcomeMsg()
	{
		return welcomeMsg.getText();
	}

}
