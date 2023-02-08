package sams.work.rssbEvaluation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singleton {
	
	private static WebDriver dr;
	
	private Singleton() {}
	
	public static WebDriver getSingletonIns()
	{
		if (null == dr)
		{
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
		}
		return dr;
	}	

}
