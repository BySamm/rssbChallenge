package sams.work.rssbEvaluation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_05_InvalidURL {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://web.facebook.com/homepage");
		
		String unavailabe = dr.findElement(By.xpath("//span[contains(.,\"This content isn't\")]")).getText();
		System.out.println(unavailabe);

		Assert.assertEquals(unavailabe, "This content isn't available right now");
		
		dr.close();
	}
	


}
