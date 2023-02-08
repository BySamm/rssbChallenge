package sams.work.rssbEvaluation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validations extends Base{
	
	@FindBy(xpath = "//div[contains(text(),\"The password you’ve entered is incorrect.\")]")
	WebElement incorrectKey;
	
	@FindBy(xpath = "//div[contains(text(),\"The email you entered\")]")
	WebElement incorrectCreds;
	
	@FindBy(xpath = "//div[contains(text(),\"The email or mobile\")]")
	WebElement emptyCreds;
	
	public Validations()
	{
		PageFactory.initElements(dr, this);
	}
	
	public String getIncorrectKeyMsg()
	{
		return incorrectKey.getText();
	}
	
	public String getIncorrectCredsMsg()
	{
		return incorrectCreds.getText();
	}
	
	public String getEmptyCredsMsg()
	{
		return emptyCreds.getText();
	}

}
