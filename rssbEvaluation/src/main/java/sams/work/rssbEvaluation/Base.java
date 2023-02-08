package sams.work.rssbEvaluation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	
	static WebDriver dr = null;
	
	public Base()
	{
		dr = Singleton.getSingletonIns();
	}
	
	public void initDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream files = new FileInputStream("src/main/resources/configs.properties");
		prop.load(files);
		String URL = prop.getProperty("URL");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get(URL);
	}
	
	public static void enterText(WebElement el, String text)
	{
		el.sendKeys(text);
	}
	
	public static void click(WebElement el)
	{
		el.click();
	}
	

}
