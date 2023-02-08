package sams.work.rssbEvaluation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Base {
	
	static WebDriver dr = null;
	
	public Base()
	{
		dr = SingletonDriver.getSingletonInstance();
	}
	
	public void initApp()
	{
		String URL = getProperty("URL");
		accessURL(URL);
	}
	
	public static void accessURL(String URL)
	{
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get(URL);
		
	}

}
