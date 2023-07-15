package Amzon_Automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Driver_Class 
{
	public static WebDriver d;
	
	public static void Driver()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.get("http://www.amazon.com/");
	}

}
