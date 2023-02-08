package sams.work.rssbEvaluation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonDriver {
	
	private static WebDriver dr;
	
	private SingletonDriver() {}
	
	public static WebDriver getSingletonInstance()
	{
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		return dr;
	}
	

}
